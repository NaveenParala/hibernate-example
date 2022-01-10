package com.sathya.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
@Column(length=12)
private String hno;
@Column(length=15)
private String street;
@Column(length=15)
private String city;

public String getHno() {
	return hno;
}
public void setHno(String hno) {
	this.hno = hno;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Address [hno=" + hno + ", street=" + street + ", city=" + city + "]";
}
 

}
