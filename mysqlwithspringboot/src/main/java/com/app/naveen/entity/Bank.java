package com.app.naveen.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Bank")
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bank_Id;
	private String name;
	private String branch_Name;
	private String swift_Code;
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(name = "Bank_Customer",
	joinColumns = {@JoinColumn(name = "bank_Id",nullable = false)},
	inverseJoinColumns = { @JoinColumn(name="customer_Id",nullable = false)})
	private Set<Customer> customer;
	public Set<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}

	public long getBank_Id() {
		return bank_Id;
	}

	public void setBank_Id(long bank_Id) {
		this.bank_Id = bank_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch_Name() {
		return branch_Name;
	}

	public void setBranch_Name(String branch_Name) {
		this.branch_Name = branch_Name;
	}

	public String getSwift_Code() {
		return swift_Code;
	}

	public void setSwift_Code(String swift_Code) {
		this.swift_Code = swift_Code;
	}

	public Bank() {
		super();
	}

	@Override
	public String toString() {
		return "Bank [bank_Id=" + bank_Id + ", name=" + name + ", branch_Name=" + branch_Name + ", swift_Code="
				+ swift_Code + ", customer=" + customer + "]";
	}
	
}
