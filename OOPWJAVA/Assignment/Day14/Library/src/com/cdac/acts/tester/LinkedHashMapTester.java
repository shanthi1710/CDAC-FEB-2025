package com.cdac.acts.tester;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.time.LocalDate;
import com.cdac.acts.Library;
import com.cdac.acts.bookType.BookEnum;
import com.cdac.acts.execeptions.BookNotFoundException;
import com.cdac.acts.execeptions.DuplicateBookException;

public class LinkedHashMapTester {
    public static void main(String[] args) {
        Map<String, Library> bookMap = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Allot Book to Student");
            System.out.println("4. Take Book Return");
            System.out.println("5. Remove Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
            
            try {
                switch (choice) {
                    case 1:
                        addBook(bookMap, sc);
                        break;
                    case 2:
                        displayAllBooks(bookMap);
                        break;
                    case 3:
                        allotBook(bookMap, sc);
                        break;
                    case 4:
                        returnBook(bookMap, sc);
                        break;
                    case 5:
                        removeBook(bookMap, sc);
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (BookNotFoundException | DuplicateBookException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    private static void addBook(Map<String, Library> bookMap, Scanner sc) throws DuplicateBookException {
        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        
        if (bookMap.containsKey(title)) {
            throw new DuplicateBookException("Book with title '" + title + "' already exists!");
        }
        
        System.out.println("Available Book Types:");
        for (BookEnum type : BookEnum.values()) {
            System.out.println(type);
        }
        System.out.print("Enter book type: ");
        BookEnum bookType = BookEnum.valueOf(sc.nextLine().toUpperCase());
        
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        
        System.out.print("Enter published date (YYYY-MM-DD): ");
        LocalDate publishedDate = LocalDate.parse(sc.next());
        
        sc.nextLine();  
        System.out.print("Enter author name: ");
        String authorName = sc.nextLine();
        
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();
        
        bookMap.put(title, new Library(title, bookType, price, publishedDate, authorName, qty));
        System.out.println("Book added successfully!");
    }

    private static void displayAllBooks(Map<String, Library> bookMap) {
        if (bookMap.isEmpty()) {
            System.out.println("No books available in the library!");
            return;
        }
        
        System.out.println("\nAll Books in Library:");
        for (Library book : bookMap.values()) {
            System.out.println(book);
        }
    }

    private static void allotBook(Map<String, Library> bookMap, Scanner sc) throws BookNotFoundException {
        System.out.print("Enter book title to allot: ");
        String title = sc.nextLine();
        
        Library book = bookMap.get(title);
        if (book == null) {
            throw new BookNotFoundException("Book with title '" + title + "' not found!");
        }
        
        if (book.getQty() <= 0) {
            System.out.println("Book is out of stock!");
            return;
        }
        
        book.setQty(book.getQty() - 1);
        System.out.println("Book allotted successfully. Remaining quantity: " + book.getQty());
    }

    private static void returnBook(Map<String, Library> bookMap, Scanner sc) throws BookNotFoundException {
        System.out.print("Enter book title to return: ");
        String title = sc.nextLine();
        
        Library book = bookMap.get(title);
        if (book == null) {
            throw new BookNotFoundException("Book with title '" + title + "' not found!");
        }
        
        book.setQty(book.getQty() + 1);
        System.out.println("Book returned successfully. Current quantity: " + book.getQty());
    }

    private static void removeBook(Map<String, Library> bookMap, Scanner sc) throws BookNotFoundException {
        System.out.print("Enter book title to remove: ");
        String title = sc.nextLine();
        
        if (bookMap.remove(title) == null) {
            throw new BookNotFoundException("Book with title '" + title + "' not found!");
        }
        
        System.out.println("Book removed successfully!");
    }
}