package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.JobSeekerModel;
import com.example.demo.service.JobSeekerService;
@RestController
public class JobSeekerController {
	@Autowired
	private JobSeekerService jobSeekerService;
	
	@PostMapping("/addJobSeekers")
	 public ResponseEntity<String> addJobSeeker(@RequestBody JobSeekerModel jobSeeker){
		 String result=jobSeekerService.addJobSeeker(jobSeeker) ;
		 return ResponseEntity.ok(result);
		 
		 
	 }
	
}
