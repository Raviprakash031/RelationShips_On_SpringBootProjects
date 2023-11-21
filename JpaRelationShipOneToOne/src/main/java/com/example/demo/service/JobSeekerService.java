package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.JobSeekerModel;
import com.example.demo.repository.JobSeekerRepository;
@Service
public class JobSeekerService {
	
	@Autowired
	private JobSeekerRepository jobSeekerRepo;
	 public String addJobSeeker(JobSeekerModel jobSeeker) {
		 JobSeekerModel jobSeeker1=jobSeekerRepo.save(jobSeeker);
		 if(jobSeeker1!=null) {
			 return "Successfully registered";
		 }
		 return "Something went wrong";
	 }

}
