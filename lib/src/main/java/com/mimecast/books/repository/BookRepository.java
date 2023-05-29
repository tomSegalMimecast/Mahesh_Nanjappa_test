package com.mimecast.books.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mimecast.books.model.Author;

@Repository
public interface BookRepository extends MongoRepository<Author, String> {

	Author findByName(String name);
    // Additional custom queries can be defined here
}

