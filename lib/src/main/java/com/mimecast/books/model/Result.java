package com.mimecast.books.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "url", "publication_dt", "byline", "book_title", "book_author", "summary", "uuid", "uri",
		"isbn13" })
public class Result {

	@JsonProperty("url")
	private String url;
	@JsonProperty("publication_dt")
	private String publicationDt;
	@JsonProperty("byline")
	private String byline;
	@JsonProperty("book_title")
	private String bookTitle;
	@JsonProperty("book_author")
	private String bookAuthor;
	@JsonProperty("summary")
	private String summary;
	@JsonProperty("uuid")
	private String uuid;
	@JsonProperty("uri")
	private String uri;
	@JsonProperty("isbn13")
	private List<String> isbn13;

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	@JsonProperty("url")
	public void setUrl(String url) {
		this.url = url;
	}

	@JsonProperty("publication_dt")
	public String getPublicationDt() {
		return publicationDt;
	}

	@JsonProperty("publication_dt")
	public void setPublicationDt(String publicationDt) {
		this.publicationDt = publicationDt;
	}

	@JsonProperty("byline")
	public String getByline() {
		return byline;
	}

	@JsonProperty("byline")
	public void setByline(String byline) {
		this.byline = byline;
	}

	@JsonProperty("book_title")
	public String getBookTitle() {
		return bookTitle;
	}

	@JsonProperty("book_title")
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	@JsonProperty("book_author")
	public String getBookAuthor() {
		return bookAuthor;
	}

	@JsonProperty("book_author")
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	@JsonProperty("summary")
	public String getSummary() {
		return summary;
	}

	@JsonProperty("summary")
	public void setSummary(String summary) {
		this.summary = summary;
	}

	@JsonProperty("uuid")
	public String getUuid() {
		return uuid;
	}

	@JsonProperty("uuid")
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@JsonProperty("uri")
	public String getUri() {
		return uri;
	}

	@JsonProperty("uri")
	public void setUri(String uri) {
		this.uri = uri;
	}

	@JsonProperty("isbn13")
	public List<String> getIsbn13() {
		return isbn13;
	}

	@JsonProperty("isbn13")
	public void setIsbn13(List<String> isbn13) {
		this.isbn13 = isbn13;
	}

}
