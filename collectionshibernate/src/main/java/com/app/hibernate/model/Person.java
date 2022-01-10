package com.app.hibernate.model;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "person_tab")
public class Person {
	@Id
	private int pid;
	
	private String pname;
	
	@ElementCollection
	@CollectionTable(name = "person_data",joinColumns = @JoinColumn(name="pid"))
	@OrderColumn(name = "positon")
	@Column(name =" person_data")
	private Set<String> personData =new HashSet<String>();
	//private List<String> phoneno;
	
	@ElementCollection
	@MapKeyColumn(name = "position")
	@CollectionTable(name = "map_tab",joinColumns = @JoinColumn(name="pid"))
	private Map<Integer,String> data=new TreeMap<Integer, String>();
	
	public Person() {		
		
	}
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Set<String> getPersonData() {
		return personData;
	}
	public void setPersonData(Set<String> personData) {
		this.personData = personData;
	}
	public Map<Integer, String> getData() {
		return data;
	}



	public void setData(Map<Integer, String> data) {
		this.data = data;
	}
//	public List<String> getPhoneno() {
//		return phoneno;
//	}
//
//	public void setPhoneno(List<String> phoneno) {
//		this.phoneno = phoneno;
//	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", personData=" + personData + ", data=" + data + "]";
	}

	
}
