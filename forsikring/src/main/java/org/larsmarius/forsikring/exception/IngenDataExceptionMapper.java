package org.larsmarius.forsikring.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.larsmarius.forsikring.fagsystem.Feilmelding;

@Provider
public class IngenDataExceptionMapper implements ExceptionMapper<IngenDataException>{
	@Override
	public Response toResponse(IngenDataException ex) {
		Feilmelding feilmelding = new Feilmelding(ex.getMessage(), 404);
		return Response.status(Status.NOT_FOUND)
				.entity(feilmelding)
				.build();
	}
}
