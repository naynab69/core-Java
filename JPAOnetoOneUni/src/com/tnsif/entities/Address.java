package com.tnsif.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Address implements Serializable{
	
	
	@Id
	//@Column(name="address_id")
	private int addressId;
		
	//@Column(name="address_street")
	private String street;
	
	//@Column(name="address_city")
	private String city;
	
	//@Column(name="address_state")
	private String state;
	
	//@Column(name="address_zipcode")
	private int zipcode;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	
	
	
	
	
	
	
	

}
