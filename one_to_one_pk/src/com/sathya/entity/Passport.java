package com.sathya.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Passport {
	@GenericGenerator(name="g1",strategy="foreign",parameters=@Parameter(name="property",value="person"))
	@Id
	@GeneratedValue(generator="g1")
	private int passportNo;
	
	@Temporal(TemporalType.DATE)
	private Date expDate;
	
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Person person;
	public int getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
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
		return "Passport [passportNo=" + passportNo + ", expDate=" + expDate + ", person=" + person + "]";
	}
	
	
	
}
