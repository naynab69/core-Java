package com.tnsif.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//Create a new Department
		Department dept=new Department();
		dept.setId(1);
		dept.setName("Admin");
		
		Department dept1=new Department();
		dept1.setId(2);
		dept1.setName("HR");
		
		//create  new employees
		Employee e1=new Employee();
		e1.setId(100);
		e1.setName("Ameen");
		e1.setSalary(80000);
		
		Employee e2=new Employee();
		e2.setId(101);
		e2.setName("Dhanashri");
		e2.setSalary(78000);
		
		Employee e3=new Employee();
		e3.setId(102);
		e3.setName("Latha");
		e3.setSalary(85000);
		
		//add these employees to department
		dept.addEmployee(e1);
		dept.addEmployee(e3);
		dept1.addEmployee(e2);
		
		//save the data in dept and employee table
		em.persist(dept);
		em.persist(dept1);
		
		em.getTransaction().commit();
		
		System.out.println("Added department and employee to the databse");
		em.close();
		factory.close();
		
		
		
		
		
		

	}

}
