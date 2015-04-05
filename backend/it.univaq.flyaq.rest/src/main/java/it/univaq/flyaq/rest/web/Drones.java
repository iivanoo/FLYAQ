package it.univaq.flyaq.rest.web;

import it.univaq.flyaq.rest.jsonbridge.JsonBridge;
import it.univaq.flyaq.rest.util.URL_IconPathObject;

import java.net.URL;
import java.util.ArrayList;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public final class Drones {

	public Drones() {
		//
	}

	@RequestMapping(value = "/v1/drones", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> getDrones() {

		String response = "";
		HttpStatus httpStatus = null;

		IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
		IExtensionPoint extensionPoint = extensionRegistry
				.getExtensionPoint("it.univaq.flyaq.extension.drone");
		IExtension[] extensions = extensionPoint.getExtensions();
		ArrayList<URL_IconPathObject> xmiDroneURLs = new ArrayList<>();
		for (int i = 0; i < extensions.length; i++) {
			try {
				IConfigurationElement[] configurationElements = extensions[i]
						.getConfigurationElements();

				for (int j = 0; j < configurationElements.length; j++) {
					if (configurationElements[j].getName().equals("Drone")) {
						String droneXMIPath = configurationElements[j]
								.getAttribute("droneModel");
						Bundle bundle = Platform.getBundle(extensions[i]
								.getContributor().getName());
						URL droneXMIURL = bundle.getResource(droneXMIPath);
						xmiDroneURLs.add(new URL_IconPathObject(droneXMIURL,
								configurationElements[j].getAttribute("icon")));
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.err
						.println("Impossible to retrieve extension information");
			}
		}

		try {
			response = JsonBridge.listDroneXMI2Json(xmiDroneURLs);

			httpStatus = HttpStatus.OK;

		} catch (Exception e) {
			response = "Impossible to retrieve the drones list";
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
			e.printStackTrace();
		}

		return new ResponseEntity<String>(response, httpStatus);
	}
}
