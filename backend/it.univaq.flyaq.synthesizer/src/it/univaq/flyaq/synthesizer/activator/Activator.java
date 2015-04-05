package it.univaq.flyaq.synthesizer.activator;

import it.univaq.flyaq.synthesizer.dronesMap.DronePluginEventListener;
import it.univaq.flyaq.synthesizer.taskSynthesizerMap.MissionPluginEventListener;

import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static BundleContext context;
	private MissionPluginEventListener missionPluginEventListener;
	private DronePluginEventListener dronePluginEventListener;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		
		//mission
	    missionPluginEventListener = new MissionPluginEventListener();
	    registry.addListener(missionPluginEventListener, "it.univaq.flyaq.extension.mission");
	    IExtensionPoint mission = registry.getExtensionPoint("it.univaq.flyaq.extension.mission");
	    if (mission != null)
	    	missionPluginEventListener.added(mission.getExtensions());
	    
	    //drone
	    dronePluginEventListener = new DronePluginEventListener();
	    registry.addListener(dronePluginEventListener, "it.univaq.flyaq.extension.drone");
	    IExtensionPoint drone = registry.getExtensionPoint("it.univaq.flyaq.extension.drone");
	    if (drone != null)
	    	dronePluginEventListener.added(drone.getExtensions());
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		IExtensionRegistry registry = Platform.getExtensionRegistry();
	    registry.removeListener(missionPluginEventListener);
	    registry.removeListener(dronePluginEventListener);
	}

}
