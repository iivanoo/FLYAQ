package it.univaq.flyaq.rest.session;

import it.univaq.flyaq.rest.util.RestUtil;

import java.util.HashMap;
import java.util.Map;

public class Sessions {

	private Map<String, Session> sessions;
	
	private static Sessions instance;
	
	private Sessions() {
		this.sessions = new HashMap<String, Session>();
	}
	
	public static String addSession() {
		if (instance == null) {
			instance = new Sessions();
		}
		Session tempSession = new Session();
		instance.sessions.put(tempSession.getSessionID(), tempSession);
		return tempSession.getSessionID();
	}
	
	public static Session getSession(String sessionID) {
		if (instance == null) {
			instance = new Sessions();
		}
		return instance.sessions.get(sessionID);
	}
	
	public static boolean existsSession (String sessionID)  {
		if (getSession(sessionID) != null)
			return true;
		else return false;
	}
	
	public static String idToJson(String ID) {
		StringBuilder id = new StringBuilder();

		return id.append("{ ")
				.append(RestUtil.surroundBy("ID", "\""))
				.append(" : ")
				.append(RestUtil.surroundBy(ID, "\""))
				.append(" }")
				.toString();
	}
}
