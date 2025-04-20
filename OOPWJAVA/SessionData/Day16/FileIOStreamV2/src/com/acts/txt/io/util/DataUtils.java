package com.acts.txt.io.util;

import static com.acts.txt.io.BookType.COMEDY;
import static com.acts.txt.io.BookType.FICTION;
import static com.acts.txt.io.BookType.TECH;
import static com.acts.txt.io.BookType.THRILLER;
//Static import for parse method
import static java.time.LocalDate.parse;

import java.util.HashSet;
import java.util.Set;

import com.acts.txt.io.Book;

public interface DataUtils {
	 public static Set<Book> getBooksSet(){
		Set<Book> booksSet = new HashSet<>();
		booksSet.add(new Book("978-100", "Java 8 IN ACTION", "Raoul-Gabriel", TECH, parse("2010-04-24"), 800.00));
		booksSet.add(new Book("978-101", "Java FAQ", "Jonni M. Kanerva", TECH, parse("2012-10-18"), 600.00));
		booksSet.add(new Book("978-900", "Head First Java", "Kathy Sierra", TECH, parse("2015-04-20"), 1700.00));
		booksSet.add(new Book("978-140", "I Too Had a Love Story", " Ravinder Singh", FICTION, parse("1988-08-30"), 400.00));
		booksSet.add(new Book("978-150", "Brutal", "Uday Satpathy", THRILLER, parse("2010-04-24"), 600.00));
		booksSet.add(new Book("978-160", "Asa Mi Asami", "P. L. Deshapande", COMEDY, parse("1984-04-24"), 250.00));
		return booksSet;
	}
}
