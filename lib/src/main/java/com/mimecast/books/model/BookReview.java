package com.mimecast.books.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "status", "copyright", "num_results", "results" })
public class BookReview {

	@JsonProperty("status")
	private String status;
	@JsonProperty("copyright")
	private String copyright;
	@JsonProperty("num_results")
	private Integer numResults;
	@JsonProperty("results")
	private List<Result> results;

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("copyright")
	public String getCopyright() {
		return copyright;
	}

	@JsonProperty("copyright")
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	@JsonProperty("num_results")
	public Integer getNumResults() {
		return numResults;
	}

	@JsonProperty("num_results")
	public void setNumResults(Integer numResults) {
		this.numResults = numResults;
	}

	@JsonProperty("results")
	public List<Result> getResults() {
		return results;
	}

	@JsonProperty("results")
	public void setResults(List<Result> results) {
		this.results = results;
	}
	
	@Override
	public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append(BookReview.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
	sb.append("status");
	sb.append('=');
	sb.append(((this.status == null)?"<null>":this.status));
	sb.append(',');
	sb.append("copyright");
	sb.append('=');
	sb.append(((this.copyright == null)?"<null>":this.copyright));
	sb.append(',');
	sb.append("numResults");
	sb.append('=');
	sb.append(((this.numResults == null)?"<null>":this.numResults));
	sb.append(',');
	sb.append("results");
	sb.append('=');
	sb.append(((this.results == null)?"<null>":this.results));
	sb.append(',');
	if (sb.charAt((sb.length()- 1)) == ',') {
	sb.setCharAt((sb.length()- 1), ']');
	} else {
	sb.append(']');
	}
	return sb.toString();
	}


}
