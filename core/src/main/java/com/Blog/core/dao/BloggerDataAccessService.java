package com.Blog.core.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;

import com.Blog.core.model.Blogger;

//@Repository
public class BloggerDataAccessService {

	//@Autowired
	private IBloggerRepository bloggerRepository;
	
	public String createBlogger(Blogger blogger) {
		bloggerRepository.save(blogger);
		return "Blogger id created";
	}
	
	public List<Blogger> getAllBlogger(){
		return bloggerRepository.findAll();
	}
	
	public Optional<Blogger> getBloggerById(UUID id_blogger){
		return bloggerRepository.findById(id_blogger);
	}
	

	
}
