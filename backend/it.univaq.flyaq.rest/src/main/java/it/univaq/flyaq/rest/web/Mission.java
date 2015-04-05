package it.univaq.flyaq.rest.web;

import it.univaq.flyaq.rest.jsonbridge.JsonBridge;
import it.univaq.flyaq.rest.util.MissionObject;

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
public final class Mission {

	public Mission() {
		//
	}

	@RequestMapping(value = "/v1/mission", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> getExtentions() {

		String response = "";
		HttpStatus httpStatus = null;

		IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
		IExtensionPoint extensionPoint = extensionRegistry
				.getExtensionPoint("it.univaq.flyaq.extension.mission");
		IExtension[] extensions = extensionPoint.getExtensions();
		ArrayList<MissionObject> missions = new ArrayList<>();
		for (int i = 0; i < extensions.length; i++) {
			IConfigurationElement[] configurationElements = extensions[i]
					.getConfigurationElements();

			for (int j = 0; j < configurationElements.length; j++) {
				try {
					if (configurationElements[j].getName().equals(
							"missionExtension")) {
						String missionEcorePath = configurationElements[j]
								.getAttribute("metamodel");
						Bundle bundle = Platform.getBundle(extensions[i]
								.getContributor().getName());
						URL missionEcoreURL = bundle
								.getResource(missionEcorePath);
						MissionObject missionObject = new MissionObject(
								missionEcoreURL);
						for (IConfigurationElement conf : configurationElements[j]
								.getChildren()) {
							if (conf.getName().equals("Task")) {
								missionObject.addTask(
										conf.getAttribute("name"),
										conf.getAttribute("icon"),
										conf.getAttribute("color"));
							}
						}
						missions.add(missionObject);
					}
				} catch (Exception e) {
					e.printStackTrace();
					System.err
							.println("Impossible to retrieve extension information");
				}
			}
		}

		try {
			response = JsonBridge.listMissionEcore2Json(missions);

			httpStatus = HttpStatus.OK;

		} catch (Exception e) {
			response = "Impossible to retrieve the mission list";
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		}

		return new ResponseEntity<String>(response, httpStatus);
	}

}