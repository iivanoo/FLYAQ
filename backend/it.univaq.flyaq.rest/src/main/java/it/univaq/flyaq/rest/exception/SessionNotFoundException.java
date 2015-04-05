package it.univaq.flyaq.rest.exception;

public class SessionNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4127896302565496208L;

	public SessionNotFoundException() {
		super("Session not found!");
	}


}
