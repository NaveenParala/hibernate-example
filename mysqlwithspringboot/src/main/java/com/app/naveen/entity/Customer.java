package com.app.naveen.entity;

//import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

@Entity
@Table(name=" Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customer_Id;
	private String name;
	private String email;
//	@JsonFormat(shape =JsonFormat.Shape.STRING,pattern = "dd/mm/yy")
//	Date date;
	private String mobileNo;
	@ManyToMany(fetch = FetchType.LAZY,mappedBy = "customer")
	private Set<Bank> bank;
	
	public Customer() {
		super();
	}

	public long getCustomer_Id() {
		return customer_Id;
	}

	public void setCustomer_Id(long customer_Id) {
		this.customer_Id = customer_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Set<Bank> getBank() {
		return bank;
	}

	public void setBank(Set<Bank> bank) {
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "Customer [customer_Id=" + customer_Id + ", name=" + name + ", email=" + email + ", mobileNo=" + mobileNo
				+ ", bank=" + bank + "]";
	}
	
	
	

	
}
