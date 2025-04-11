package com.acts.emp.tester;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.acts.date.util.DateUtils;
import com.acts.emp.Employee;
import com.acts.emp.PermanentEmployee;

public class EmployeeTester {
	public static void main(String[] args) throws ParseException {
		
//		Employee e1 = new Employee(123, "raja", "SE", new Date());
//		System.out.println(e1);
//		System.out.println(e1.toString());
//		System.out.println(e1.getClass());
//		System.out.println(e1.getClass().getSuperclass());
		
//		
//		PermanentEmployee pe1 = new PermanentEmployee();
//		System.out.println(pe1);
//		System.out.println(pe1.calculateSalary());
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter date in DD/MM/YYYY format");
		String strDate = scanner.next();
		Date date = DateUtils.getDate(strDate, DateUtils.DD_MM_YYYY);
		
		
//		PermanentEmployee pe2 = new PermanentEmployee(123, "Deepak", 
//				"CEO", date,10000,100,52000);
//		System.out.println(pe2);
//		System.out.println(pe2.calculateSalary());
		
		
		Employee pe2 = new PermanentEmployee(123, "Deepak", 
				"CEO", date,10000,100,52000);
		System.out.println(pe2);
		System.out.println(pe2.calculateSalary());
		
		scanner.close();
	}

}
