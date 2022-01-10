package com.sathya.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


public class Employee {
	
	private int empNumber;
	private String empName;
	private int empsal;
	private int deptNumber;

	public Employee()
	{
		//defult con;
	}
	
	public Employee(int empNumber) {

		this.empNumber = empNumber;
	}

	public Employee(int empNumber, String empName, int empsal, int deptNumber) {

		this.empNumber = empNumber;
		this.empName = empName;
		this.empsal = empsal;
		this.deptNumber = deptNumber;
		
	}
	

	public int getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpsal() {
		return empsal;
	}

	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}

	public int getDeptNumber() {
		return deptNumber;
	}

	public void setDeptNumber(int deptNumber) {
		this.deptNumber = deptNumber;
	}

	@Override
	public String toString() {
		return "Employee [empNumber=" + empNumber + ", empName=" + empName + ", empsal=" + empsal + ", deptNumber="
				+ deptNumber + "]";
	}
	
	

}
