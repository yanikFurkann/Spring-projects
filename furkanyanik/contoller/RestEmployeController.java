package com.furkanyanik.contoller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.furkanyanik.services.EmployeeService;
import com.furkanyanikmodel.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/rest/api/employee")




public class RestEmployeController {
	
	
	@Autowired
	private EmployeeService employeeService;
	
	
	
	@GetMapping(path ="/list")

	//tüm listedeki çalışanları getirdi.
	
	
  public List<Employee> getAllEmployeeList()	{
		return	employeeService.getAllEmployeList();
		
			
		
		
	} 	
	//Id si belirlenen kişiyi getir. Örnek 1 numaralı kişi @pathveriable anatasyonu.

	
	
	@GetMapping( path = "/list/{id}"  )
	public Employee getEmployeeById(@PathVariable (name="id", required =  true  ) String id) {
		return employeeService.getEmployeeById(id);
		
		
	}

		
		
		
	}
	
	
	
	
	
	
	


