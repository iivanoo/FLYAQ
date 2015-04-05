package it.univaq.flyaq.rest.exception;

public class MissionContextNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -896945711013712651L;

	public MissionContextNotFoundException(String missing) {
		super(missing + " object not found in current session!");
	}

}
