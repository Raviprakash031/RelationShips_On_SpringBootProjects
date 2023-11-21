package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User1;
import com.example.demo.service.User1Service;




@RestController
public class UserController {
	
	@Autowired
	private User1Service userService;
	
	@PostMapping("/addUser")
	 public ResponseEntity<String> addJobSeeker(@RequestBody User1 user){
		 String result=userService.addUser(user) ;
		 return ResponseEntity.ok(result);
		 
		 
	 }

}
