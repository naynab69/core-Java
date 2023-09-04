package com.tnsif.service;

import com.tnsif.entities.Student;

public interface StudentService {
	
	 void addStudent(Student student);
	 void updateStudent(Student student);
	 void removeStudent(Student student);
	 Student findStudentById(int id);

}
