package com.mimecast.books.client;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.mimecast.books.model.BookReview;

@Service
public class BookRestClient {

	 RestTemplate restTemplate = new RestTemplate();
	 
	    @Value("${books.review.base.path}")
	    public String bookBasePath;

		@Value("${api_key}")
		public String apiKey;
	
	public BookReview getBooksByAuthorName(String authorName) {
		String baseURL = bookBasePath;
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseURL).queryParam("author", authorName).queryParam("api-key", apiKey);
		System.out.println("Querying BooksByAuthor with url :: {} "+ builder.build().toString());
		try {
			ResponseEntity<BookReview> responseEntity = restTemplate.exchange(builder.build().toString(),
					HttpMethod.GET, null, new ParameterizedTypeReference<>() {
					});
			return responseEntity.getBody();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
