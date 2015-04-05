package it.univaq.flyaq.flightinstructor.topics;

public class Command {
	
	public static int IS_ALIVE = 0;
	public static int IS_MISSION_LOADED = 1;
	public static int SETUP_DRONE = 2;
	public static int START_MISSION = 3;
	public static int STOP_MISSION = 4;

	private int command;
	private String drone;

	public Command() {
		
	}

	public Command(int command, String drone) {
		super();
		this.command = command;
		this.drone = drone;
	}

	public static int getIS_ALIVE() {
		return IS_ALIVE;
	}

	public static void setIS_ALIVE(int iS_ALIVE) {
		IS_ALIVE = iS_ALIVE;
	}

	public static int getIS_MISSION_LOADED() {
		return IS_MISSION_LOADED;
	}

	public static void setIS_MISSION_LOADED(int iS_MISSION_LOADED) {
		IS_MISSION_LOADED = iS_MISSION_LOADED;
	}

	public static int getSETUP_DRONE() {
		return SETUP_DRONE;
	}

	public static void setSETUP_DRONE(int sETUP_DRONE) {
		SETUP_DRONE = sETUP_DRONE;
	}

	public static int getSTART_MISSION() {
		return START_MISSION;
	}

	public static void setSTART_MISSION(int sTART_MISSION) {
		START_MISSION = sTART_MISSION;
	}

	public static int getSTOP_MISSION() {
		return STOP_MISSION;
	}

	public static void setSTOP_MISSION(int sTOP_MISSION) {
		STOP_MISSION = sTOP_MISSION;
	}

	public int getCommand() {
		return command;
	}

	public void setCommand(int command) {
		this.command = command;
	}

	public String getDrone() {
		return drone;
	}

	public void setDrone(String drone) {
		this.drone = drone;
	}
}
