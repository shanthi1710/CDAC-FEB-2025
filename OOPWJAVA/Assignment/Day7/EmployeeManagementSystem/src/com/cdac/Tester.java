package com.cdac;

import java.time.LocalDate;
import java.util.Scanner;

public class Tester {
	private static Scanner sc = new Scanner(System.in);
	private static Employee sarr[] = new Employee[100];
	private static int count = 0;

	public static void main(String[] args) {
		
		int choice;
		do {
			displayMenu();
			choice = sc.nextInt();
			switch(choice) {
			case 1: acceptData();break;
			case 2: printData();break;
			case 3: checkGrat();break;
			case 0: System.out.println("Exit");break;
			default: System.out.println("Invalid input");
			}
		}while(choice != 0);
	}
	
	public static void displayMenu() {
		System.out.println("Choose options from below(0 to exit)");
		System.out.println("1.Enter Employee Data");
		System.out.println("2.Display Employee data");
		System.out.println("3.Check Gratutity");
	}
	
	public static void acceptData() {
		System.out.println("Please Enter Employee Details");
		System.out.print("Employee Number: ");
		int empId = sc.nextInt();
		sc.nextLine();
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Department(HR/IT): ");
		String cou = sc.nextLine();
		DeptEnum dept = DeptEnum.valueOf(cou);
		//System.out.println("Enter Date of birth:");
		System.out.print("Birth Year: ");
		int year = sc.nextInt();
		System.out.print("Month: ");
		int month = sc.nextInt();
		System.out.print("Date: ");
		int date = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Joining Year: ");
		int jyear = sc.nextInt();
		System.out.print("Month: ");
		int jmonth = sc.nextInt();
		System.out.print("Date: ");
		int jdate = sc.nextInt();
		sc.nextLine();
		
		sarr[count] = new Employee(empId, name, dept, LocalDate.of(year, month, date),LocalDate.of(jyear, jmonth, jdate) );
		count++;	
	}
	
	public static void printData() {
		for(int i = 0; i < count; i++) {
			System.out.println(sarr[i]);
		}
	}
	
	public static void checkGrat(){
		for(int i = 0; i < count; i++) {
			LocalDate doj = sarr[i].getDoj();
			if( doj.plusYears(5).isBefore(LocalDate.now()) ) {
				System.out.println(sarr[i].getName() + " is eligible for gratutity");
			} else {
				System.out.println(sarr[i].getName() + " is not eligible for gratuity");
			}

		}
		
	}
	}