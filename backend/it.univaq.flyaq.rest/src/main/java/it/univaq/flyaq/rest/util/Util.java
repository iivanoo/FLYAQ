package it.univaq.flyaq.rest.util;

import it.univaq.flyaq.rest.Activator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Iterator;

import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Util {

	public static void copyFile(InputStream inputStream, String fileName) {
		Bundle bundle = Platform.getBundle("it.univaq.flyaq.rest");
		URL url = bundle.getResource("/WEB-INF/resources/");
		File temp = new File(url.getPath());
		if (!temp.exists())
			temp.mkdir();
		String path = temp.getAbsolutePath();
		String newpath = path + File.separator + fileName;
		File file = new File(newpath);

		OutputStream outputStream = null;

		try {
			outputStream = new FileOutputStream(file);
			byte[] buf = new byte[1024];
			int bytesRead;
			while ((bytesRead = inputStream.read(buf)) > 0) {
				outputStream.write(buf, 0, bytesRead);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
				outputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static String addDroneIconPath(String json, String iconPath) {
		String result = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			JsonFactory factory = mapper.getFactory();
			JsonParser jp = factory.createParser(json);
			JsonNode rootNode = mapper.readTree(jp);
			//String path = rootNode.path("icon").textValue();
			Path filePath = new Path(iconPath);
			((ObjectNode) rootNode).put("icon", Activator.baseUrlResources + filePath.lastSegment());
			result = mapper.writeValueAsString(rootNode);
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (result != null) 
			return result;
		else return json;
	}
	
	public static String addMissionIconColor(String json, String name, String iconPath, String color) {
		String result = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			JsonFactory factory = mapper.getFactory();
			JsonParser jp = factory.createParser(json);
			JsonNode rootNode = mapper.readTree(jp);
			//String path = rootNode.path("icon").textValue();
			Path filePath = new Path(iconPath);
			Iterator<JsonNode> eClassifiers = rootNode.path("eClassifiers").elements();
			while(eClassifiers.hasNext()){
			    JsonNode task = eClassifiers.next();
			    if (task.path("name").textValue().equals(name)) {
			    	((ObjectNode) task).put("icon", Activator.baseUrlResources + filePath.lastSegment());
			    	((ObjectNode) task).put("color", color);
			    }
			}
			
			result = mapper.writeValueAsString(rootNode);
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (result != null) 
			return result;
		else return json;
	}

}
