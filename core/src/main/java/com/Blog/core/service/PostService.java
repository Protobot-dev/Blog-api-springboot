package com.Blog.core.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Blog.core.dao.IPostRepository;
import com.Blog.core.model.Post;

@Service
public class PostService {

	//@Autowired
	private final IPostRepository postRepository;
	
	public PostService(IPostRepository postRepository) {
		this.postRepository = postRepository;
	}
	
	public String createPost(Post post) {
		return postRepository.createPost(post);
	}
	
	public List<Post> getAllPost() {
		return postRepository.getAllPost();
	}
	
	public Optional<Post> getPostById(UUID id_post){
		return postRepository.getPostById(id_post);
	}
	
	public List<Post> getEnablePost(){
		return postRepository.getEnablePost();
	}
}
