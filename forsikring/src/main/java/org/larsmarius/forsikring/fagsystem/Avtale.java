package org.larsmarius.forsikring.fagsystem;

import java.util.Date;

public class Avtale {
	private Integer avtaleId;
	private Date opprettet;
	
	public Avtale(Integer avtaleId) {
		this.avtaleId = avtaleId;
		this.opprettet = new Date();
	}

	public Integer getAvtaleId() {
		return avtaleId;
	}

	public void setAvtaleId(Integer avtaleId) {
		this.avtaleId = avtaleId;
	}

	public Date getOpprettet() {
		return opprettet;
	}

	public void setOpprettet(Date opprettet) {
		this.opprettet = opprettet;
	}
	
	
	
}
