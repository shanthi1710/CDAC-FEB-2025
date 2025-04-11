package com.cdac.acts.tester;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import com.cdac.acts.Employee;
import com.cdac.acts.enums.TitleEnum;
import com.cdac.acts.utils.DateUtils;

public class EmployeeTester {
	
	public static void main(String[] args) throws ParseException {
		Scanner sc  = new Scanner(System.in);
		Employee e1 = getEmployee(sc);
		System.out.println(e1); // e1.toString(0
		
		
		sc.close();
	}

	private static Employee getEmployee(Scanner sc) throws ParseException {
		System.out.println("Please enter emp name");
		String name = sc.nextLine();
		System.out.println("Please enter date of joining in dd/MM/yyyy format");
		String strDate = sc.nextLine();
		Date doj = DateUtils.getDate(strDate);
		System.out.println("Please enter title from(SE,PE,HR)");
		String strTitle = sc.nextLine();
		TitleEnum titleEnum = TitleEnum.valueOf(strTitle);
		System.out.println("Please enter emp salary");
		double salary = sc.nextDouble();
		Employee e1 = new Employee(name, salary, doj, titleEnum);
		return e1;
	}

}
