package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee1;
import com.example.demo.repository.Employee1Repository;



@Service
public class Employee1Service {
	@Autowired
	private Employee1Repository employeeRepo;
	
	public String addEmployee(Employee1 employee) {
		Employee1 employee1=employeeRepo.save(employee);
		if(employee1!=null) {
			return "Added succesfully";
		}
		
		return "Something went wrong";
		
	}

}
