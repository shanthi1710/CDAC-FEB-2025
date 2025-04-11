package com.cdac.acts.tester;

import java.util.Arrays;
import java.util.Scanner;

import com.cdac.acts.Employee;

public class EmployeeTester2 {
	
	public static void main(String[] args) {
		
		Employee[]earr = new Employee[20];
		System.out.println(Arrays.toString(earr));
		System.out.println(earr.getClass());
		System.out.println(earr.getClass().getSuperclass());
		Scanner sc  = new Scanner(System.in);
		int count = 0;
		int choice = 0;
		do {
			System.out.println("*******Menu******");
			System.out.println("1. Add Employee");
			System.out.println("2. Print Employee by empId");
			System.out.println("3. Print All Employee Sorted by empId");
			System.out.println("0. exit");
			
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				sc.nextLine();
				System.out.println("Please enter emp name");
				String name = sc.nextLine();
				System.out.println("Please enter emp dept");
				String dept = sc.nextLine();
				System.out.println("Please enter emp salary");
				double salary = sc.nextDouble();
				Employee employee = new Employee(name, dept, salary);
				earr[count] = employee;
				System.out.println(employee.getClass());
				count++;
				System.out.println("Employee added with empId:" + employee.getEmpId());
				
			}break;
			case 2: {
				System.out.println("Please enter emp ID");
				int empId = sc.nextInt();
				boolean found = false;
				for ( int i =0; i < count  && !found; i++ ) {
					//Search by empid
					if(earr[i].getEmpId() == empId) {
						System.out.println("Employee found");
						//earr[i].printData();
						System.out.println(earr[i]);
						found = true;
					}
				}
				if( !found) {
					System.out.println("Employee not found");
				}
				
			}break;

			default:
				break;
			}
			
			
		} while(choice !=0);
		sc.close();
	}

}
