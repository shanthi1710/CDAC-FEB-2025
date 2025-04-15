package com.cdac.acts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.cdac.acts.comparator.colorComparator;
import com.cdac.acts.comparator.priceComparator;
import com.cdac.acts.comparator.qtyComparator;

public class fruitService {
    private ArrayList<fruit> fruitList = new ArrayList<>();
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
        sc.nextLine(); // consume newline
        
        fruit newFruit = new fruit(name, color, price, quantity);
        fruitList.add(newFruit);
        System.out.println("Fruit added successfully!");
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
        
        System.out.print("Enter index of fruit to remove: ");
        int ind = sc.nextInt();
        sc.nextLine();
        
        if(ind >= 0 && ind < fruitList.size()) {
            fruit removedFruit = fruitList.remove(ind);
            System.out.println("Removed: " + removedFruit);
        } else {
            System.out.println("Invalid index!");
        }
    }
    
    public void displayAllFruits() {
        if(fruitList.isEmpty()) {
            System.out.println("No fruits in the list!");
            return;
        }
        
        System.out.println("\nList of fruits:");
        for(fruit x : fruitList) {
            System.out.println(x);
        }
    }
    
    public void priceCompare() {
        Collections.sort(fruitList, new priceComparator());
        System.out.println("\nFruits sorted by price:");
        displayAllFruits();
    }
    
    public void colorCompare() {
        Collections.sort(fruitList, new colorComparator());
        System.out.println("\nFruits sorted by color:");
        displayAllFruits();
    }
    
    public void qtyCompare() {
        Collections.sort(fruitList, new qtyComparator());
        System.out.println("\nFruits sorted by quantity:");
        displayAllFruits();
    }
}