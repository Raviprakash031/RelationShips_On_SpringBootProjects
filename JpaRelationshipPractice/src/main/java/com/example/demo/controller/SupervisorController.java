package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee1;
import com.example.demo.model.Supervisor;
import com.example.demo.model.Task;
import com.example.demo.service.Employee1Service;
import com.example.demo.service.SupervisorService;
import com.example.demo.service.TaskService;

@RestController
public class SupervisorController {
	@Autowired
	private SupervisorService supervisorService;
	
	@Autowired
	private TaskService taskService;
	
	
	@PostMapping("/addSupervisor")
	 public ResponseEntity<String> addSupervisor(@RequestBody Supervisor supervisor){
		
		 
	    
		 String result=supervisorService.addSupervisor(supervisor);
		 return ResponseEntity.ok(result);
	}
	
	public String assignTaskToSupervisor(@RequestBody Supervisor supervisor) {
		List<Task> tasks=supervisor.getTasks();
		for(Task t:tasks) {
			Optional<Task> task1=taskService.getTaskById(1);
		}
		return null;
		
	}
	@GetMapping("/getAllTasks")
	public List<Task> getAllTasks() {
		return taskService.getAllTask();
		
	}

}
