package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.service.AuthorService;

@RestController
public class AuthorController {
	@Autowired
	private AuthorService authorService;
	@PostMapping("/addAuthors")
	 public ResponseEntity<String> addAuthors(@RequestBody Author author){
		List<Book> books=author.getBook();
		 
	    // Set the association between books and author
	    for (Book book : books) {
	        book.setAuthor(author);
	    }
 
	    // Set the books for the author
	    author.setBook(books);
		 String result=authorService.addAuthor(author);
		 return ResponseEntity.ok(result);
	}

}
