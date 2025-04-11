package com.acts.emp.tester;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.acts.date.util.DateUtils;
import com.acts.emp.ContractEmployee;
import com.acts.emp.Employee;
import com.acts.emp.PermanentEmployee;

public class EmployeeTester {
	public static void main(String[] args) throws ParseException {
//		final String datePattern = "dd/MM/yyyy";
//		SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
//		 Date doj = dateFormat.parse("01/10/2022");
		 
//		Employee e1 = new Employee();
//		System.out.println(e1.getClass());
//		System.out.println(e1.getClass().getSuperclass());
//		System.out.println(e1);
//		
//		System.out.println(e1.toString());
		
		//PermanentEmployee pe1 = new PermanentEmployee();
//		System.out.println(pe1);
//		System.out.println(pe1.calculateSalary());
		
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Please enter date in DD/MM/YYYY format");
//		String strDate = scanner.next();
//		Date date = DateUtils.getDate(strDate, DateUtils.DD_MM_YYYY);
//		PermanentEmployee pe2 = new PermanentEmployee(123, "Deepak", 
//				"CEO", date,10000,100,52000);
//		
//		System.out.println(pe2);
//		System.out.println(pe2.calculateSalary());
		
//03/10/2022		
		System.out.println("Please enter date in DD/MM/YYYY format");
		String strDate = scanner.next();
		Date date = DateUtils.getDate(strDate, DateUtils.DD_MM_YYYY);
//		ContractEmployee ce1 = new ContractEmployee("Deepak", 
//				"CEO", date,6000, 22);
//		
//		System.out.println(ce1);
//		System.out.println(ce1.calculateSalary());
		
		//Widening
		int i = 10;
		double d = i;
		System.out.println(d);
		//Narrowing
		i = (int) d;
		
		//Parent class ref is referring to child class object
//		Employee empRef = ce1;
//		
//		System.out.println(empRef.calculateSalary());
//		Employee empRef1 =  new ContractEmployee("Nishant", 
//				"Developer", date,6000, 22);
//		System.out.println(empRef1.calculateSalary());
		
		Employee empRef2 =  null;
		//empRef2.calculateSalary();
		
		empRef2 = new PermanentEmployee("Nisha", 
				"Developer", date, 25000,1000, 1000);
		System.out.println(empRef2.calculateSalary());
		
		empRef2 =  new ContractEmployee("Deepak", 
				"CEO", date,6000, 22);
		System.out.println(empRef2.calculateSalary());
		
		
		scanner.close();
	}

}
