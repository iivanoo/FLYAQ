package it.univaq.flyaq.flightinstructor.command;

import it.univaq.flyaq.flightinstructor.FlightInstructor;
import it.univaq.flyaq.flightinstructor.utils.Logger;
import edu.wpi.rail.jrosbridge.Topic;
import edu.wpi.rail.jrosbridge.callback.TopicCallback;
import edu.wpi.rail.jrosbridge.messages.Message;

public class DroneCommandsManager {
	
	private Topic commandTopic;
	private Topic commandReturnTopic;
	private Topic commandReturnControllersTopic;
	
	public DroneCommandsManager() {
		//this.commandTopic = new Topic(FlightInstructor.ros, "/command", "std_msgs/String");
		//this.commandReturnTopic = new Topic(FlightInstructor.ros, "/command_return", "std_msgs/String");
	}

	public void start() throws Exception {

	    this.commandTopic = new Topic(FlightInstructor.ros, "/command", "flyaq/Command");
//	    this.commandTopic.advertise();
	    TopicCallback commandCallback = new TopicCallback() {
	        @Override
	        public void handleMessage(Message message) {
	            Logger.log(Logger.INFO, "RECEIVED COMMAND: " + message.toString());
	        }
	    };
	    this.commandTopic.subscribe(commandCallback);
	    
	    this.commandReturnTopic = new Topic(FlightInstructor.ros, "/command_return", "flyaq/CommandReturn");
//	    this.commandReturnTopic.advertise();
	    TopicCallback commandReturnCallback = new TopicCallback() {
	        @Override
	        public void handleMessage(Message message) {
	            Logger.log(Logger.INFO, "RECEIVED COMMAND RETURN: " + message.toString());
	        }
	    };
	    this.commandTopic.subscribe(commandReturnCallback);
	    
		Logger.log(Logger.INFO, "Command manager started");
	}
}
