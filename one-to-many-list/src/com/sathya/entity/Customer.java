package com.sathya.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

@Entity
public class Customer {
	@Id
	private int custId;
	@Column(length=12)
	private String custName;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval=true)
	@JoinColumn(name="custId_fk",referencedColumnName="custId")
	@OrderColumn(name="loan_index")
	private List<Loan> Loans;
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
	public List<Loan> getLoans() {
		return Loans;
	}
	public void setLoans(List<Loan> loans) {
		Loans = loans;
	}

	
}
