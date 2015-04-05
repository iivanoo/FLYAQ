package it.univaq.flyaq.synthesizer.dronesMap;

import it.univaq.flyaq.drone.Drone;

import java.util.HashMap;
import java.util.Map;

public class DronesMap {
	
	private Map<String, Drone> dronesMap;

	private static DronesMap instance;

	private DronesMap() {
		this.dronesMap = new HashMap<String, Drone>();
	}

	private static DronesMap getInstance() {
		if (instance == null) {
			instance = new DronesMap();
		}
		return instance;
	}
	
	public static void addDrone (String droneName, Drone droneModel) {
		getInstance().dronesMap.put(droneName, droneModel);
	}
	
	public static void removeDrone (String droneName) {
		getInstance().dronesMap.remove(droneName);
	}
	
	//return null if no such task exists
	public static Drone getDroneByName (String droneName) {
		Drone droneModel = getInstance().dronesMap.get(droneName);
		return droneModel;
	}

}
