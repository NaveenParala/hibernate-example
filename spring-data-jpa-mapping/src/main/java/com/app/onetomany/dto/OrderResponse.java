package com.app.onetomany.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class OrderResponse implements Serializable{
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String name;
 private String productName;
 private int price;
 
 
public OrderResponse() {
	
}

public OrderResponse(String name, String productName) {
	super();
	this.name = name;
	this.productName = productName;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}
 
 
}
