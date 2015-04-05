package it.univaq.flyaq.flightinstructor.behaviour;

import it.univaq.flyaq.flightinstructor.FlightInstructor;
import it.univaq.flyaq.flightinstructor.topics.behaviour.*;
import it.univaq.flyaq.flightinstructor.utils.Logger;
import edu.wpi.rail.jrosbridge.Topic;
import edu.wpi.rail.jrosbridge.callback.TopicCallback;
import edu.wpi.rail.jrosbridge.messages.Message;


public class BehaviourManager {
	
	private Topic behaviourTopic;
	private Behaviour behaviour;
	
	public void start() throws Exception {
		
		Logger.log(Logger.INFO, "Behaviour manager started");

	    this.behaviourTopic = new Topic(FlightInstructor.ros, "/behaviour", "flyaq/Behaviour");
//	    this.behaviourTopic.advertise();
//	    Message toSend = new Message("{\"data\": \"hello, world!\"}");
//	    echo.publish(toSend);
	    TopicCallback callback = new TopicCallback() {
	        @Override
	        public void handleMessage(Message message) {
	            //Logger.log(Logger.INFO, "RECEIVED BEHAVIOUR: " + message.toString());
	            behaviour = new Behaviour(message.toJsonObject());
	            Logger.log(Logger.INFO, behaviour.toString()); 
	        }
	    };
	    this.behaviourTopic.subscribe(callback);
	}

	public Behaviour getBehaviour() {
		return behaviour;
	}

	public void setBehaviour(Behaviour behaviour) {
		this.behaviour = behaviour;
	}
}
