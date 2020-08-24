package com.Blog.core.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Blog.core.model.Blogger;
import com.Blog.core.service.BloggerService;

@RequestMapping("/signup")
@RestController
public class signupController {
	
	//@Autowired
	private BloggerService bloggerService;
	
	@PostMapping
	public String createBlogger(@RequestBody Blogger blogger) {
		return bloggerService.createBlogger(blogger);
	}

	
}
