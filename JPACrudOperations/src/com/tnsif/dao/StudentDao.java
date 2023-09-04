package com.tnsif.dao;

import com.tnsif.entities.Student;

public interface StudentDao {
	
	  Student getStudentById(int id);
	  void addStudent(Student student);
	  void removeStudent(Student student);
	  void updateStudent(Student student);
	  void commitTransaction();
	  void beginTransaction();

}
