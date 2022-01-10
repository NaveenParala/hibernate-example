package com.sathya.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	private int custId;
	@Column(length=15)
	private String custName;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="customer")
	private Set<Loan> loans;
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
		return loans;
	}
	public void setLoans(Set<Loan> loans) {
		this.loans = loans;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + "]";
	}
	
	
}
