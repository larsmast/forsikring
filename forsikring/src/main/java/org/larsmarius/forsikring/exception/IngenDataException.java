package org.larsmarius.forsikring.exception;


public class IngenDataException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -243848866762876523L;

	public IngenDataException(String melding) {
		super(melding);
	}
}
