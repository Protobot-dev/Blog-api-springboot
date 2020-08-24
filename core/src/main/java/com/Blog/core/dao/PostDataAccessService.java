package com.Blog.core.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Blog.core.model.Post;

@Repository("Mongo")
public class PostDataAccessService {

	@Autowired
	private IPostRepository postRepository;
	
	public String createPost(Post post) {
		postRepository.save(post);
		return "Post is created";
	}
	
	public List<Post> getAllPost() {
		return postRepository.findAll();
	}
	
	public Optional<Post> getPostById(UUID id_post){
		return postRepository.findById(id_post);
	}
	
	public List<Post> getEnablePost(){
		return getAllPost().stream()
			.filter(post -> post.isAvailable() == true)
			.collect(Collectors.toList());
	}
	
	
	//
	//public Optional<Post> changeAvailablePostById(UUID id_post, Post post){}
	
	//
	//public int addLikeById(UUID id_post, Post post) {}
	
	//
	//public int deleteLikeById(UUID id_post, Post post) {}
	
	
}
