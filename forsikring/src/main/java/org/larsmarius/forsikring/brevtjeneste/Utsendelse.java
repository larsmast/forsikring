package org.larsmarius.forsikring.brevtjeneste;

import java.util.Date;

import org.larsmarius.forsikring.fagsystem.Avtale;
import org.larsmarius.forsikring.fagsystem.Kunde;

public class Utsendelse {
	
	private Date utsendt;
	
	public Utsendelse() {
		this.utsendt = new Date();
	}
	
	public String genererBrev(Kunde kunde, Avtale avtale)	{
		String brev = "Hei, " + kunde.getNavn() + ". Din kundeprofil er opprettet med kunde id: " + kunde.getId() + ". Dette er en bekreftelse på at din forsikringsavtale ble opprettet " + avtale.getOpprettet() + " med identifikasjonskode: " + avtale.getAvtaleId() +". Hilsen ********, " + utsendt ;
		return brev;
	}
	

}
