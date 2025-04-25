package com.acts;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public interface BinIOUtils {
	public static void saveData(List<Book> list, String fileName) {
		try(DataOutputStream dos = new DataOutputStream
				(new BufferedOutputStream
						(new FileOutputStream(fileName)))){
			for(Book book: list) {
			dos.writeInt(book.getIsbn());
			dos.writeUTF(book.getName());
			dos.writeUTF(book.getPubDate().toString());
			dos.writeUTF(book.getAuthor());
			}
			dos.flush();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public static void readData(String fileName) {
	    File file = new File(fileName);
	    if (file.exists() && file.canRead()) {
	        try (DataInputStream dis = new DataInputStream(
	                new BufferedInputStream(new FileInputStream(fileName)))) {
	            
	            while (true) {
	                try {
	                    int isbn = dis.readInt();
	                    String name = dis.readUTF();
	                    LocalDate pubDate = LocalDate.parse(dis.readUTF());
	                    String author = dis.readUTF();
	                    Book book = new Book(isbn, name, pubDate, author);
	                    System.out.println(book);
	                } catch (EOFException e) {
	                    break; // Reached end of file
	                }
	            }

	        } catch (IOException e) {
	            System.out.println("Error reading books: " + e.getMessage());
	        }
	    } else {
	        System.out.println("File not found or not readable.");
	    }
	}
}
