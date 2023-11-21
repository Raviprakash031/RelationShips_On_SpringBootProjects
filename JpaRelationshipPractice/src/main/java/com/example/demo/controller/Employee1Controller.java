package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee1;
import com.example.demo.model.Task;
import com.example.demo.service.Employee1Service;



@RestController
public class Employee1Controller {
	@Autowired
	private Employee1Service employeeService;
	@PostMapping("/addEmployees")
	 public ResponseEntity<String> addEmployee(@RequestBody Employee1 employee){
		List<Task> tasks=employee.getTasks();
		 
	    
		 String result=employeeService.addEmployee(employee);
		 return ResponseEntity.ok(result);
	}

}
