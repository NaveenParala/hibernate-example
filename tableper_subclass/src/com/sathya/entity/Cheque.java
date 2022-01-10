package com.sathya.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="cheque_payment")
@PrimaryKeyJoinColumn(name="tx_Id")

public class Cheque extends Payment {

	private int chequeno;
	@Column(length=12)
	private String chequetype;
	public int getChequeno() {
		return chequeno;
	}
	public void setChequeno(int chequeno) {
		this.chequeno = chequeno;
	}
	public String getChequetype() {
		return chequetype;
	}
	public void setChequetype(String chequetype) {
		this.chequetype = chequetype;
	}
	
}
