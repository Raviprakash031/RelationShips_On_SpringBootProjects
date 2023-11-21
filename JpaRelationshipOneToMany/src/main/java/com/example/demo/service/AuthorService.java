package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Author;
import com.example.demo.repository.AuthorRepository;

@Service
public class AuthorService {
	@Autowired
	private AuthorRepository authorRepo;
	
	public String addAuthor(Author author) {
		Author author1=authorRepo.save(author);
		if(author1!=null) {
			return "Added succesfully";
		}
		
		return "Something went wrong";
		
	}

}
