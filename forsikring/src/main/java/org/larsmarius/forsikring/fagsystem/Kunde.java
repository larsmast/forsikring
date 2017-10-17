package org.larsmarius.forsikring.fagsystem;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Kunde {
	private Integer id;
	private String navn;
	private String telefonNummer;
	private Integer personNummer;
	private List<Avtale> avtaler = new ArrayList<Avtale>();
	private Avtale aktuelleAvtale;

	
	public Kunde(Forespørsel f) {
		this.navn = f.getNavn();
	}
	
	public Kunde() {	
	}
	
	public Kunde(Integer id, String navn, Integer personNummer, String telefonNummer) {
		this.id 				= id;
		this.navn 			= navn;
		this.telefonNummer 	= telefonNummer;
		this.personNummer 	= personNummer;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getTelefonNummer() {
		return telefonNummer;
	}

	public void setTelefonNummer(String telefonNummer) {
		this.telefonNummer = telefonNummer;
	}

	public List<Avtale> getAvtaler() {
		return avtaler;
	}

	public void setAvtaler(List<Avtale> avtaler) {
		this.avtaler = avtaler;
	}
	
	public Integer opprettAvtale() {
		Integer nr = (avtaler.size()+1);
		Avtale a = new Avtale(nr);
		this.aktuelleAvtale = a;
		avtaler.add(a);
		return nr;
	}
	
	public Integer getPersonNummer() {
		return personNummer;
	}

	public void setPersonNummer(Integer personNummer) {
		this.personNummer = personNummer;
	}

	
	public Avtale getAktuelleAvtale() {
		return aktuelleAvtale;
	}

	public void setAktuelleAvtale(Avtale aktuelleAvtale) {
		this.aktuelleAvtale = aktuelleAvtale;
	}
	
	

	@Override
	public String toString() {
		return "Kunde [id=" + id + ", navn=" + navn + ", telefonNummer=" + telefonNummer + ", personNummer="
				+ personNummer + ", avtaler=" + avtaler + "]";
	}


}
