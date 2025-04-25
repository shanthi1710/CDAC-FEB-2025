package com.acts;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5390791306882424240L;
	private Integer isbn;
	private String name;
	private LocalDate pubDate;
	private String author;
	
	public Book() {
		this.isbn = 0;
		this.name = "Null";
		this.pubDate = null;
		this.author = "";
	}
	
	public Book(Integer isbn, String name, LocalDate pubDate, String author) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.pubDate = pubDate;
		this.author = author;
	}

	public Integer getIsbn() {
		return isbn;
	}

	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getPubDate() {
		return pubDate;
	}

	public void setPubDate(LocalDate pubDate) {
		this.pubDate = pubDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", pubDate=" + pubDate + ", author=" + author + "]";
	}
	
	
}
