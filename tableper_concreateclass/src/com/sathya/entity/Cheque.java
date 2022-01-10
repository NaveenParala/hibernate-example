package com.sathya.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Cheque_payment")
public class Cheque extends Payment {

	private int chequeno;
	@Column(length=10)
	private String cheuqetype;
	public int getChequeno() {
		return chequeno;
	}
	public void setChequeno(int chequeno) {
		this.chequeno = chequeno;
	}
	public String getCheuqetype() {
		return cheuqetype;
	}
	public void setCheuqetype(String cheuqetype) {
		this.cheuqetype = cheuqetype;
	}
	
	
}
