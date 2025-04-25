package com.acts;

import java.time.LocalDate;
import java.util.*;
import java.time.format.DateTimeParseException;

public class tester {
    public static void main(String[] args) {
        String fileName = "D:/CDAC/Java/Assignments/Day16/LibrarySystem/src/Data.bin";
        Scanner sc = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();
        bookList = DataUtils.getSampleBooks();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n====== Book Library Menu ======");
            System.out.println("1. Add Book");
            System.out.println("2. Save Books to File");
            System.out.println("3. Read Books from File");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            try {
                switch (sc.nextInt()) {
                    case 1:
                        Book book = inputBookDetails(sc);
                        bookList.add(book);
                        System.out.println("Book added.");
                        break;

                    case 2:
                        if (bookList.isEmpty()) {
                            System.out.println("No books to save.");
                        } else {
                            BinIOUtils.saveData(bookList, fileName);
                            System.out.println("Books saved to file.");
                        }
                        break;

                    case 3:
                        System.out.println("Reading books from file:");
                        BinIOUtils.readData(fileName);
                        break;

                    case 4:
                        exit = true;
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid option. Try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine(); // clear the invalid input
            }
        }

        sc.close();
    }

    public static Book inputBookDetails(Scanner sc) {
        System.out.print("Enter ISBN: ");
        int isbn = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();

        LocalDate pubDate = null;
        while (pubDate == null) {
            System.out.print("Enter Publication Date (yyyy-MM-dd): ");
            try {
                pubDate = LocalDate.parse(sc.next());
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Try again.");
            }
        }

        sc.nextLine(); // consume newline if any

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        return new Book(isbn, name, pubDate, author);
    }
}
