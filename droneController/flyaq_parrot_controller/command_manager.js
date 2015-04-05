var ROSLIB = require('./lib/roslib.js');

var commandTopic;
var commandReturnTopic;

var missionExecutor = require('./mission_executor.js');

var start = function(controller) {
	commandTopic = new ROSLIB.Topic({
					ros: controller.ros,
					name: '/command',
					messageType: 'flyaq/Command'
				});
	commandReturnTopic = new ROSLIB.Topic({
					ros: controller.ros,
					name: '/command_return',
					messageType: 'flyaq/CommandReturn'
				});

	var self = this;
      
	commandTopic.subscribe(function(message) {
		var commandReceiver = message.drone;
		if(commandReceiver == controller.droneName || commandReceiver == 'ALL') {
			console.log('RECEIVED COMMAND: ' + message.command);
			var commandType = message.command;
			switch(commandType) {
            	// IS_ALIVE
            	case 0:
            		sendCommandReturn(1, controller.droneName, "I am alive");
            		break;
            	// IS_MISSION_LOADED
            	case 1:
            		sendCommandReturn(1, controller.droneName, "Mission correctly loaded");
            		break;
            	// SETUP_DRONE
            	case 2:
            		// so far this part is not implemented
            		break;
            	// START_MISSION
            	case 3:
            		// start the mission
            		sendCommandReturn(1, controller.droneName, "Mission starting...");
                        missionExecutor.start(controller);
            		break;
            	// STOP_MISSION
            	case 4:
                        missionExecutor.stop(controller);
            		sendCommandReturn(1, controller.droneName, "Mission correctly stopped");
            		//process.exit(0);
            }
		}
	});
};

function sendCommandReturn(outcome, drone, message) {
      var commandReturn = new ROSLIB.Message({
            outcome: outcome,
            drone: drone,
            message: message
      });
      commandReturnTopic.publish(commandReturn);
}

exports.start = start;
exports.sendCommandReturn = sendCommandReturn;