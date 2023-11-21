package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
//one to many means=uni directional
//there is only owing side of relationShip
//There is no inverse side of relationShip
@Entity
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String name;
	
	//mapping always refers to inverse side
	@OneToMany(mappedBy="author",cascade=CascadeType.ALL,orphanRemoval=true)
	
	
	//@OneToMany(cascade=CascadeType.ALL) //add r delete associated data base automatically
	//@JoinColumn(name="Author_id")//owing side of the relationship
	private List<Book> book;
	public Author(int id, String name, List<Book> book) {
		super();
		this.id = id;
		this.name = name;
		this.book = book;
	}
	public Author() {
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
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	
	
	

}
