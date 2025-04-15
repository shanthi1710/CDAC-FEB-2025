package com.cdac.acts;
import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        
        System.out.println("Enter 10 double number: ");
        int cnt = 0;
        
        do {
            System.out.print("Enter number "+ (cnt + 1)+ ": ");
            if (sc.hasNextDouble()) {
                double ele = sc.nextDouble();
                numbers.add(ele);
                cnt++;
            } else {
                System.out.println("Invalid input. Please enter a double number.");
                sc.next(); 
            }
        } while(cnt < 10);
        
        double sum = 0;
        for(double x : numbers) {
            sum += x;
        }
        
        System.out.println("\nSum of all numbers: "+sum);
        
        System.out.println("\nEnter a number to find in the list: ");
        double searchNum = sc.nextDouble();  
        int index = numbers.indexOf(searchNum);
        if (index != -1) {
            System.out.println("First occurrence of " + searchNum + " is at index: " + index);
        } else {
            System.out.println(searchNum + " not found in the list.");
        }
        
        System.out.print("Enter an element to check if it exists: ");
        double checkNum = sc.nextDouble();
        System.out.println("Contains " + checkNum + "? " + numbers.contains(checkNum));
        
        sc.close();
    }
}