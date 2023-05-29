package com.mimecast.books.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mimecast.books.model.Author;
import com.mimecast.books.model.AuthorRequest;
import com.mimecast.books.service.BookService;

@RestController
@RequestMapping("/authors")
public class BookController {

	@Autowired
	BookService bookservice;

	@PostMapping()
	public ResponseEntity<String> addAuthor(@RequestBody AuthorRequest author) {
		System.out.println("In -> getAllBooksByAuthor Author {}" + author.getAuthorName());
		bookservice.saveAuthor(author.getAuthorName());
		System.out.println("Out ->  getAllBooksByAuthor ");
		return ResponseEntity.ok().build();
	}

	@GetMapping("/books")
	public List<Author> getAllAuthors() {
		return bookservice.getAllBooks();
	}
	
	@GetMapping("/{name}")
    public ResponseEntity<Author> getAuthorByName(@PathVariable String name) {
        Author author = bookservice.getAuthorByName(name);
        if (author != null) {
            return ResponseEntity.ok(author);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

	@GetMapping
	public String test() {
		return "Hello";
	}

}
