package com.mimecast.books.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mimecast.books.client.BookRestClient;
import com.mimecast.books.model.Author;
import com.mimecast.books.model.BookReview;
import com.mimecast.books.model.Result;
import com.mimecast.books.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRestClient restClient;

	@Autowired
	private BookRepository bookRepository;

	public List<Author> getBooksForAuthor(String authorName) {
		BookReview books = restClient.getBooksByAuthorName(authorName);
		System.out.println("books -- " + books.getResults());
		
		List<Author> authorList = new ArrayList<Author>();
		
		for(Result bookreview : books.getResults()) {
			Author a = new Author();
			a.setName(bookreview.getBookAuthor());
			a.setBookName(bookreview.getBookTitle());
			a.setBookSummary(bookreview.getSummary());
			authorList.add(a );
		}
		System.out.println("bookList---"+authorList);
		return authorList;
	}

	public List<Author> saveAuthor(List<Author> authorList ) {
		
		return bookRepository.saveAll(authorList);
	}
	
	public void saveAuthor(String author) {
		List<Author> result = getBooksForAuthor(author);
		saveAuthor(result);
	}

	public List<Author> getAllBooks() {
		return bookRepository.findAll();
	}
}
