package com.furkanyanik.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.furkanyanik.controller.IStudentController;
import com.furkanyanik.entites.Student;
import com.furkanyanik.services.IStudentServices;

import jakarta.persistence.Id;
@RestController


//path verip test e

@RequestMapping("/rest/api/student")





public class StudentControllerimpl implements IStudentController {
@Autowired
	private IStudentServices studentServices;
	
	
	@PostMapping(path = "/save")
	
	@Override
	public Student saveStudent(@RequestBody Student student) {
		// TODO Auto-generated method stub
		return studentServices.saveStudent(student);
	}

@GetMapping(path = "/list")
	@Override
	public List<Student> getAllStudents(Student student) {
	return 	studentServices.getAllStudents();
		
	}
@GetMapping (path = "/list/{id}")
@Override
public Student getStudentById( @PathVariable(name ="id")  Integer id) {
	return studentServices.getStudentById(id);
	
}

@DeleteMapping(path = "/delete/{id}")
@Override
public void deleteStudent(@PathVariable(name = "id")  Integer id) {
	
	studentServices.deleteStudent(id);
}

@PutMapping(path = "/update/{id}")

public Student updateStudent(@PathVariable(name = "id") Integer id,@RequestBody Student updateStudent) {
	// TODO Auto-generated method stub
	return studentServices.updateStudent(id, updateStudent);
}




}
