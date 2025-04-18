package com.cdac.acts.tester;
import com.cdac.acts.key.StudentKey;
import com.cdac.acts.School;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
    private static Map<StudentKey, School> studentMap = new HashMap<>();
	
	public static void main(String[] args) {
		
		int choice;
		do {
			display();
			System.out.println("Enter your choice:->");
			choice =sc.nextInt();
			sc.nextLine();
			switch(choice) {
				case 1:{
					addStudent();
					break;
				}
				case 2:{
					findStudnet();
					break;
				}
				case 3:{
					displayAllStudnet();
					break;
				}
				case 4:{
					System.out.println("Exit...");
					System.exit(0);
					sc.close();
					break;
				}
				default:{
					System.out.println("Invalid choice...");
				}
			}
		}while(choice!=4);
	}
	private static void display() {
		System.out.println("\nSchool Management System");
        System.out.println("1. Add Student");
        System.out.println("2. Find Student");
        System.out.println("3. Print All Students");
        System.out.println("4. Exit");
	}
	private static void addStudent() {
		System.out.println("....Enter Student Details....");
		System.out.println("Roll No: ");
		int rollNo = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Standard: ");
        String standard = sc.nextLine();
        System.out.print("Division: ");
        String division = sc.nextLine();
		
        StudentKey key = new StudentKey(standard, division, rollNo);
        School student = new School(rollNo, name, standard, division);
        
        if(studentMap.containsKey(key)) {
        	System.out.println("Student with this combination already exists!");
        }else {
        	studentMap.put(key, student);
        	System.out.println("Student added successfully!");
        }
	}
	private static void findStudnet() {
		System.out.println("....Enter Student Search Criteria....");
		System.out.print("Standard: ");
        String standard = sc.nextLine();
        System.out.print("Division: ");
        String division = sc.nextLine();
        System.out.print("Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine();
        
        StudentKey key = new StudentKey(standard, division, rollNo);
        School student = studentMap.get(key);
        
        if(student != null) {
            System.out.println("Student found: " + student);
        } else {
            System.out.println("Student not found!");
        }
        
	}
	private static void displayAllStudnet() {
		if(studentMap.isEmpty()) {
            System.out.println("No students in the system!");
            return;
        }
		
		System.out.println("\nList of All Students:");
        System.out.println("Total Students: " + studentMap.size());
        System.out.println("----------------------------------");
        
        for(Map.Entry<StudentKey, School> entry : studentMap.entrySet()) {
            System.out.println("Key Hashcode: " + entry.getKey().hashCode() + 
                             " -> " + entry.getValue());
        }
	}
}
