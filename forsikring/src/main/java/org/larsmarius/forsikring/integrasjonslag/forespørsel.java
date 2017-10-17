package org.larsmarius.forsikring.integrasjonslag;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.larsmarius.forsikring.brevtjeneste.Utsendelse;
import org.larsmarius.forsikring.fagsystem.Database;
import org.larsmarius.forsikring.fagsystem.Forespørsel;
import org.larsmarius.forsikring.fagsystem.Kunde;


@Path("/forespoersel")
@Consumes(MediaType.APPLICATION_JSON)

public class forespørsel {

	//Initierer falsk database
	Database db = new Database();
	
	//Test for falsk database
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Kunde> test() {
		return db.hentKunder();
	}
	/*
	 * @POST aksepterer forspørsler på formen {	"navn": "**********",	
	 * 											"telefonNummer": "************";
	 * 											"personNummer": "******"}														
	 */
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response behandling(Kunde kunde) {
		
		//Opretter kunde	 og generer kundenummer
		db.opprettKunde(kunde);
		
		//Opprett avtale og generer avtalenummer
		Forespørsel f = new Forespørsel(kunde);
		f.setAvtaleId(kunde.opprettAvtale());
		
		//Brevtjeneste
		Utsendelse nyttBrev = new Utsendelse();
		
		System.out.println(nyttBrev.genererBrev(kunde, kunde.getAktuelleAvtale()));
		
		//Oppdater status
		f.setStatus(true);
		return Response.status(Status.CREATED)
				.entity(f)
				.build();

	}
}
	
	/*
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Forespørsel behandling(Kunde kunde) {
		Forespørsel f = new Forespørsel(kunde);
		//Opretter kunde
		db.opprettKunde(kunde);
		//Opprett avtale
		kunde.opprettAvtale();
		f.setAvtaleId(kunde.getAvtaler().size());
		//Brevtjeneste
		Utsendelse nyttBrev = new Utsendelse();
		System.out.println(nyttBrev.genererBrev(kunde, kunde.getAktuelleAvtale()));
		//Oppdater status
		f.setStatus(true);
		return f;
	}
}*/
