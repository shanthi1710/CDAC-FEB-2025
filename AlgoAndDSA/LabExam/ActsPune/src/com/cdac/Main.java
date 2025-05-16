package com.cdac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice = 0, value, index;

        do {
        	display();
            System.out.print("Enter your choice: ");
            
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();  
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter value to add: ");
                    value = sc.nextInt();
                    System.out.print("Enter index (0-based): ");
                    index = sc.nextInt();
                    try {
                        list.add(value, index);
                        System.out.println("Value " + value + " added at index " + index);
                        System.out.println("Current list: " + list.toString());
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                    
                case 2:
                    if (list.size() == 0) {
                        System.out.println("List is empty!");
                        break;
                    }
                    System.out.print("Enter value to remove (last occurrence): ");
                    value = sc.nextInt();
                    list.removeLast(value);
                    System.out.println("Current list: " + list.toString());
                    break;
                    
                case 3:
                    System.out.println("Current list: " + list.toString());
                    break;
                    
                case 4:
                    list.printMiddle();
                    break;
                    
                case 5:
                	System.exit(0);
                	 sc.close();
                    System.out.println("Exiting program...");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            
        } while (choice != 5);
        
       
    }
    public static void display() {
    	 System.out.println("\n----- Singly Linked List Menu -----");
         System.out.println("1. Add element at index");
         System.out.println("2. Remove last occurrence of value");
         System.out.println("3. Print list");
         System.out.println("4. Print middle element");
         System.out.println("5. Exit");
    }
}