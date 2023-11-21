package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Student5 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String address;
	@ManyToMany(cascade=CascadeType.ALL)
	/*@JoinTable(
			name="student_courses",
			joinColumns=@JoinColumn(name="Student_Id"),
			inverseJoinColumns=@JoinColumn(name="Couse_id")
			
			)*/
	
	private List<Course> courses;
	public Student5(int id, String name, String address, List<Course> courses) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.courses = courses;
	}
	public Student5() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	
	
	
	

}
