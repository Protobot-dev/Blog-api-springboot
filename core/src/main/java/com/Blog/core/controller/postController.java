package com.Blog.core.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Blog.core.model.Post;
import com.Blog.core.service.PostService;

@RequestMapping("/post-maker")
@RestController
public class postController {

	
	//@Autowired
	private PostService postService;
	
	@PostMapping
	public String createPost(@RequestBody Post post) {
		return postService.createPost(post);
	}
	
}
