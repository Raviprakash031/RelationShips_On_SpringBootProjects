package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.AppException;
import com.example.demo.model.Student5;
import com.example.demo.service.Student5Service;
@RestController
public class Student5Controller {
	@Autowired
	private Student5Service studentService;
	
    
	@PostMapping("/addstudent")
	public String registerStudent(@RequestBody Student5 student) {
		 
		if(student.getName()==null) {
			throw new RuntimeException("null values came to controller");
		}
		String result=studentService.addStudent(student);
		return result;
	}

}
