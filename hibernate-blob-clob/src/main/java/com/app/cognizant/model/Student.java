package com.app.cognizant.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name= "student_blob_clob")
public class Student {
	
	@Id
	@Column(name="student_id")
	private int sid;
	
	@Column(name="student_name")
	private String sname;
	
	@Column(name="student_fee")
	private String sfee;
	
	@Lob
	@Column(name="student_image")
	private byte[] simage;
	
	@Lob
	@Column(name="student_text")
	private char[] stext;
	
	public Student() {
		
	}
	
	public Student(int sid, String sname, String sfee, byte[] simage, char[] stext) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfee = sfee;
		this.simage = simage;
		this.stext = stext;
	}

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSfee() {
		return sfee;
	}
	public void setSfee(String sfee) {
		this.sfee = sfee;
	}
	public byte[] getSimage() {
		return simage;
	}
	public void setSimage(byte[] simage) {
		this.simage = simage;
	}
	public char[] getStext() {
		return stext;
	}
	public void setStext(char[] stext) {
		this.stext = stext;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + ", simage=" + Arrays.toString(simage)
				+ ", stext=" + Arrays.toString(stext) + "]";
	}
	

}
