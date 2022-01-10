package com.sathya.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Embeddable
public class Student_Id implements Serializable {
	@Column(length=10)
	private String name;
	
	@Temporal(TemporalType.DATE)
	private Date adate;
	
	private int period;
	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student_Id [name=" + name + ", date=" + adate + ", period=" + period + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getAdate() {
		return adate;
	}
	public void setAdate(Date adate) {
		this.adate = adate;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	


}
