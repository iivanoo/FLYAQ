//var ROSLIB = require('./lib/roslib.js');
var ROSLIB = require('roslib');

var Controller = function() {
	return {
		rosHost: undefined,
		rosPort: undefined,
		rosUrl: undefined,
		droneName: undefined,
		ros: undefined,
		missionRunning: undefined,
		
		commandTopic: undefined,
		commandReturnTopic: undefined,
		isMissionRunning: undefined,

		behaviourManager: undefined,
		commandManager: undefined,

		start: function() {
			var args = process.argv.slice(2);
			if(args.length == 1 && (args[0] == '-h' || args[0] == '--help')) {
				printHelp();
			}

			if(args.length != 3) {
				console.log('Error - please provide the rosBridgeHostname, the rosBridgePort, and the drone name');
				printHelp();
			} else {
				startController();
			}

			function startController() {
				console.log('Parrot controller starting...');
				this.rosHost = args[0];
				this.rosPort = args[1];
				this.droneName = args[2];

				this.rosUrl = 'ws://' + rosHost + ':' + rosPort;

			    this.ros = new ROSLIB.Ros({
			        url: this.rosUrl
			    });

			    this.behaviourManager = require('./behaviour_manager.js');
			    this.behaviourManager.start(this);
			    this.commandManager = require('./command_manager.js');
			    this.commandManager.start(this);
				

				function printHelp () {
				  console.log('   usage:');
				  console.log(' $ node flyaq_parrot_controller.js <rosBridgeHostname> <rosBridgePort> <droneName>');
				  console.log('   example:');
				  console.log(' $ node flyaq_parrot_controller.js 127.0.0.1 9090 parrot1');
				  process.exit(0);
				}
			}
		}
	}
};

var controller = new Controller();
controller.start();