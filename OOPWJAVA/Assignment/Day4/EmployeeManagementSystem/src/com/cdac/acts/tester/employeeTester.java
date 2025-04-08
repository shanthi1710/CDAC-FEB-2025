package com.cdac.acts.tester;
import java.util.Scanner;
import com.cdac.acts.employee;

public class employeeTester {
	private static employee arr[] = new employee[100];
	private static int employeeCount = 0;
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int choice;
		do {
			System.out.println("Enter your choice");
			System.out.println("1. Add Employee");
			System.out.println("2. Print Employee by empId");
			System.out.println("3. Print Employee Sorted by Salary");
			System.out.println("0. exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1: addEmployee();
					break;
			case 2: searchEmpId();
					break;
			case 3: sortEmployee();
					break;
			case 0: System.out.println("Bye");
					break;
			default: System.out.println("Invalid Input");			
		}
		}while(choice != 0);
	}
	
	private static void addEmployee() {
		
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter Salary: ");
		int marks = sc.nextInt();
		arr[employeeCount++] = new employee(name, marks);
		System.out.println("Employee data added successfully!");
	}
	
	private static void searchEmpId() {	
		System.out.println("Enter emp id: ");
		int rn = sc.nextInt();
		boolean found = false;
		for(int i = 0; i < employeeCount; i++) {
			if(rn == arr[i].getEmpId()) {
				System.out.println(arr[i]);
				found = true;
			}			
		}
		if(found != true) {
			System.out.println("The roll number not found!");
		}
	}
		
	private static void sortEmployee() {
		for(int i = 0; i < employeeCount ; i++) {
			for(int j = 0; j < employeeCount - i - 1; j++) {
				if(arr[j].getSalary() < arr[j + 1].getSalary()) {
					employee temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for(int i = 0; i < employeeCount; i++) {
			System.out.println(arr[i]);
		}
	}
		
}