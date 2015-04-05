package it.univaq.flyaq.rest.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public final class TestRestController {

	public TestRestController() {
		//
	}

	@RequestMapping(value = "/v1/test", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> test() {

		String response = "";
		HttpStatus httpStatus = null;

		try {
//			Bundle bundle = Platform.getBundle("it.univaq.flyaq.context");
//			URL missionEcoreURL = bundle.getResource("/model/Context.xmi");
//			response = JsonBridge.xmi2json(missionEcoreURL.toString());
				
			response = "T E S T !";
	    	httpStatus = HttpStatus.OK;

		} catch (Exception e) {
			response = e.getMessage();
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		} 
		
		return new ResponseEntity<String>(response, httpStatus);
	}
}
