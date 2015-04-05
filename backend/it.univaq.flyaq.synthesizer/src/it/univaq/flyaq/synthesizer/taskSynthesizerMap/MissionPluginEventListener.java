package it.univaq.flyaq.synthesizer.taskSynthesizerMap;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IRegistryEventListener;

public class MissionPluginEventListener implements IRegistryEventListener {

	public MissionPluginEventListener() {
	}

	@Override
	public void added(IExtension[] extensions) {
		for (IExtension extension : extensions) {
			String exPoint = extension.getExtensionPointUniqueIdentifier();
			if (exPoint.equals("it.univaq.flyaq.extension.mission")) {
				IConfigurationElement[] confEls = extension
						.getConfigurationElements();
				for (IConfigurationElement confEl : confEls) {
					if (confEl.getName().equals("missionExtension")) {
						for (IConfigurationElement conf : confEl.getChildren()) {
							if (conf.getName().equals("Task")) {
								try {
									String taskName = conf.getAttribute("name");
									String idBundle = extension.getContributor().getName();
									String taskSynthesizer = conf.getAttribute("synthesizer");
									TaskSynthesizerMap.addTaskSynthesizer(taskName, idBundle, taskSynthesizer);
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						}
					}
				}
			}
		}
	}


	@Override
	public void removed(IExtension[] extensions) {
		for (IExtension extension : extensions) {
			String exPoint = extension.getExtensionPointUniqueIdentifier();
			if (exPoint.equals("it.univaq.flyaq.extension.mission")) {
				IConfigurationElement[] confEls = extension
						.getConfigurationElements();
				for (IConfigurationElement confEl : confEls) {
					if (confEl.getName().equals("missionExtension")) {
						for (IConfigurationElement conf : confEl.getChildren()) {
							if (conf.getName().equals("Task")) {
								try {
									String taskName = conf.getAttribute("name");
									TaskSynthesizerMap.removeTaskSynthesizer(taskName);
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						}
					}
				}
			}
		}
	}

	@Override
	public void removed(IExtensionPoint[] arg0) {
	}

	@Override
	public void added(IExtensionPoint[] arg0) {
	}

}
