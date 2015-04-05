var ROSLIB = require('./lib/roslib.js');
var GreatCircle = require('./lib/GreatCircle.js');

var df = require('dateformat');

var autonomy = require('../ardrone-autonomy-master/');
var arDrone = require('../ardrone-autonomy-master/node_modules/ar-drone');
var arDroneConstants = require('../ardrone-autonomy-master/node_modules/ar-drone/lib/constants');
var fs = require('fs');

var start = function(controller) {
      console.log("Mission starting...");
      controller.missionRunning = true;

      var mission  = createMissionFromBehaviour(controller.behaviourManager.behaviour);

      executeMission(mission);
};

var stop = function(controller) {
      controller.missionRunning = false;
      controller.isMissionRunning = false;
      controller.behaviourManager.reset();
};

exports.start = start;
exports.stop = stop;

function executeMission(mission) {
      log(mission);

      // Land on ctrl-c
      var exiting = false;
      process.on('SIGINT', function() {
          if (exiting) {
              process.exit(0);
          } else {
              console.log('Got SIGINT. Landing, press Control-C again to force exit.');
              exiting = true;
              mission.control().disable();
              mission.client().land(function() {
                  process.exit(0);
              });
          }
      });

      function navdata_option_mask(c) {
            return 1 << c;
      }

      function log(mission) {
        var ekf = mission.control()._ekf;

        mission.control().on('controlData', function(d) {
            var log = (d.state.x + "," +
                       d.state.y + "," +
                       d.state.z + "," +
                       d.state.yaw + "," +
                       d.state.vx + "," +
                       d.state.vy + "," +
                       d.goal.x + "," +
                       d.goal.y + "," +
                       d.goal.z + "," +
                       d.goal.yaw + "," +
                       d.error.ex + "," +
                       d.error.ey + "," +
                       d.error.ez + "," +
                       d.error.eyaw + "," +
                       d.control.ux + "," +
                       d.control.uy + "," +
                       d.control.uz + "," +
                       d.control.uyaw + "," +
                       d.last_ok + "," +
                       d.tag);

            if (d.tag > 0) {
                log = log + "," +
                      ekf._s.x + "," +
                      ekf._s.y + "," +
                      ekf._s.yaw.toDeg() + "," +
                      ekf._m.x + "," +
                      ekf._m.y + "," +
                      ekf._m.yaw.toDeg() + "," +
                      ekf._z.x + "," +
                      ekf._z.y + "," +
                      ekf._z.yaw.toDeg() + "," +
                      ekf._e.x + "," +
                      ekf._e.y + "," +
                      ekf._e.yaw.toDeg();
            } else {
                log = log + ",0,0,0,0,0,0";
            }

            console.log(log);
        });
      }

      // From the SDK.
      var navdata_options = (
          navdata_option_mask(arDroneConstants.options.DEMO)
        | navdata_option_mask(arDroneConstants.options.VISION_DETECT)
        | navdata_option_mask(arDroneConstants.options.MAGNETO)
        | navdata_option_mask(arDroneConstants.options.WIFI)
      );

      // Connect and configure the drone
      mission.client().config('control:outdoor', true);
      mission.client().config('control:flight_without_shell', false);
      mission.client().config('general:navdata_demo', true);
      mission.client().config('general:navdata_options', navdata_options);
      mission.client().config('control:altitude_max', 10000);
      mission.client().config('control:control_yaw', 1.0);
      mission.client().config('control:euler_angle_max', 0.15);
      mission.client().config('video:video_channel', 0);
      mission.client().config('detect:detect_type', 12);

      // Ftrim
      console.log("Calibrating gyros. Please, wait for 5 seconds...");
      mission.client().ftrim();

      setTimeout(runMission, 5000);

      function runMission() {
        mission.run(function (err, result) {
            if (err) {
                console.trace("Oops, something bad happened: %s", err.message);
                mission.control().disable();
                mission.client().stop();
                mission.client().land();
            } else {
                console.log("We are done!");
                process.exit(0);
            }
        });
      }

}

