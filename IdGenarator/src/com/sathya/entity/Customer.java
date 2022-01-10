package com.sathya.entity;

public class Customer {

	private String custId;
	private String custName;
	private String location;
	
	public Customer() {
	
	}

	public Customer(String custId) {
	
		this.custId = custId;
	}

	public Customer(String custId, String custName, String location) {
		
		this.custId = custId;
		this.custName = custName;
		this.location = location;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", location=" + location + "]";
	}
	
	
}
