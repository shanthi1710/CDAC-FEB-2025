package com.cdac.acts;
import java.time.LocalDate;
import java.util.Objects;

import com.cdac.acts.bookType.BookEnum;

public class Library {
	private String title;
	private BookEnum bookType;
	private double price;
	private LocalDate publishedDate;
	private String authorName;
	private int qty;
	
	public Library(String title, BookEnum bookType, double price, LocalDate publishedDate, String authorName, int qty) {
		 
		this.title = title;
		this.bookType = bookType;
		this.price = price;
		this.publishedDate = publishedDate;
		this.authorName = authorName;
		this.qty = qty;
	}
	public String getTitle() {
	    return title;
	}

	public BookEnum getBookType() {
	    return bookType;
	}

	public double getPrice() {
	    return price;
	}

	public LocalDate getPublishedDate() {
	    return publishedDate;
	}

	public String getAuthorName() {
	    return authorName;
	}

	public int getQty() {
	    return qty;
	}

	public void setQty(int qty) {
	    this.qty = qty;
	}
	@Override
	public int hashCode() {
		return Objects.hash(authorName, bookType, price, publishedDate, qty, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		return Objects.equals(authorName, other.authorName) && bookType == other.bookType
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(publishedDate, other.publishedDate) && qty == other.qty
				&& Objects.equals(title, other.title);
	}
	@Override
	public String toString() {
		return "Library [title=" + title + ", bookType=" + bookType + ", price=" + price + ", publishedDate="
				+ publishedDate + ", authorName=" + authorName + ", qty=" + qty + "]";
	}
	
	
	
}
