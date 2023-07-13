//To demonstrate how to create objects using constructor

package com.tnsif.daythree.constructordemo;
import java.util.Scanner;

public class CustomerDemo {

	public static void main(String[] args) {
		
		Customer c4=new Customer();
		c4.setCustomerId(100);
		c4.setName("Firoz");
		c4.setPhNo(764386328);
		System.out.println(c4);
		
		
		Scanner sc=new Scanner(System.in);
		
		  String name; int id; double phNo;
		  
		  System.out.println("Enter id "); id=sc.nextInt();
		  System.out.println("Enter name"); name=sc.next();
		  System.out.println("Enter Phone number "); phNo=sc.nextDouble();
		  
		  Customer c3=new Customer(id,name,phNo); System.out.println(c3);
		 
		
		
		/*
		 * Customer c=new Customer(); //calling default constructor
		 * 
		 * System.out.println(c);
		 * 
		 * Customer c1=new Customer(12,"Dilip",13675472); //calling para.Constructor
		 * System.out.println(c1);
		 */

		sc.close(); //killed object
		//sc.next(); //Illegal state exception
		
	}

}
