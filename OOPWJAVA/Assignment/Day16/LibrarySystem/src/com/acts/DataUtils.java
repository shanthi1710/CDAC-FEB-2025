package com.acts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataUtils {
    
    // Returns a list of sample Book objects
    public static List<Book> getSampleBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1001, "Clean Code", LocalDate.of(2008, 8, 1), "Robert C. Martin"));
        books.add(new Book(1002, "Effective Java", LocalDate.of(2017, 12, 27), "Joshua Bloch"));
        books.add(new Book(1003, "Java: The Complete Reference", LocalDate.of(2018, 4, 11), "Herbert Schildt"));
        books.add(new Book(1004, "Head First Java", LocalDate.of(2005, 2, 9), "Kathy Sierra"));
        books.add(new Book(1005, "Thinking in Java", LocalDate.of(2006, 2, 20), "Bruce Eckel"));
        return books;
    }

    // Displays book details
    public static void displayBook(Book book) {
        if (book.getPubDate() == null) {
            System.out.println("No data found or error while reading the file.");
        } else {
            System.out.println("Book Details:");
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println("Name: " + book.getName());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Publication Date: " + book.getPubDate());
            System.out.println("---------------------------");
        }
    }
}
