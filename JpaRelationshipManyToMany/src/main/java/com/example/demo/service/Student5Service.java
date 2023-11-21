package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.Student5Repository;
import com.example.demo.model.Student5;

@Service
public class Student5Service {
	@Autowired
	private Student5Repository studentRepository;
	
	
	public String addStudent(Student5 student) {
		if(studentRepository.save(student)!=null)
			return "Registration was successfull";
		else
			return "Something went wrong";
		
	}

}
