package com.tnsif.dayfive.hierachicaldemo;

public class HieraDemo {

	public static void main(String[] args) {

		Person p=new Person(); //tight coupling
		System.out.println("Person class details...");
		System.out.println(p);
		
		
		//dynamic binding//runtime polymorphism//loose coupling
		Person p1;  //object reference
		p1=new Person("Tushar","Pune",20);
		if(p1 instanceof Person)
		{System.out.println(p1);}
		
		p1=new Employee("Shoheb","South Mumbai",22,100,"TNS","Developer",50000);
		if(p1 instanceof Employee)
		System.out.println(p1);
		
		p1=new Student("Chitriki","Banglore",21,007,"IT","XYZ");
		if(p1 instanceof Student)
		System.out.println(p1);
		
		


	}

}
