//To demonstrate Encapsulation 
package com.tnsif.daythree.encapsulationdemo;

public class OopsDemo {
	//Attributes/Field variables
	 private int serialNum;
	 private String name;
	 private int age;
	 
	 //Getter/setter methods
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	 
	//Object class method -to return string representation of the object
	
	@Override
	public String toString() {
		return "OopsDemo [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}
	 
	
	
	
	

}
