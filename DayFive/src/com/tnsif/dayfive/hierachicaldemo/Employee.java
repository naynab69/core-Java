package com.tnsif.dayfive.hierachicaldemo;


//child 1 class
public class Employee extends Person{
	//data members
	private int empId;
	private String companyName;
	private String designation;
	private float salary;
	
	
	//default constructor
	public Employee() {
		super();
		System.out.println("Employee constructor");
		
	}
	
	//Para. Constructor
	
	public Employee(String name,String city,int age,int empId, String companyName, String designation, float salary) {
		super(name,city,age);
		this.empId = empId;
		this.companyName = companyName;
		this.designation = designation;
		this.salary = salary;
	}
	//getters and setters
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", companyName=" + companyName + ", designation=" + designation
				+ ", salary=" + salary + ", getName()=" + getName() + ", getCity()=" + getCity() + ", getAge()="
				+ getAge() + "]";
	}
	
	
	
	
	
	

}
