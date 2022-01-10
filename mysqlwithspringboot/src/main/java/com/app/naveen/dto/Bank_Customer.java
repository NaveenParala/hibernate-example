package com.app.naveen.dto;

import com.app.naveen.entity.Bank;
import com.app.naveen.entity.Customer;

public class Bank_Customer {

	
	private Bank bank;
	
	private Customer customer;

	public Bank_Customer() {
		super();
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
}
