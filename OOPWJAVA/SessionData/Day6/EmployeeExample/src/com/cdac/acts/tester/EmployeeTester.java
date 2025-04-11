package com.cdac.acts.tester;

import java.util.Scanner;

import com.cdac.acts.Employee;

public class EmployeeTester {
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		//employee.printData();
		Scanner sc  = new Scanner(System.in);
		
//		System.out.println("Please enter emp Id");
//		int empid = sc.nextInt();
//		sc.nextLine();
		System.out.println("Please enter emp name");
		String name = sc.nextLine();
		System.out.println("Please enter emp dept");
		String dept = sc.nextLine();
		System.out.println("Please enter emp salary");
		double salary = sc.nextDouble();
		
		//Employee employee3 = new Employee(empid, name, dept, salary);
		Employee employee3 = new Employee(name, dept, salary);
		
		//employee3.printData();
		sc.close();
	}

}
