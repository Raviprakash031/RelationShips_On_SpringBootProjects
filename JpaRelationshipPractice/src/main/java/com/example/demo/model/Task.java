package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Task {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int taskId;
	private String taskDescription;
	
	

	public Task(int taskId, String taskDescription, Employee1 employee) {
		super();
		this.taskId = taskId;
		this.taskDescription = taskDescription;
		
	}

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	
	
	
	

}
