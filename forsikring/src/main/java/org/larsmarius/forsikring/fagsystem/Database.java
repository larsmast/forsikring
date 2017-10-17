package org.larsmarius.forsikring.fagsystem;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.larsmarius.forsikring.exception.IngenDataException;

@XmlRootElement
public class Database {
	private boolean debug = false;
	
	
	List<Kunde> kunder;
	public Database() {
		kunder = new ArrayList<Kunde>()	;
		Kunde k1 = new Kunde(1,"Lars Marius Strande", 2,"904424242");
		Kunde k2 = new Kunde(2, "Grete Waitz", 3, "0404040404");
		kunder.add(k1);
		kunder.add(k2);
		k1.opprettAvtale();
		k1.opprettAvtale();
		k2.opprettAvtale();
		k2.opprettAvtale();
		if(debug) {
			System.out.println(kunder);
		}
	}
	
	public Kunde opprettKunde(Kunde kunde) {
		if(kunde.getPersonNummer() == null) {
			throw new IngenDataException("Korrekt data er ikke gitt.");
		}
		
		//Dersom kunden eksisterer opprettes ikke ny kunde
		boolean funn = false;
		for(Kunde k : kunder) {
			if(k.getPersonNummer() == kunde.getPersonNummer()) {
				System.out.println("Kunden eksisterer i databasen");
				funn = true;
				kunde.setId(k.getId());
				kunde.setAvtaler(k.getAvtaler());
			}
		}
		if(!funn) {
		kunde.setId(kunder.size() + 1);
		kunder.add(kunde);
		System.out.println("Kunden er lagt til i databasen");
		return kunde;
		}
		return kunde;
	}
	
	public List<Kunde> hentKunder(){
		return kunder;
	}
}
