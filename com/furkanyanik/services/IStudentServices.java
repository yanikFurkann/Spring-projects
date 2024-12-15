package com.furkanyanik.services;

import java.util.List;

import com.furkanyanik.entites.Student;

public interface IStudentServices {

	public Student saveStudent(Student student);
	
	
	public List<Student> getAllStudents();
	
	public Student getStudentById(Integer id);

public void deleteStudent(Integer ıd);
	public Student updateStudent(Integer id,Student updateStudent);
	
	
}
