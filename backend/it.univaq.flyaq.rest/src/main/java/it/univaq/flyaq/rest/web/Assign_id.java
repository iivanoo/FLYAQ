package it.univaq.flyaq.rest.web;

import it.univaq.flyaq.rest.session.Sessions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public final class Assign_id {

	public Assign_id() {
		//
	}

	@RequestMapping(value = "/v1/assign_id", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> getID() {

		String response;
		HttpStatus httpStatus;

		try {
			String SessionID = Sessions.addSession();
			response = Sessions.idToJson(SessionID);
			httpStatus = HttpStatus.CREATED;
		} catch (Exception e) {
			response = "Impossible to create a new session";
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		}

		return new ResponseEntity<String>(response, httpStatus);
	}
}
