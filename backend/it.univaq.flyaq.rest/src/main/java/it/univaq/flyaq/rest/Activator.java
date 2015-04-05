package it.univaq.flyaq.rest;

import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static BundleContext context;
	public static String baseUrlResources = "http://127.0.0.1:8888/api/resources/";
	private DronePluginEventListener dronePluginEventListener;
	private MissionPluginEventListener missionPluginEventListener;

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
		dronePluginEventListener = new DronePluginEventListener();
	    registry.addListener(dronePluginEventListener, "it.univaq.flyaq.extension.drone");
	    missionPluginEventListener = new MissionPluginEventListener();
	    registry.addListener(missionPluginEventListener, "it.univaq.flyaq.extension.mission");
	    
	    IExtensionPoint drone = registry.getExtensionPoint("it.univaq.flyaq.extension.drone"),
	    				mission = registry.getExtensionPoint("it.univaq.flyaq.extension.mission");
	    if (drone != null)
	    	dronePluginEventListener.added(drone.getExtensions());
	    if (mission != null)
	    	missionPluginEventListener.added(mission.getExtensions());
	    
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		IExtensionRegistry registry = Platform.getExtensionRegistry();
	    registry.removeListener(dronePluginEventListener);
	    registry.removeListener(missionPluginEventListener);
	}

}
