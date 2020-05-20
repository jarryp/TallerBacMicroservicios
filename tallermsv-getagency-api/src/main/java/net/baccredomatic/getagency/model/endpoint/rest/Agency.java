package net.baccredomatic.getagency.model.endpoint.rest;

import java.io.Serializable;

public class Agency implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5126001781618053107L;
	private int id;
	private String nameAgency;
	private String address;
	private String phoneNumber;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameAgency() {
		return nameAgency;
	}
	public void setNameAgency(String nameAgency) {
		this.nameAgency = nameAgency;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Agency(int id, String nameAgency, String address, String phoneNumber) {
		this.id = id;
		this.nameAgency = nameAgency;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	public Agency() {
		
	}
	
	
	
	
	
	

}
