package com.Blog.core.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.Blog.core.dao.IBloggerRepository;
import com.Blog.core.model.Blogger;

@Service
public class BloggerService {

	@Autowired
	private final IBloggerRepository bloggerRepository;

	public BloggerService(@Qualifier("Mongo") IBloggerRepository bloggerRepository) {
		this.bloggerRepository = bloggerRepository;
	}
	
	public String createBlogger(Blogger blogger) {
		return bloggerRepository.createBlogger(blogger);
	}
	
	public List<Blogger> getAllBlogger(){
		return bloggerRepository.getAllBlogger();
	}
	
	public Optional<Blogger> getBloggerById(UUID id_blogger){
		return bloggerRepository.getBloggerById(id_blogger);
	}
	
	

}
