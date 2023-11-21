package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
 
@Entity
public class Workdays {
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int workdayId;
	private LocalDate date;
	@Column(columnDefinition="TIME")
	private LocalTime startTime;
	@Column(columnDefinition="TIME")
	private LocalTime endTime;
	
	public Workdays() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Workdays(int workdayId, LocalDate date, LocalTime startTime, LocalTime endTime) {
		super();
		this.workdayId = workdayId;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public int getWorkdayId() {
		return workdayId;
	}
	public void setWorkdayId(int workdayId) {
		this.workdayId = workdayId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	
}
	
	
