package com.furkanyanik.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.furkanyanikmodel.Employee;

@Configuration


public class AppConfig {


    @Bean
    List<Employee> employeeList(){
		List<Employee> employeeList= new ArrayList<>();
		
		employeeList.add(new Employee("1","Furkan","Yanık"));
		employeeList.add(new Employee("2","Sakine","Yanık"));
		employeeList.add(new Employee("3","Okan","Yüksel"));
		employeeList.add(new Employee("4","Eslem ","Eser"));
		employeeList.add(new Employee("5","Yusuf","Eser"));
		return employeeList;
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
