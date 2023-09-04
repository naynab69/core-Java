package com.tnsif.client;

import com.tnsif.service.*;
import com.tnsif.entities.*;

public class Client {

	public static void main(String[] args) {
		
		StudentService service = new StudentServiceImpl();
		Student student = new Student();
		
		
		// Create Operation
		student.setid(7);
		student.setName("Atharva");
		service.addStudent(student);
		
		
		//at this breakpoint, we have added one record to table
		// Retrieve Operation
		student = service.findStudentById(2);
		System.out.print("ID:"+student.getid());
		System.out.println(" Name:"+student.getName()); 
		
		// Update Operation
		student = service.findStudentById(3);
		student.setName("Sachin Tendulkar");
		service.updateStudent(student);
		
		//at this breakpoint, we have updated record added in first section
		student = service.findStudentById(3);
		System.out.print("ID:"+student.getid());
		System.out.println(" Name:"+student.getName()); 
		
		//at this breakpoint, record is removed from table
		// Delete Operation
		student = service.findStudentById(1);
		service.removeStudent(student);
		System.out.println("End of program/Life cycle completed...");

}
}
