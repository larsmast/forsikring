package org.larsmarius.forsikring.fagsystem;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Feilmelding {
	
	private String feilMelding;
	private int errorKode;
	
	public Feilmelding() {	
	}
	
	public Feilmelding(String feilMelding, int errorKode) {
		super();
		this.feilMelding = feilMelding;
		this.errorKode = errorKode;
	}

	public String getFeilMelding() {
		return feilMelding;
	}

	public void setFeilMelding(String feilMelding) {
		this.feilMelding = feilMelding;
	}

	public int getErrorKode() {
		return errorKode;
	}

	public void setErrorKode(int errorKode) {
		this.errorKode = errorKode;
	}
	
	
}
