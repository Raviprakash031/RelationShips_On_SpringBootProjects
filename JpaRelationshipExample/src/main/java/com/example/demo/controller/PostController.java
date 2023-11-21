package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Post;
import com.example.demo.service.PostService;


@Repository
public class PostController {
	@Autowired
	private PostService postService;
	
	@PostMapping("/addPost")
	 public ResponseEntity<String> addPost(@RequestBody Post post){
		 String result=postService.addPost(post) ;
		 return ResponseEntity.ok(result);
		 
	}

}
