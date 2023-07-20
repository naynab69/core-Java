//to demonstarte static keyword
package com.tnsif.daysix.staticdemo;

public class Employee {
	//declare instance variables
	private String name;
	private int id;
	
	//declare static variable
	static String companyName="TNS";

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ",companyName= " + companyName + "]";
	}
	
	public void printData()
	{
		System.out.println("name=" + name + ", id=" + id + ",companyName= " + companyName + "");
	}
	
	

}
