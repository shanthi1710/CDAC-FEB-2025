package com.cdac.acts.tester;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import com.cdac.acts.Address;
import com.cdac.acts.Employee;
import com.cdac.acts.enums.TitleEnum;
import com.cdac.acts.utils.DateUtils;

public class EmployeeTester {
	
	public static Address getAddressFromUser(Scanner sc) {
		System.out.println("Please enter line1");
		String line1 = sc.nextLine();
		System.out.println("Please enter line2");
		String line2 = sc.nextLine();
		System.out.println("Please enter landmark");
		String landmark = sc.nextLine();
		System.out.println("Please enter pin");
		String pin = sc.nextLine();
		Address address = new Address(line1, line2, landmark, pin);
		return address;
	}
	
	public static void main(String[] args) throws ParseException {
		Scanner sc  = new Scanner(System.in);
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
		Address perAddress = EmployeeTester.getAddressFromUser(sc);
		//Default ctor
		Employee e1 = new Employee();
		e1.setName(name);
		e1.setDoj(doj);
		e1.setPermAddress(perAddress);
		e1.setTitle(titleEnum);
		e1.setSalary(salary);
		System.out.println(e1);
		
		//Parameterized ctor
		Employee e2 = new Employee(name, salary, doj, titleEnum, perAddress);
		System.out.println(e2);
		
		sc.close();
	}

}
