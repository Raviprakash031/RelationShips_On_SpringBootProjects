package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int courseId;
	private String courseName;
	@ManyToMany(mappedBy="courses")
	private List<Student5> student;
	public Course(int courseId, String courseName, List<Student5> student) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.student = student;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public List<Student5> getStudent() {
		return student;
	}
	public void setStudent(List<Student5> student) {
		this.student = student;
	} 
	
	
	

}
