package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.JobSeekerProfile;
import com.example.demo.service.JobSeekerProfileService;

@RestController
public class JobSeekerProfileController {
	@Autowired
	private JobSeekerProfileService jobSeekerProfileService;
	
	@PostMapping("/updateProfile")
	 public ResponseEntity<String> addJobSeekerProfile(@RequestBody JobSeekerProfile jobSeeker){
		 String result=jobSeekerProfileService.addJobSeekerProfile(jobSeeker) ;
		 return ResponseEntity.ok(result);
		 
	}

}
