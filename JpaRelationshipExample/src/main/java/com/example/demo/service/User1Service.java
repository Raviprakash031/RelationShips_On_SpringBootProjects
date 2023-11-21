package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User1;
import com.example.demo.repository.User1Repository;
@Service
public class User1Service {
	@Autowired
	private User1Repository userRepo;
	 public String addUser(User1 user) {
		 User1 user1=userRepo.save(user);
		 if(user1!=null) {
			 return "User Successfully registered";
		 }
		 return "Something went wrong";
	 }

}
