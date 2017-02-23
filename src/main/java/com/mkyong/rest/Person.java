package com.mkyong.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Person")
public class Person {
	private String fisrtName;
	private String lastName;
	public String getFisrtName() {
		return fisrtName;
	}
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
