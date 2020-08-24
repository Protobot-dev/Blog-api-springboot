package com.Blog.core.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Blog.core.model.Post;
import com.Blog.core.service.PostService;

@RequestMapping("/")
@RestController
public class indexController {
	
	//@Autowired
	private PostService postService;
	
//	@GetMapping
//	public List<Post> getAllPost(){
//		return postService.getAllPost();
//		}

	@GetMapping
	public List<Post> getEnablePost(){
		return postService.getEnablePost();
	}
	
	@GetMapping("/{id_post}")
	public Optional<Post> getPostById(@PathVariable UUID id_post){
		return postService.getPostById(id_post);
	}
	

}
