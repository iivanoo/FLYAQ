package it.univaq.flyaq.synthesizer.taskSynthesizerMap;

import it.univaq.flyaq.extension.mission.ITaskSynthesizer;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

public class TaskSynthesizerMap {

	private Map<String, TaskClassBundle> taskSynthesizerMap;

	private static TaskSynthesizerMap instance;

	private TaskSynthesizerMap() {
		this.taskSynthesizerMap = new HashMap<String, TaskClassBundle>();
	}

	private static TaskSynthesizerMap getInstance() {
		if (instance == null) {
			instance = new TaskSynthesizerMap();
		}
		return instance;
	}
	
	public static void addTaskSynthesizer (String taskName, String idBundle, String taskSynthesizer) {
		getInstance().taskSynthesizerMap.put(taskName, new TaskClassBundle(idBundle, taskSynthesizer));
	}
	
	public static void removeTaskSynthesizer (String taskName) {
		getInstance().taskSynthesizerMap.remove(taskName);
	}
	
	//return null if no such task exists
	@SuppressWarnings("unchecked")
	public static Class<ITaskSynthesizer> getTaskSynthesizerByName (String taskName) {
		TaskClassBundle taskClassBundle = getInstance().taskSynthesizerMap.get(taskName);
		try {
			Bundle taskBundle = Platform.getBundle(taskClassBundle.idBundle);
			return (Class<ITaskSynthesizer>) taskBundle.loadClass(taskClassBundle.taskSynthesizer);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}

class TaskClassBundle {
	public String idBundle;
	public String taskSynthesizer;
	
	public TaskClassBundle(String idBundle, String taskSynthesizer) {
		this.idBundle = idBundle;
		this.taskSynthesizer = taskSynthesizer;
	}
}
