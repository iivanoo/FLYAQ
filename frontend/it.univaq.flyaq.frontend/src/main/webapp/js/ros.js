// equivalent to Java's String.endsWith
String.prototype.endsWith = function(suffix) {
  return this.indexOf(suffix, this.length - suffix.length) !== -1;
};

var ROS = function() {
  return {
    rosHost: undefined,
    rosPort: undefined,
    rosUrl: undefined,
    ros: undefined,
    behaviourTopic: undefined,
    commandTopic: undefined,
    commandReturnTopic: undefined,
    isMissionRunning: false,
    executingDrone: undefined,

    init: function(url, port) {
      this.reset();
      this.rosHost = url;
      this.rosPort = port;
      this.rosUrl = 'ws://' + this.rosHost + ':' + this.rosPort;
      this.ros = new ROSLIB.Ros({
        url: this.rosUrl
      });

      this.behaviourTopic = new ROSLIB.Topic({
        ros: this.ros,
        name: '/behaviour',
        messageType: 'flyaq/Behaviour'
      });

      this.commandTopic = new ROSLIB.Topic({
        ros: this.ros,
        name: '/command',
        messageType: 'flyaq/Command'
      });

      this.commandReturnTopic = new ROSLIB.Topic({
        ros: this.ros,
        name: '/command_return',
        messageType: 'flyaq/CommandReturn'
      });
      
      var self = this;
      
      this.commandReturnTopic.subscribe(function(message) {
    	  if(message.message == 'Mission correctly loaded') {
	    	  var drone = message.drone; 
	          var command = 3;
	    	  self.sendCommand(drone, command);
	    	  self.isMissionRunning = true;
	    	  self.executingDrone = drone;
	    	  return;
    	  }
    	  if(message.message == 'Mission correctly stopped') {
	    	  self.isMissionRunning = false;
	    	  self.executingDrone = undefined;
	    	  // TODO cleanup all the runtime data
	    	  return;
    	  }
      });
      
      
      return this;
    },
    
    reset: function() {
        this.rosHost = undefined;
        this.rosPort = undefined;
        this.rosUrl = undefined;
        this.ros = undefined;

        this.behaviourTopic = undefined;
        this.commandTopic = undefined;
        if(this.commandReturnTopic) {
            this.commandReturnTopic.unsubscribe();
        	this.commandReturnTopic = undefined;
        }      
    },
    
    sendCommand: function(drone, command) {
    	var message = new ROSLIB.Message({});
    	message.drone = drone;
    	message.command = command;
        this.commandTopic.publish(message);
    },

    startMission: function() {
      this.behaviourTopic.publish(this.createBehaviourMessage());
    },
    
    stopMission: function() {
    	if(this.isMissionRunning) {
    	  	this.sendCommand(this.executingDrone, 4);
    	}
    },

    createBehaviourMessage: function() {

      var message = new ROSLIB.Message({});

      // here we set all the attributes and inner objects of the behaviour message
      message.name = flyaq.behaviour.name;
      message.crs = flyaq.behaviour.crs;
      message.drones = [];
      for (var i = 0; i < flyaq.behaviour.drones.length; i++) {
        message.drones.push(createDrone(flyaq.behaviour.drones[i]));
      }
      console.log(flyaq.behaviour);
      console.log(message);
      return message;

      function createDrone(object) {
        var travel_mode = {
          "SAFE": 0,
          "NORMAL": 1,
          "AGGRESSIVE": 2
        };
        var drone = {};
        drone.name = object.name;
        drone.type_name = object.typeName;
        drone.travel_mode = travel_mode[object.travelMode];
        drone.home = createCoordinate(object.home);
        drone.movements = [];
        for (var i = 0; i < object.movements.length; i++) {
          drone.movements.push(createMovement(object.movements[i]));
        }
        drone.move_transitions = [];
        for (var i = 0; i < object.moveTransitions.length; i++) {
          drone.move_transitions.push(createMoveTransition(object.moveTransitions[i], object));
        }
        drone.slot_names = [];
        if(object.slots) { 
          for (var i = 0; i < object.slots.length; i++) {
            drone.slot_names.push(object.slots[i].name);
          }
        }
        return drone;
      }

      function createMovement(object) {
        var move_strategy = {
          "DIRECT": 0,
          "HORIZONTAL_FIRST": 1,
          "VERTICAL_FIRST": 2
        };
        var movement = {};
        movement.name = object.name;
        // remove all spaces within the name
        movement.name = movement.name.replace(" ", "");
        // pre_actions
        if(movement.pre_actions) {
          movement.pre_actions = [];
          for (var i = 0; i < movement.preActions.length; i++) {
            movement.pre_actions.push(createAction(movement.preActions[i]));
          }
        }
        // post_actions
        if(movement.post_actions) {
          movement.post_actions = [];
          for (var i = 0; i < movement.postActions.length; i++) {
            movement.post_actions.push(createAction(movement.postActions[i]));
          }
        }
        if (object.eClass.endsWith("Start")) {
          movement.type = 0; // Start enumeration element
        }
        if (object.eClass.endsWith("Stop")) {
          movement.type = 1; // Stop enumeration element
        }
        if (object.eClass.endsWith("TakeOff")) {
          movement.type = 2; // TakeOff enumeration element
          movement.altitude = object.altitude;
        }
        if (object.eClass.endsWith("Land")) {
          movement.type = 3; // Land enumeration element
        }
        if (object.eClass.endsWith("GoTo")) {
          movement.type = 4; // GoTo enumeration element
          movement.target_position = createCoordinate(object.targetPosition);
          movement.strategy = move_strategy[object.strategy];
        }
        if (object.eClass.endsWith("Hover")) {
          movement.type = 5; // Hover enumeration element
          movement.duration = object.duration;
        }
        if (object.eClass.endsWith("Circle")) {
          movement.type = 6; // Circle enumeration element
          movement.target_position = createCoordinate(object.targetPosition);
          movement.duration = object.duration;
          movement.radius = object.radius;
          movement.altitude = object.altitude;
          movement.clockwise = object.clockwise ? object.clockwise : false;
        }
        if (object.eClass.endsWith("HeadTo")) {
          movement.type = 7; // HeadTo enumeration element
          movement.direction = object.direction;
        }
        return movement;
      }

      function createAction(object) {
        var action = {};
        action.name = object.name;
        var droneIndex, slotIndex;
        if (object.eClass.endsWith("DeviceAction")) {
          action.type = 0; // Device enumeration element
          action.action_name = object.actionName;
          if(action.parameters) {
            action.parameters = [];
            for (var i = 0; i < object.parameters.length; i++) {
              action.parameters.push(createParameter(object.parameters[i]));
            }
          }
        }
        if (object.eClass.endsWith("Feedback")) {
          action.type = 1; // Feedback enumeration element
          action.action_name = object.actionName;
        }
        if (object.eClass.endsWith("CheckNotification")) {
          action.type = 2; // CheckNotification enumeration element
        }
        if (object.eClass.endsWith("UnicastNotify")) {
          action.type = 3; // UnicastNotify enumeration element
          // receivers_name
          droneIndex = object.receiver.$ref.split("//@drones.")[1];
          action.receivers_name = flyaq.behaviour.drones[droneIndex].name;
        }
        if (object.eClass.endsWith("MulticastNotify")) {
          action.type = 4; // MulticastNotify enumeration element
          // receivers_name
          for(var i=0; i<object.receiver.length; i++) {
            droneIndex = object.receiver[i].$ref.split("//@drones.")[1];
            action.receivers_name = flyaq.behaviour.drones[droneIndex].name;
          }
        }
        if (object.eClass.endsWith("BroadcastNotify")) {
          action.type = 5; // BroadcastNotify enumeration element
        }
        // remove all spaces within the name
        action.action_name = action.action_name.replace(" ", "");
        // slot_name
        if(object.eClass.endsWith("Notify")) {
          droneIndex = object.slot.$ref.split("//@drones.")[1].split("/")[0];
          slotIndex = object.slot.$ref.split("/@slots.")[1].split("/")[0];
          action.slot_name = flyaq.behaviour.drones[droneIndex].slots[slotIndex].name;
        }
        return action;
      }

      function createMoveTransition(object, drone) {
        var moveTransition = {};
        if (object.eClass.endsWith("Choice")) {
          // is_choice
          moveTransition.is_choice = true;
          // condition_identifier
          moveTransition.condition_indentifier = object.conditionIdentifier;
          // false_branch_move_name
          var branchIndex = object.falseBranch.$ref.split("/@movements.")[1].split("/")[0];
          moveTransition.false_branch_move_name = drone.movements[branchIndex].name;
        } else {
          moveTransition.is_choice = false;
        }
        // wait_for_slot_name
        if(object.waitFor) {
          var droneIndex = object.waitFor.$ref.split("//@drones.")[1].split("/")[0];
          var slotIndex = object.waitFor.$ref.split("/@slots.")[1].split("/")[0];
          moveTransition.wait_for_slot_name = flyaq.behaviour.drones[droneIndex].slots[slotIndex].name;
        }
        // from_move_name
        var moveIndex = object.from.$ref.split("/@movements.")[1].split("/")[0];
        moveTransition.from_move_name = drone.movements[moveIndex].name;
        // to_move_name
        moveIndex = object.to.$ref.split("/@movements.")[1].split("/")[0];
        moveTransition.to_move_name = drone.movements[moveIndex].name;
        // fluid
        moveTransition.fluid = moveTransition.fluid ? object.fluid : false;
        return moveTransition;
      }

      function createCoordinate(object) {
        var coordinate = {};
        coordinate.latitude = object.latitude;
        coordinate.longitude = object.longitude;
        coordinate.altitude = object.altitude;
        coordinate.heading = object.heading;
        return coordinate;
      }

      function createParameter(object) {
        var parameter = {};
        parameter.key = object.key;
        parameter.value = object.value;
        return parameter;
      }
    }
  };
}();