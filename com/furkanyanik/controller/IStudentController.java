package com.furkanyanik.controller;

import java.util.List;

import com.furkanyanik.entites.Student;

public interface IStudentController {

	
	public Student saveStudent( Student student);
	
	public List<Student> getAllStudents(Student student);
	
	public Student getStudentById(Integer id);
	
	
	public void deleteStudent(Integer id);
	
	public Student updateStudent(Integer id,Student updateStudent);
	
	
}
