package it.univaq.flyaq.rest.exception;

import org.eclipse.emf.common.util.Diagnostic;

public class ValidationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2868388830650224894L;

	public ValidationException () {
		super("EObject not conform!");
	}
	
	public ValidationException(Diagnostic diagnostic) {
		super(diagnostic.getMessage());
	}

	public ValidationException(String message) {
		super(message);
	}

}
