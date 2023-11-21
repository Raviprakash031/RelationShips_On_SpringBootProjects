package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;


@Service
public class PostService {
	@Autowired
	private PostRepository postRepo;
	//@Autowired
	//private JobSeekerRepository jobSeekerRepo;
	 public String addPost(Post post) {
		 Post post1=postRepo.save(post);
		 /*Post postl=post.getUser();
		 user.setPost(post1);
		 jobSeekerRepo.save(jobSeekerModel);*/
		 
		 
		 if(post1!=null) {
			 return " post added Successfully";
		 }
		 return "Something went wrong";
		 
	 }

}
