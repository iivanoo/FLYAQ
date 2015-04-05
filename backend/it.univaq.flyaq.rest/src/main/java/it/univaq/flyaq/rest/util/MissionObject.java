package it.univaq.flyaq.rest.util;

import java.net.URL;
import java.util.HashMap;

public class MissionObject {
	URL url;
	HashMap<String, Icon_Color> taskMap;
	
	public MissionObject (URL url) {
		this.url = url;
		this.taskMap = new HashMap<>();
	}
	
	public void addTask (String name, String iconPath, String color) {
		taskMap.put(name, new Icon_Color(iconPath, color));
	}
	
	public HashMap<String, Icon_Color> getTaskMap() {
		return this.taskMap;
	}
	
	public URL getURL () {
		return this.url;
	}
	
	public class Icon_Color {
		String iconPath;
		String color;
		
		public Icon_Color (String iconPath, String color) {
			this.iconPath = iconPath;
			this.color = color;
		}
		
		public String getIcon() {
			return this.iconPath;
		}
		
		public String getColor() {
			return this.color;
		}
	}
}
