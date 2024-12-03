package com.furkanyanik.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.furkanyanikmodel.Employee;

import com.furkanyanik.repository.EmployeeRepository;


@Service



public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	public List<Employee> getAllEmployeList(){
		
	return	employeeRepository.getAllEmployeeList();
		
		
		
		
		
		
	}
	
	public Employee getEmployeeById(String id) {
		return employeeRepository.getEmployeeById(id);
		
		
	}
	
	
	
	
	
	
}
