package org.larsmarius.forsikring.fagsystem;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Forespørsel {

	Integer kundeId;
	String navn;
	Integer avtaleId;
	boolean status;
	
	public Forespørsel() {
	}
	
	public Forespørsel(Kunde k) {	
	}
	
	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public Forespørsel(Integer kundeId) {
		this.kundeId = kundeId;
	}

	public Integer getKundeId() {
		return kundeId;
	}

	public void setKundeId(Integer kundeId) {
		this.kundeId = kundeId;
	}

	public Integer getAvtaleId() {
		return avtaleId;
	}

	public void setAvtaleId(Integer avtaleId) {
		this.avtaleId = avtaleId;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
