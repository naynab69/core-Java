package com.tnsif.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private String name;
	
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
