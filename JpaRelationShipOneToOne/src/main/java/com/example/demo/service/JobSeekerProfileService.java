package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.JobSeekerModel;
import com.example.demo.model.JobSeekerProfile;
import com.example.demo.repository.JobSeekerProfileRepository;
import com.example.demo.repository.JobSeekerRepository;


@Service
public class JobSeekerProfileService {
	@Autowired
	private JobSeekerProfileRepository jobSeekerProfileRepo;
	//@Autowired
	//private JobSeekerRepository jobSeekerRepo;
	 public String addJobSeekerProfile(JobSeekerProfile jobSeekerProfile) {
		 JobSeekerProfile jobSeekerProfile1=jobSeekerProfileRepo.save(jobSeekerProfile);
		 /*JobSeekerModel jobSeekerModel=jobSeekerProfile1.getJobSeeker();
		 jobSeekerModel.setJobSeekerProfile(jobSeekerProfile1);
		 jobSeekerRepo.save(jobSeekerModel);*/
		 
		 
		 if(jobSeekerProfile1!=null) {
			 return "Job Seeker profile updated Successfully";
		 }
		 return "Something went wrong";
		 
	 }
	 
	 

}
