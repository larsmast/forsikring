package org.larsmarius.forsikring.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.larsmarius.forsikring.fagsystem.Feilmelding;

@Provider
public class GeneriskExceptionMapper implements ExceptionMapper<Throwable>{
	@Override
	public Response toResponse(Throwable ex) {
		Feilmelding feilmelding = new Feilmelding(ex.getMessage(), 500);
		return Response.status(Status.INTERNAL_SERVER_ERROR)
				.entity(feilmelding)
				.build();
	}
}