function createMissionFromBehaviour(behaviour) {
      var mission  = autonomy.createMission();

      var movements = behaviour.drones[0].movements;
      var transitions = behaviour.drones[0].move_transitions;
      var startMovement = getMovement('start');

      var nextMovement = getMovement(getTransitionFrom(transitions, startMovement.name).to_move_name);

      var orderedMovements = reorderMovements([startMovement], transitions, nextMovement);

      var currentPosition = {
            latitude: behaviour.drones[0].home.latitude,
            longitude: behaviour.drones[0].home.longitude
      };

      var currentAttitude = {
            position: currentPosition,
            heading: 0
      };

      for (var i = 0; i < orderedMovements.length; i++) {
            currentAttitude = addMovementToMission(mission, orderedMovements[i], currentPosition);
      }

      return mission;

       function reorderMovements(moves, transitions, lastElement) {
            if(lastElement.name === 'stop') {
                  moves.push(lastElement);
                  return moves;
            }

            var currentTransition = getTransitionFrom(transitions, lastElement.name);

            var from = getMovement(currentTransition.from_move_name);
            var to = getMovement(currentTransition.to_move_name);

            moves.push(from);

            return reorderMovements(moves, transitions, to);
       }

       function getMovement(elementName) {
            var elementIndex = 0;
            var found = false;
            var i = 0;
            while(i < movements.length && !found) {
                  if(movements[i].name === elementName) {
                        found = true;
                  } else {
                        i++;
                  }
            }
            return movements[i];
       }

       function getTransitionFrom(transitions, elementName) {
            var elementIndex = 0;
            var found = false;
            var i = 0;
            while(i < transitions.length && !found) {
                  if(transitions[i].from_move_name === elementName) {
                        found = true;
                  } else {
                        i++;
                  }
            }
            return transitions[i];
       }

       function addMovementToMission(mission, movement, currentPosition) {
            var movementType = movement.type;
            // movementType = 10;
            console.log(movement);

            switch(movementType) {
            // START
            case 0:
                  // no action
                  break;
            // STOP
            case 1:
                  // no action
                  break;
            // TAKE_OFF
            case 2:
                  mission.takeoff()
                  //.hover(500)
                  .zero()
                  .altitude(movement.altitude);
                  //.hover(500);
                  break;
            // LAND
            case 3:
                  mission
                  .hover(500)
                  .land();
                  break;
            // GO_TO
            case 4:
                  var distance = GreatCircle.lib.distance(
                        currentAttitude.position.latitude,
                        currentAttitude.position.longitude,
                        movement.target_position.latitude,
                        movement.target_position.longitude) * 1000;
                  var bearing = GreatCircle.lib.bearing(
                        currentAttitude.position.latitude,
                        currentAttitude.position.longitude,
                        movement.target_position.latitude,
                        movement.target_position.longitude);

                  var altitude = movement.target_position.altitude;

                  distance = distance * 0.9;
                  
                  //movement.name = 'PhotoGridTask';
                  //altitude = 4;

                  console.log('CurrentPosition: [' + currentAttitude.position.latitude + ', ' + currentAttitude.position.longitude + ']');
                  console.log('Distance: ' + distance);
                  console.log('Altitude: ' + altitude);

                  mission.altitude(altitude);

                  var newHeading = bearing - currentAttitude.heading;

                  console.log('Heading: ' + newHeading);

                  mission.hover(500);

                  if(newHeading >= 0) {
                        mission.cw(newHeading);
                  } else {
                        mission.ccw(newHeading * (-1));
                  }

                  mission.hover(500);
                  mission.forward(distance);
                  mission.hover(500);

                  var pos = {
                        latitude: movement.target_position.latitude,
                        longitude: movement.target_position.longitude
                  };

                  currentAttitude = {
                        position: pos,
                        heading: bearing
                  };

                  break;
            // HOVER
            case 5:
                  mission.hover(duration);
                  break;
            // CIRCLE
            case 6:
                  // CIRCLE is not implemented yet
                  break;
            // HEAD_TO
            case 6:
                  // HEAD_TO is not implemented yet
                  break;
            }

            // manage photos (this is pretty ad-hoc)
            if(movement.name.indexOf('Photo') > -1) {
                  //mission.altitude(5);//.hover(500);
                  for (var i = 0; i < 4; i++) {
                         mission.task(takePicture)
                                .cw(90);
                  }
                  //mission.altitude(4);//.hover(500);
            }

            // Function to take pictures
            function takePicture(callback) {

                // First we disable the control to have the drone in stable
                mission.control().disable();

                // Wait for a new image
                setTimeout(function() {
                    mission.client().getPngStream().once('data', function(data) {

                          var fileName = 'photo_' + Date.now() + '.png';
                          // Save the file
                          fs.writeFile(fileName, data, function(err) {
                            if (err) {
                              console.log(err);
                            }
                            console.log('PHOTO: ' + fileName + ' Saved');
                            // Renable the control
                            callback();
                          });
                    });
                }, 1000);
            }

            return currentAttitude;
       }
}