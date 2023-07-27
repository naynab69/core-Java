package com.tnsif.dayseven.covariantoverridingdemo;

public class StudentDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student(10, "Ameen", "CSE");
		s1.print();

		Student s2 = (Student) s1.clone();
		s2.setRollNo(11);
		s2.setName("Dilip");
		s2.setBranch("IT");
		s2.print();

		Student s3 = s1.clone();
		s2.setRollNo(12);
		s2.setName("Megana");
		s2.setBranch("ECE");
		s2.print();

	}

}
