package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee1;
import com.example.demo.model.Supervisor;
import com.example.demo.repository.Employee1Repository;
import com.example.demo.repository.SupervisorRepository;

@Service
public class SupervisorService {
	@Autowired
	private SupervisorRepository supervisorRepo;
	
	public String addSupervisor(Supervisor supervisor) {
		Supervisor supervisor1=supervisorRepo.save(supervisor);
		if(supervisor1!=null) {
			return "Added succesfully";
		}
		
		return "Something went wrong";
		
	}

}
