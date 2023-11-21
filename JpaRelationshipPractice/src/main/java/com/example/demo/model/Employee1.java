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
public class Employee1 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int employeeId;
	private String employeeName;
	
	@OneToMany(cascade=CascadeType.ALL) //add r delete associated data base automatically
	@JoinColumn(name="Employee_id")//owing side of the relationship
	private List<Task> tasks;
	
	@OneToMany(cascade=CascadeType.ALL) //add r delete associated data base automatically
	@JoinColumn(name="Employee_id")//owing side of the relationship
	private List<Workdays> days;

	public Employee1(int employeeId, String employeeName, List<Task> tasks, List<Workdays> days) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.tasks = tasks;
		this.days = days;
	}

	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public List<Workdays> getDays() {
		return days;
	}

	public void setDays(List<Workdays> days) {
		this.days = days;
	}

	
	

}
