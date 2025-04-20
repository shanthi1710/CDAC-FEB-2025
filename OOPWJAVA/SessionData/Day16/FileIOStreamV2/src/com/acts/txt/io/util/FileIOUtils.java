package com.acts.txt.io.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import com.acts.txt.io.Book;

public interface FileIOUtils {
//Static method in I/F
	static void saveBooksData(Set<Book> booksSet, String fileName) throws IOException{
		// PW  to store date in files
		// PW -> TEXT File
		//Try with resource for auto closure
		try(PrintWriter pw = new PrintWriter(new FileWriter(fileName))){
			booksSet.forEach(pw::println);
//			for(Book b : booksSet) {
//				pw.println(b);
//			}
			//booksSet.forEach(book -> pw.println(book));
		}// Closes PW
	}
}
