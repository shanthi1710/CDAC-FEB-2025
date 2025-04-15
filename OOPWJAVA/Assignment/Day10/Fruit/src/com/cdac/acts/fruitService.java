package com.cdac.acts;
import java.util.ArrayList;
import java.util.Scanner;

public class fruitService {
	private ArrayList<fruit>fruitList=new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	
	public void addFruit() {
		System.out.println("Enter fruit name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter fruit color: ");
		String color = sc.nextLine();
		
		System.out.print("Enter fruit price: ");
        double price = sc.nextDouble();
        
        System.out.print("Enter fruit quantity: ");
        int quantity = sc.nextInt();
        
        sc.nextLine();
        
        fruit newFruit = new fruit(name,color,price,quantity);
        fruitList.add(newFruit);
        System.out.print("Fruit added successfully!");
	}
	public void removeFruitByIndex() {
		if(fruitList.isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		 
		System.out.println("Current fruits in list:");
        for (int i = 0; i < fruitList.size(); i++) {
            System.out.println(i + ": " + fruitList.get(i));
        }
		
		System.out.println("Enter index of fruit to remove: ");
		int ind = sc.nextInt();
		sc.nextLine();
		
		if(ind >=0 && ind<fruitList.size()) {
			fruit removedFruit = fruitList.remove(ind);
			System.out.println("Removed: "+removedFruit);
		}else {
			System.out.println("Invalid index!");
		}
	}
	public void displayAllFruits() {
		if(fruitList.isEmpty()) {
			System.out.println("No fruit in the list!");
		}
		System.out.println("\nList of fruits");
		for(fruit x:fruitList) {
			System.out.println(x);
		}
	}
}
