package com.cdac.acts.tester;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.cdac.acts.Library;
import com.cdac.acts.bookType.BookEnum;
import com.cdac.acts.execeptions.DuplicateBookException;
import com.cdac.acts.execeptions.BookNotFoundException;

public class HashSetTester {
    
    public static void main(String[] args) {
        Set<Library> bookSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        
        int choice;
        
        do {
            display();
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  
            
            try {
                switch(choice) {
                    case 1:
                        addBook(bookSet, sc);
                        break;
                    case 2:
                        displayAllBook(bookSet);
                        break;
                    case 3:
                        allotBook(bookSet, sc);
                        break;
                    case 4:
                        returnBook(bookSet, sc);
                        break;
                    case 5:
                        removeBook(bookSet, sc);
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        sc.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice...");
                }
            } catch (DuplicateBookException | BookNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while(choice != 6);
    }
    
    private static void display() {
        System.out.println("\n1. Add Book");
        System.out.println("2. Display All Books");
        System.out.println("3. Allot Book to Student");
        System.out.println("4. Take Book Return");
        System.out.println("5. Remove Book");
        System.out.println("6. Exit");
    }
    
    private static void addBook(Set<Library> bookSet, Scanner sc) throws DuplicateBookException {
        System.out.print("Enter book title: ");
        String title = sc.nextLine();
         
        for (Library book : bookSet) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                throw new DuplicateBookException("Book with title '" + title + "' already exists!");
            }
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
        
        bookSet.add(new Library(title, bookType, price, publishedDate, authorName, qty));
        System.out.println("Book added successfully!");
    }
    
    private static void displayAllBook(Set<Library> bookSet) {
        if (bookSet.isEmpty()) {
            System.out.println("No books available in the library!");
            return;
        }
        
        System.out.println("\nAll Books in Library:");
        for (Library book : bookSet) {
            System.out.println(book);
        }
    }
    
    private static void allotBook(Set<Library> bookSet, Scanner sc) throws BookNotFoundException {
        System.out.print("Enter book title to allot: ");
        String title = sc.nextLine();
        
        Library foundBook = null;
        for (Library book : bookSet) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                foundBook = book;
                break;
            }
        }
        
        if (foundBook == null) {
            throw new BookNotFoundException("Book with title '" + title + "' not found!");
        }
        
        if (foundBook.getQty() <= 0) {
            System.out.println("Book is out of stock!");
            return;
        }
        
        foundBook.setQty(foundBook.getQty() - 1);
        System.out.println("Book allotted successfully. Remaining quantity: " + foundBook.getQty());
    }
    
    private static void returnBook(Set<Library> bookSet, Scanner sc) throws BookNotFoundException {
        System.out.print("Enter book title to return: ");
        String title = sc.nextLine();
        
        Library foundBook = null;
        for (Library book : bookSet) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                foundBook = book;
                break;
            }
        }
        
        if (foundBook == null) {
            throw new BookNotFoundException("Book with title '" + title + "' not found!");
        }
        
        foundBook.setQty(foundBook.getQty() + 1);
        System.out.println("Book returned successfully. Current quantity: " + foundBook.getQty());
    }
    
    private static void removeBook(Set<Library> bookSet, Scanner sc) throws BookNotFoundException {
        System.out.print("Enter book title to remove: ");
        String title = sc.nextLine();
        
        Library bookToRemove = null;
        for (Library book : bookSet) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                bookToRemove = book;
                break;
            }
        }
        
        if (bookToRemove == null) {
            throw new BookNotFoundException("Book with title '" + title + "' not found!");
        }
        
        bookSet.remove(bookToRemove);
        System.out.println("Book removed successfully!");
    }
}