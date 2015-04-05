package it.univaq.flyaq.rest.jsonbridge;

import it.univaq.flyaq.behaviour.Behaviour;
import it.univaq.flyaq.context.Context;
import it.univaq.flyaq.context.ContextPackage;
import it.univaq.flyaq.mission.Mission;
import it.univaq.flyaq.mission.MissionPackage;
import it.univaq.flyaq.rest.exception.ValidationException;
import it.univaq.flyaq.rest.util.MissionObject;
import it.univaq.flyaq.rest.util.URL_IconPathObject;
import it.univaq.flyaq.rest.util.Util;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipselabs.emfjson.EMFJs;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;

public class JsonBridge {
	
	public static Context json2context (String json) throws Exception {
		Context context = null;
		File tempFile = null;
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());

		tempFile = json2file(json);
		Resource resource = resourceSet.createResource(URI.createFileURI(tempFile.getAbsolutePath()));

		Map<String, Object> op = new HashMap<String, Object>();
		op.put(EMFJs.OPTION_ROOT_ELEMENT, ContextPackage.eINSTANCE.getContext());
		
		try {
			resource.load(op);
			context = (Context)resource.getContents().get(0);
		} finally {
			tempFile.delete();
		}
			
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(context);
		if (diagnostic.getSeverity() == Diagnostic.ERROR ) {
			System.err.println(diagnostic);
			throw new ValidationException(); 
		}
		else {
			System.out.println("success creation: " + context);
			return context;
		}
	}
	
	public static Mission json2mission (String json) throws Exception {
		Mission mission = null;
		File tempFile = null;
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(MissionPackage.eINSTANCE.getNsURI(), MissionPackage.eINSTANCE);

		tempFile = json2file(json);
		Resource resource = resourceSet.createResource(URI.createFileURI(tempFile.getAbsolutePath()));

		Map<String, Object> op = new HashMap<String, Object>();
		op.put(EMFJs.OPTION_ROOT_ELEMENT, MissionPackage.eINSTANCE.getMission());
		
		try {
			resource.load(op);
		} finally {
			tempFile.delete();
		}
		
		mission = (Mission)resource.getContents().get(0);
			
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(mission);
		if (diagnostic.getSeverity() == Diagnostic.ERROR ) {
			System.err.println(diagnostic);
			throw new ValidationException(); 
		}
		else {
			System.out.println("success creation: " + mission);
			return mission;
		}
	}

	public static String ecore2json (String ecorePath) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
		
		URI mmURI = URI.createURI(ecorePath);
		
		//register ecore package
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		
		Resource ecoreResource = resourceSet.getResource(mmURI, true);
		
		List<EPackage> pList = getPackages(ecoreResource);
		EPackage p = pList.get(0);
		resourceSet.getPackageRegistry().put(p.getNsURI(), p);
				
		Resource resource = resourceSet.createResource(URI.createURI("model.json"));
		Map<String, Object> options = new HashMap<String, Object>();
		options.put(EMFJs.OPTION_INDENT_OUTPUT, true);
		options.put(EMFJs.OPTION_SERIALIZE_TYPE, false);
		options.put(EMFJs.OPTION_SERIALIZE_NAMESPACES, false);
			
		resource.getContents().add(p);
		
	    // Create a stream to hold the output
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(baos);
	    // IMPORTANT: Save the old System.out!
	    PrintStream old = System.out;
	    // Tell Java to use your special stream
	    System.setOut(ps);
	    // Print some output: goes to your special stream
	    resource.save(System.out, options);
	    // Put things back
	    System.out.flush();
	    System.setOut(old);
		
		return baos.toString();
	}
	
	public static String xmi2json (String xmiPath) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
		
		//URI modelURI = URI.createFileURI(new File(xmiPath).getAbsolutePath());
		URI modelURI = URI.createURI(xmiPath);

		//register ecore package
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		
		Resource model = resourceSet.getResource(modelURI, true);
				
		Resource resource = resourceSet.createResource(URI.createURI("model.json"));
		Map<String, Object> options = new HashMap<String, Object>();
		options.put(EMFJs.OPTION_INDENT_OUTPUT, true);
		//lato clienti lo vogliono cosi, quindi non lo cambiamo.
		options.put(EMFJs.OPTION_SERIALIZE_TYPE, true);
		//options.put(EMFJs.OPTION_SERIALIZE_NAMESPACES, true);

		resource.getContents().add(model.getContents().get(0));

		// Create a stream to hold the output
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(baos);
	    // IMPORTANT: Save the old System.out!
	    PrintStream old = System.out;
	    // Tell Java to use your special stream
	    System.setOut(ps);
	    //serialize json
	    resource.save(System.out, options);
	    // Put things back
	    System.out.flush();
	    System.setOut(old);
	    
		return baos.toString();
	}
	
	public static String behaviour2json (Behaviour behaviour) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
		
		Resource resource = resourceSet.createResource(URI.createURI("behaviour.json"));
		Map<String, Object> options = new HashMap<String, Object>();
		options.put(EMFJs.OPTION_INDENT_OUTPUT, true);
		options.put(EMFJs.OPTION_SERIALIZE_TYPE, true);

		resource.getContents().add(behaviour);

		// Create a stream to hold the output
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(baos);
	    // IMPORTANT: Save the old System.out!
	    PrintStream old = System.out;
	    // Tell Java to use your special stream
	    System.setOut(ps);
	    //serialize json
	    resource.save(System.out, options);
	    // Put things back
	    System.out.flush();
	    System.setOut(old);
	    
		return baos.toString();
	}
	
	public static String listDroneXMI2Json (ArrayList<URL_IconPathObject> xmiURLs)  {
		StringBuilder json = new StringBuilder();
		json.append("{ \""+ "drones" + "\" : [");
		
		Iterator<URL_IconPathObject> iterator = xmiURLs.iterator();
		
		//empty list?
		if (!iterator.hasNext()) {
			json.append("] }");
			return json.toString();
		}
		
		while (iterator.hasNext()) {
			URL_IconPathObject curr = iterator.next();
			String jsontemp;
			try {
				jsontemp = xmi2json(curr.getUrl().toString());
				//add icon path to json
				jsontemp = Util.addDroneIconPath(jsontemp, curr.getIconPath());
				
				json.append(jsontemp);
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println("impossible to convert to json: " + curr.getUrl().toString());
			}
			
			if (iterator.hasNext()) {
				if (json.charAt(json.length() -1) != ',')
					json.append(",");
			} else {
				if (json.charAt(json.length() -1) == ',')
					json.setCharAt(json.length() -1, ' ');
				json.append("] }");
			}
		}
		
		return json.toString();
	}
	
	public static String listMissionEcore2Json (ArrayList<MissionObject> missionObjects) {
		StringBuilder json = new StringBuilder();
		json.append("{ \""+ "extensions" + "\" : [");
		
		Iterator<MissionObject> iterator = missionObjects.iterator();
		
		//empty list?
		if (!iterator.hasNext()) {
			json.append("] }");
			return json.toString();
		}
		
		while (iterator.hasNext()) {
			MissionObject curr = iterator.next();
			String jsontemp;
			try {
				jsontemp = ecore2json(curr.getURL().toString());
				
				//add icon path and color string to json
				Iterator<Map.Entry<String,MissionObject.Icon_Color>> taskIterator = curr.getTaskMap().entrySet().iterator();
				while (taskIterator.hasNext()) {
					Map.Entry<String,MissionObject.Icon_Color> entry = taskIterator.next();
					jsontemp = Util.addMissionIconColor(jsontemp, entry.getKey(), 
											entry.getValue().getIcon(), entry.getValue().getColor());
					taskIterator.remove();
				}
				
				json.append(jsontemp);
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println("impossible to convert to json: " + curr.getURL().toString());
			}
			
			if (iterator.hasNext()) {
				if (json.charAt(json.length() -1) != ',')
					json.append(",");
			} else {
				if (json.charAt(json.length() -1) == ',')
					json.setCharAt(json.length() -1, ' ');
				json.append("] }");
			}
		}
		
		return json.toString();
	}
	
	private static List<EPackage> getPackages(Resource r){
		ArrayList<EPackage> pList = new ArrayList<EPackage>();
		if (r.getContents() != null)
			for (EObject obj : r.getContents()) 
				if (obj instanceof EPackage) {
					pList.add((EPackage)obj);
				}
		return pList;
	}
	
	private static File json2file (String json) {
		//File file = new File(URI.createURI(path).toFileString());		
		File tempFile = null;
		BufferedWriter writer = null;
        try {
        	tempFile = File.createTempFile("json", ".json"); 
            writer = new BufferedWriter(new FileWriter(tempFile));
            writer.write(json);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (Exception e) {
            	e.printStackTrace();
            }
        }
        return tempFile;
	}
}
