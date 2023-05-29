package com.mimecast.books.model;

import org.springframework.stereotype.Service;

@Service
public class AuthorRequest {
	
	public String authorName;

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

}
