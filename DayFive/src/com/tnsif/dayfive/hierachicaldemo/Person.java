package com.tnsif.dayfive.hierachicaldemo;

//Parent class
public class Person {
	// data members
	private String name;
	private String city;
	private int age;

	//default constructor
	public Person() {
		System.out.println("Person class object is created");
		name="Prasad";
		city="Mumbai";
		age=21;
	}

	// para. constructor
	public Person(String name, String city, int age) {

		this.name = name;
		this.city = city;
		this.age = age;
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", age=" + age + "]";
	}

	
}
