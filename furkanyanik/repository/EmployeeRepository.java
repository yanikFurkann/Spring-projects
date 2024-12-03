package com.furkanyanik.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.furkanyanikmodel.Employee;

@Repository
public class EmployeeRepository {
	

@Autowired
	
	private List<Employee> employeeList;
	
	public List<Employee>getAllEmployeeList(){
		
		return employeeList;
		
		
	}
	
	public Employee getEmployeeById(String id) {
		Employee findEmployee=null;
		for (Employee employee : employeeList) {
			if (id.equals(employee.getId())) {
				
				findEmployee=employee;
				break;
				
			}
		}
		return findEmployee;
		
	}
	


}
