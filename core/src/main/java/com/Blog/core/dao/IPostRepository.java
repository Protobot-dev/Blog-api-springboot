package com.Blog.core.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Blog.core.model.Post;

public interface IPostRepository extends MongoRepository<Post, UUID> {

	String createPost(Post post);
	
	List<Post> getAllPost();
	
	Optional<Post> getPostById(UUID id_post);
	
	List<Post> getEnablePost();
	
	Optional<Post> changeAvailablePostById(UUID id_post);
	
	int addLikeById(UUID id_post);
	
	int deleteLikeById(UUID id_post);
}
