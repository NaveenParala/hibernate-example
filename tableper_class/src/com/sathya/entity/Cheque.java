package com.sathya.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ch")
public class Cheque extends Payment {

	private int chequeno;
	@Column(length=10)
	private String chequeType;
	
	public int getChequeno() {
		return chequeno;
	}
	public void setChequeno(int chequeno) {
		this.chequeno = chequeno;
	}
	public String getChequeType() {
		return chequeType;
	}
	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}
	
	
	
}
