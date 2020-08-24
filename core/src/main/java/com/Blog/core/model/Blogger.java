package com.Blog.core.model;

import java.util.UUID;


import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Blogger") 
public class Blogger {
	
	private final UUID id_blogger;
	
	private final String username;
	
	private final UUID[] id_post;
	
	public Blogger(	UUID id_blogger, 
					String username, 
					UUID[] id_post) {
		this.id_blogger = id_blogger;
		this.username = username;
		this.id_post = id_post;
	}

	public UUID getId_blogger() {
		return id_blogger;
	}

	public String getUsername() {
		return username;
	}


	public UUID[] getId_post() {
		return id_post;
	}
	
	

}
