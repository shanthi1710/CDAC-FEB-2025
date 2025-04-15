package com.cdac.acts.tester;

import java.util.Scanner;
import com.cdac.acts.fruitService;

public class fruitTester {
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        fruitService fs = new fruitService();
        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice:-> ");
            choice = sc.nextInt();
            sc.nextLine();  
            
            switch(choice) {
                case 1:
                    fs.addFruit();
                    break;
                case 2:
                    fs.removeFruitByIndex();
                    break;
                case 3:
                    fs.displayAllFruits();
                    break;
                case 4:
                    fs.colorCompare();
                    break;
                case 5:
                    fs.qtyCompare();
                    break;
                case 6:
                    fs.priceCompare();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while(choice != 7); 
    }
    
    private static void displayMenu() {
        System.out.println("\nFruit Management System");
        System.out.println("1. Add Fruit");
        System.out.println("2. Remove Fruit by Index");
        System.out.println("3. Display All Fruits");
        System.out.println("4. Sort by Color");
        System.out.println("5. Sort by Quantity");
        System.out.println("6. Sort by Price");
        System.out.println("7. Exit");
    }
}