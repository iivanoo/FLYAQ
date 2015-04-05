package it.univaq.flyaq.flightinstructor.topics;

public class CommandReturn {
	
	public static int FAIL = 0;
	public static int SUCCESS = 1;

	private int status;
	private String message;
	private String drone;

	public CommandReturn() {
		
	}
	
	public CommandReturn(int status, String message) {
		this.status = status;
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getDrone() {
		return drone;
	}

	public void setDrone(String drone) {
		this.drone = drone;
	}

}
