package com.sathya.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	private int custId;
	
	@Column(length=12)
	private String custName;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="custId_fk",referencedColumnName="custId")
	@Fetch(value=FetchMode.JOIN)
	
	private Set<Loan> Loans;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Set<Loan> getLoans() {
		return Loans;
	}
	public void setLoans(Set<Loan> loans) {
		Loans = loans;
	}

	
}
