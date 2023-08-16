//Program to demonstrate Student entity - overriding of equals and hashcode methods 
package com.tnsif.dayseventeen.userdefinedobjects;

public class Student {
	int marks;
	String name;
	// Constructor
	public Student(String name, int marks)
	{
		this.marks = marks;
		this.name = name;
	}
	// Getters and Setters
	public int getMarks() { return marks; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public void setMarks(int marks) { this.marks = marks; }
	
	
	@Override public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + marks;
		result = prime * result
				+ ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	// if both the object references are
	// referring to the same object.
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		// type casting of the argument.
		Student other = (Student)obj;

		// comparing the state of argument with
		// the state of 'this' Object
		if (marks != other.marks)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		}
		else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}
	
}