package com.tnsif.dayfive.singleinheridemo;

//Parent class
public class Citizen {
	// data members
	private String name;
	private int id;
	private String address;
	private int age;
	private String birthPlace;

	// Default Constructor
	public Citizen() {
		System.out.println("Citizen object created");
	}

	// Parameterized Constructor
	public Citizen(String name, int id, String address, int age, String birthPlace) {

		this.name = name;
		this.id = id;
		this.address = address;
		this.age = age;
		this.birthPlace = birthPlace;
	}

	
	//getters and setters method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", id=" + id + ", address=" + address + ", age=" + age + ", birthPlace="
				+ birthPlace + "]";
	}
	
	
	
	

}
