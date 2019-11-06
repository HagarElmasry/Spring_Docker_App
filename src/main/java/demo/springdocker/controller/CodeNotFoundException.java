package demo.springdocker.controller;

public class CodeNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3980550904136499985L;

	public CodeNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public CodeNotFoundException(String message) {
		super(message);
	}

	public CodeNotFoundException(Throwable cause) {
		super(cause);
	}
	
}
