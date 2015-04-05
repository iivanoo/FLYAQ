package it.univaq.flyaq.flightinstructor;

import edu.wpi.rail.jrosbridge.Ros;
import it.univaq.flyaq.flightinstructor.behaviour.BehaviourManager;
import it.univaq.flyaq.flightinstructor.command.DroneCommandsManager;
import it.univaq.flyaq.flightinstructor.utils.Logger;

public class FlightInstructor {

	public static String rosBridgeHostname;
	public static int rosBridgePort;
	public static Ros ros;
	private static boolean missionRunning;

	public static void main(String[] args) {

		if (args.length == 0 || args.length < 2) {
			System.out.println("Error - please provide the rosBridgeHostname and the rosBridgePort");
			System.exit(-1);
		} else {
			try {
				Logger.log(Logger.INFO, "Flight Instructor starting...");
				FlightInstructor.rosBridgeHostname = args[0];
				FlightInstructor.rosBridgePort = Integer.parseInt(args[1]);
				
				FlightInstructor.ros = new Ros(FlightInstructor.rosBridgeHostname, FlightInstructor.rosBridgePort);
			    ros.connect();
				
				// with this we subscribe to the /behaviour topic
				BehaviourManager behaviourManager = new BehaviourManager();
				behaviourManager.start();
				
				DroneCommandsManager droneManager = new DroneCommandsManager();
				droneManager.start();
				
				Logger.log(Logger.INFO, "Flight instructor running...");
				// keep this thread alive
			    while (true) {
					Thread.sleep(500);
				}
			} catch (Exception e) {
				Logger.log(Logger.ERROR, e.getMessage());
				e.printStackTrace();
			}
		}
	}
	
	public static boolean isMissionRunning() {
		return FlightInstructor.missionRunning;
	}
	
	public static void setMissionRunning(boolean missionRunning) {
		FlightInstructor.missionRunning = missionRunning;
	}

}
