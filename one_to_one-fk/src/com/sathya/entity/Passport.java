package com.sathya.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Passport {

	@Id
	private int passortNo;
	@Temporal(TemporalType.DATE)
	private Date expDate;
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="personId_fk",referencedColumnName="personId",unique=true, nullable=false)
	private Person person;
	public int getPassortNo() {
		return passortNo;
	}
	public void setPassortNo(int passortNo) {
		this.passortNo = passortNo;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Passport [passortNo=" + passortNo + ", expDate=" + expDate + ", person=" + person + "]";
	}
	
}
