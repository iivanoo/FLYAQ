package it.univaq.flyaq.rest.session;

import it.univaq.flyaq.context.Context;
import it.univaq.flyaq.mission.Mission;

import java.util.UUID;

public class Session {
	
	private String sessionID;
	
	private String jsonMission;
	private String jsonContext;
	
	private Context context;
	private Mission mission;
	
	//constructor
	public Session () {
		this.sessionID = UUID.randomUUID().toString();
	}
	
	public String getJsonMission() {
		return jsonMission;
	}

	public void setJsonMission(String jsonMission) {
		this.jsonMission = jsonMission;
	}

	public String getJsonContext() {
		return jsonContext;
	}

	public void setJsonContext(String jsonContext) {
		this.jsonContext = jsonContext;
	}

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	public Mission getMission() {
		return mission;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}

	public String getSessionID() {
		return sessionID;
	}
}
