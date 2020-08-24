package com.Blog.core.model;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Post")
public class Post {
	
	
	@Id
	private final UUID id_post;
	
	@Value("${post.title}")
	private final String title_post;
	
	@Value("${post.description}")
	private final String description_post;
	
	private final LocalDateTime created_at;
	
	private final UUID blogger_id;
	
	@Value("${post.available}")
	private final boolean available;
	
	@Value("${post.like}")
	private final int like;
	
	
	public Post(UUID id_post, 
				String title_post, 
				String description_post, 
				LocalDateTime created_at, 
				boolean available, 
				UUID blogger_id, 
				int like) {
		
		this.id_post = id_post;
		this.title_post = title_post;
		this.description_post = description_post;
		this.created_at = created_at;
		this.blogger_id = blogger_id;
		this.available = available;
		this.like = like;
	}


	public UUID getId_post() {
		return id_post;
	}


	public String getTitle_post() {
		return title_post;
	}


	public String getDescription_post() {
		return description_post;
	}


	public LocalDateTime getCreated_at() {
		return created_at;
	}


	public UUID getBlogger_id() {
		return blogger_id;
	}


	public boolean isAvailable() {
		return available;
	}


	public int getLike() {
		return like;
	}
	
	
	
}
