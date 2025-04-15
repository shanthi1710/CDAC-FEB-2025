package com.cdac.acts.tester;

import java.util.Scanner;
import com.cdac.acts.fruitService;

public class fruitTester {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		fruitService fs = new fruitService();
		int choice;
		do {
			display();
			System.out.println("Enter your choice:->");
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
				case 1:{
					fs.addFruit();
					break;
				}
				case 2:{
					fs.removeFruitByIndex();
					break;
				}
				case 3:{
					fs.displayAllFruits();
					break;
				}
				case 4:{
					System.out.println("Exit...");
					sc.close();
					System.exit(0);
					break;
				}
				default:{
					System.out.println("Invalid choice!");
				}
			}
		}while(choice !=4);
	}
	
	private static void display() {
		System.out.println("\nFruit Management System");
        System.out.println("1. Add Fruit");
        System.out.println("2. Remove Fruit by Index");
        System.out.println("3. Display All Fruits");
        System.out.println("4. Exit");
	}

}
