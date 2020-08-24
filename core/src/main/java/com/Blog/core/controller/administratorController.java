package com.Blog.core.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Blog.core.model.Blogger;
import com.Blog.core.service.BloggerService;

@RequestMapping("/administrator")
@RestController
public class administratorController {

	//@Autowired
	private BloggerService bloggerService;
	
	@GetMapping
	public List<Blogger> getAllBlogger(){
		return bloggerService.getAllBlogger();
	}
	
	@GetMapping("/{id_blogger}")
	public Optional<Blogger> getBloggerById(@PathVariable UUID id_blogger){
		return bloggerService.getBloggerById(id_blogger);
	}
	
	
	
	
}
