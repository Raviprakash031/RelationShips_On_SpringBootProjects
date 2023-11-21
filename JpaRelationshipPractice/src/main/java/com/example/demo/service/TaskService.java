package com.example.demo.service;

import java.util.Optional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;

@Service
public class TaskService {
	@Autowired
	private TaskRepository taskRepo;
	
	public Optional<Task> getTaskById(int taskId) {
		return taskRepo.findById(taskId);
	}
	
	public Task addTask(Task task) {
		 return taskRepo.save(task);
	}
	public List<Task> getAllTask(){
		return taskRepo.findAll();
	}
	

}
