package it.univaq.flyaq.rest.web;

import it.univaq.flyaq.behaviour.Behaviour;
import it.univaq.flyaq.context.Context;
import it.univaq.flyaq.rest.exception.MissionContextNotFoundException;
import it.univaq.flyaq.rest.exception.SessionNotFoundException;
import it.univaq.flyaq.rest.jsonbridge.JsonBridge;
import it.univaq.flyaq.rest.session.Session;
import it.univaq.flyaq.rest.session.Sessions;
import it.univaq.flyaq.synthesizer.Mission2Behaviour;
import it.univaq.flyaq.mission.Mission;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public final class Behaviour_id {

	public Behaviour_id() {
		//
	}

	@RequestMapping(value = "/v1/behaviour/{ID}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> getBehaviour(@PathVariable("ID") String ID) {

		String response;
		HttpStatus httpStatus;
		Session session = Sessions.getSession(ID);

		try {
			if (session == null)
				throw new SessionNotFoundException();
			Mission mission = session.getMission();
			Context context = session.getContext();
			
			if (mission == null) 
				throw new MissionContextNotFoundException("Mission");
			if (context == null) 
				throw new MissionContextNotFoundException("Context");
			
			Mission2Behaviour mission2Behaviour = Mission2Behaviour.getInstance();

			Behaviour behaviour = mission2Behaviour.execute(mission, context);
			
			System.err.println("Executing behaviour -> Mission: " + mission.getName() + " , Context: " + context.getName());
			
			response = JsonBridge.behaviour2json(behaviour);
			
			System.err.println("Resulting behaviour: " + response);
			
			httpStatus = HttpStatus.OK;
				
		} 
		catch (MissionContextNotFoundException e) {
			response = e.getMessage();
			httpStatus = HttpStatus.BAD_REQUEST;
		}	
		catch (SessionNotFoundException e1) {
			response = e1.getMessage();
			httpStatus = HttpStatus.NOT_FOUND ;
		} 
		catch (Exception e2) {
			e2.printStackTrace();
			response = "Error during behaviour transformation";
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		} 
		
		return new ResponseEntity<String>(response, httpStatus);
	}
}