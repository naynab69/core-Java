//to demonstrate constructor
package com.tnsif.daythree.constructordemo;

public class Customer {
	// data members
	private int customerId;
	private String name;
	private double phNo;

	
	  // Default Constructor 
	public Customer() 
	{ customerId = 100; 
	name = "Latha";
	  phNo = 832489480;
	  
	  }
	 
		/*
		 * // Default Constructor public Customer() {
		 * System.out.println("Default Constructor"); }
		 */

	// Parameterized Constructor
	public Customer(int customerId, String name, double phNo) {
		this();     //calling default constructor
		this.customerId = customerId;
		this.name = name;
		this.phNo = phNo;
	}

	
	//Getter and setter methods
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPhNo() {
		return phNo;
	}

	public void setPhNo(double phNo) {
		this.phNo = phNo;
	}

	
	//to-string method
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", phNo=" + phNo + "]";
	}
	
	
	

}
