package com.sathya.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Loan {
  
	@Id
	private String loanId;
	private double amount;
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="custId_fk",referencedColumnName="custId")
	private Customer customer;
	public String getLoanId() {
		return loanId;
	}
	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {		this.amount = amount;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", amount=" + amount + ", customer=" + customer + "]";
	}
	
}
