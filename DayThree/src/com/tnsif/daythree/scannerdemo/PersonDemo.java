package com.tnsif.daythree.scannerdemo;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		
		

		// scanner object to accept user inputs
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name ");
		String name = sc.next();
		System.out.println("Enter your age ");
		int age = sc.nextInt();
		System.out.println("Enter your gender ");
		String gender = sc.next();
		System.out.println("Enter your Income ");
		int income = sc.nextInt();

		Person person1 = new Person();
		
		//person1.age=89;
		person1.setAge(age);
		person1.setName(name);
		person1.setGender(gender);
		person1.setIncome(income);

		TaxCalculation calc = new TaxCalculation();
		calc.calculateTax(person1);
		System.out.println(person1);

	}

}
