package com.Blog.core.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Blog.core.model.Blogger;

public interface IBloggerRepository  extends MongoRepository<Blogger, UUID>{

	String createBlogger (Blogger blogger);
	
	List<Blogger> getAllBlogger();
	
	Optional<Blogger> getBloggerById(UUID id_blogger);
	
	int getAllPostByBloggler(UUID id_blogger);
	
}
