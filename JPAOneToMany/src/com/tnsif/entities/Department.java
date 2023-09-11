package com.tnsif.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;
import java.io.Serializable;
import java.util.HashSet;

@Entity
@Table(name="DeptMaster")
public class Department implements Serializable {
	private static final long serialVersionUID=1L;
	
	@Id
	private int id;
	private String name;
	
	@OneToMany(mappedBy="dept",cascade=CascadeType.ALL)
	private Set<Employee> employee=new HashSet<>(); //Initialization requitred to avoid null pointer exception

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
	
	//this method will add employee to the department
	//cyclic 
	
	public void addEmployee(Employee employee)
	{
		employee.setDept(this);  //this will avoid nested cascade
		this.getEmployee().add(employee);
	}
	
	

}
