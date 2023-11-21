package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class User1 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
    private String name;
    private String email;
    
   @OneToMany(cascade=CascadeType.ALL)
   @JoinColumn(name="user_id")
	private List<Post> posts;

public User1(int id, String name, String email, List<Post> posts) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.posts = posts;
}

public User1() {
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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public List<Post> getPosts() {
	return posts;
}

public void setPosts(List<Post> posts) {
	this.posts = posts;
}
   
	
	
	
	
    

}
