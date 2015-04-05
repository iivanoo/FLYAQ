var ROSLIB = require('./lib/roslib.js');

var behaviourTopic;
var behaviour;

var start = function(controller) {
	behaviourTopic = new ROSLIB.Topic({
					ros: controller.ros,
					name: '/behaviour',
					messageType: 'flyaq/Behaviour'
				});

	var self = this;
      
	behaviourTopic.subscribe(function(message) {
        self.behaviour = message;
        controller.commandManager.sendCommandReturn(1, controller.droneName, 'Mission correctly loaded');
	});

	console.log('Behaviour manager started');
};

var reset = function() {
	behaviourTopic = undefined;
	behaviour = undefined;
};

exports.start = start;
exports.reset = reset;
exports.behaviour = behaviour;
