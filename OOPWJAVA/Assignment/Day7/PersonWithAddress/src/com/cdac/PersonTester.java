package com.cdac;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class PersonTester {
	
	private static Person parr[] = new Person[100];
	private static Scanner sc = new Scanner(System.in);
	private static int count = 0;
	
	

	public static void main(String[] args) {
		
		int choice;
		do {
			displayMenu();
			choice = sc.nextInt();
			switch(choice) {
			case 1: acceptData();break;
			case 2: printData();break;
			case 3: calculateAge();sc.nextLine();break;
			case 0: System.out.println("Exit");break;
			default: System.out.println("Invalid input");
			}
		}while(choice != 0);

	}
	
	public static void displayMenu() {
		System.out.println("Enter option from below list");
		System.out.println("1.Enter person data");
		System.out.println("2.Display person data");
		System.out.println("3.check born before 15 Aug 1947");
		System.out.println("4.Calculate age");	
	}
	
	public static void acceptData() {
		System.out.println("Enter Person details");
		System.out.println("Enter Aadhar number");
		sc.nextLine();
		String aadNo = sc.nextLine();
		System.out.println("Enter Person name");
		String name = sc.nextLine();
		System.out.println("Enter birth year");
		int year = sc.nextInt();
		System.out.println("Enter birth month");
		int month = sc.nextInt();
		System.out.println("Enter birth date");
		int date = sc.nextInt();
		System.out.println("Enter Street");
		sc.nextLine();
		String street = sc.nextLine();	
		System.out.println("Enter city");
		String city = sc.nextLine();	
		System.out.println("Enter Pincode");
		String pincode = sc.nextLine();	
		Address address = new Address(street,city,pincode);
		parr[count]= new Person(aadNo, name, LocalDate.of(year, month, date),address);
		count++;
	}
	
	
	public static void printData() {
		for(int i = 0; i < count; i++) {
			System.out.println(parr[i]);
		}
	}
	
	public static void calculateAge() {
		
		System.out.print("Enter date of birth (YYYY-MM-DD): ");
		String str = sc.nextLine();
		LocalDate dob = LocalDate.parse(str);
		LocalDate currentDate = LocalDate.now();
		Period age = Period.between(dob, currentDate);
		System.out.println("Age of person is : " + age);
	
		}		
}
	
	
	

