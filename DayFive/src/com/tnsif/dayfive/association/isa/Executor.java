// Usage of the "IS-A" relationship 
package com.tnsif.dayfive.association.isa;

public class Executor {
	public static void main(String[] args) {
		

		Employee employee = new Employee("Sagar Pawar", 101, "IT");
		Manager manager = new Manager("Ankit Kale", 201, "Hr", 8);

		System.out.println(employee);
		System.out.println("---------------------------------------------------------------");
		System.out.println(manager);
	}
}
