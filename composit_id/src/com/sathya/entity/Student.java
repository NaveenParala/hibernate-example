package com.sathya.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@EmbeddedId
	private Student_Id sid;
	
	@Column(length=8 )
	private String present;
	
	public Student_Id getSid() {
		return sid;
	}
	public void setSid(Student_Id sid) {
		this.sid = sid;
	}
	public String getPresent() {
		return present;
	}
	public void setPresent(String present) {
		this.present = present;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", present=" + present + "]";
	}
}
