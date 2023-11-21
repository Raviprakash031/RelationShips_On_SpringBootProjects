package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Supervisor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int supervisorId;
	private String supervisorName;
	
	@OneToMany(cascade=CascadeType.ALL) //add r delete associated data base automatically
	@JoinColumn(name="SuperVisor_id")//owing side of the relationship
	private List<Task> tasks;

	public Supervisor(int supervisorId, String supervisorName, List<Task> tasks) {
		super();
		this.supervisorId = supervisorId;
		this.supervisorName = supervisorName;
		this.tasks = tasks;
	}

	public Supervisor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(int supervisorId) {
		this.supervisorId = supervisorId;
	}

	public String getSupervisorName() {
		return supervisorName;
	}

	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	
	
	

}
