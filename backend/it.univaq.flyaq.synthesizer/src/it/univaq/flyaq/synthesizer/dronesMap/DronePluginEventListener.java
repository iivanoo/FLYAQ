package it.univaq.flyaq.synthesizer.dronesMap;

import it.univaq.flyaq.drone.Drone;
import it.univaq.flyaq.drone.DronePackage;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IRegistryEventListener;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.osgi.framework.Bundle;

public class DronePluginEventListener implements IRegistryEventListener {
	
	public DronePluginEventListener() {
	}

	@Override
	public void added(IExtension[] extensions) {
		for (IExtension extension : extensions) {
			String exPoint = extension.getExtensionPointUniqueIdentifier();
			if (exPoint.equals("it.univaq.flyaq.extension.drone")) {
				IConfigurationElement[] confEls = extension
						.getConfigurationElements();
				for (IConfigurationElement confEl : confEls) {
					if (confEl.getName().equals("Drone")) {
						try {
							String droneName = confEl.getAttribute("name");
							String droneModelXMIPath = confEl.getAttribute("droneModel");
							
							Bundle bundle = Platform.getBundle(extension
									.getContributor().getName());
							URL droneModelXMIURL = bundle.getEntry(droneModelXMIPath);

							Drone droneModel = droneXMItoModel(droneModelXMIURL);
							DronesMap.addDrone(droneName, droneModel);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
	
	private Drone droneXMItoModel (URL droneModelXMIURL) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(DronePackage.eNS_URI, DronePackage.eINSTANCE);
		XMIResource resource = new XMIResourceImpl(URI.createURI(droneModelXMIURL.toString()));
		resource.load(null);
		Drone drone = (Drone) resource.getContents().get(0);
		return drone;
	}
	
	@Override
	public void removed(IExtension[] extensions) {
		for (IExtension extension : extensions) {
			String exPoint = extension.getExtensionPointUniqueIdentifier();
			if (exPoint.equals("it.univaq.flyaq.extension.drone")) {
				IConfigurationElement[] confEls = extension
						.getConfigurationElements();
				for (IConfigurationElement confEl : confEls) {
					if (confEl.getName().equals("Drone")) {
						try {
							String droneName = confEl.getAttribute("name");
							DronesMap.removeDrone(droneName);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}

	@Override
	public void added(IExtensionPoint[] arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void removed(IExtensionPoint[] arg0) {
		// TODO Auto-generated method stub
		
	}

}
