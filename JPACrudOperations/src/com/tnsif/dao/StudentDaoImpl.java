package com.tnsif.dao;

import javax.persistence.EntityManager;

import com.tnsif.entities.Student;

public class StudentDaoImpl implements StudentDao{
	
	private EntityManager entityManager;
	
	public StudentDaoImpl() {
	entityManager = JPAUtil.getEntityManager();
	}
	//retrieve-find
	@Override
	public Student getStudentById(int id) {
	Student student = entityManager.find(Student.class, id);
	return student;
	}
	
	//create-persist
	@Override
	public void addStudent(Student student) {
	entityManager.persist(student);
	}
	
	//delete-remove
	@Override
	public void removeStudent(Student student) {
	entityManager.remove(student);
	}
	
	//update-merge
	@Override
	public void updateStudent(Student student) {
	entityManager.merge(student);
	}
	
	@Override
	public void beginTransaction() {
	entityManager.getTransaction().begin();
	}
	@Override
	public void commitTransaction() {
	entityManager.getTransaction().commit();
	}



}
