package com.acts.emp.tester;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.acts.date.util.DateUtils;
import com.acts.emp.ContractEmployee;
import com.acts.emp.Employee;
import com.acts.emp.PermanentEmployee;

public class EmployeeTester2 {
	public static void main(String[] args) throws ParseException {
		
//03/10/2022		
		String strDate = "03/10/2022";
		Date date = DateUtils.getDate(strDate, DateUtils.DD_MM_YYYY);
		PermanentEmployee pe1 = new PermanentEmployee("Nisha", 
		"Developer", date, 25000,1000, 1000);
		
		System.out.println(pe1);
		System.out.println(pe1.calculateSalary());
		System.out.println(pe1.getBonus());
		
		Employee empRef = pe1;// upcasting
		System.out.println(empRef.calculateSalary());
		
		empRef = new ContractEmployee("Nisha", 
				"Developer", date, 1000,22);// upcasting
		
		//To call specific methods of child we need to downcast
		//Blind downcast class caste Exception
//		PermanentEmployee pe2 = (PermanentEmployee)empRef;
//		System.out.println(pe2.getBonus());
		
		
		if( empRef instanceof PermanentEmployee) {
			System.out.println("empRef is instance of PermanentEmployee");
			PermanentEmployee pe3 = (PermanentEmployee)empRef;
			System.out.println(pe3.getBonus());
		} else {
			System.out.println("empRef is not instance of PermanentEmployee");
		}
		
		empRef = pe1;
		
		if( empRef instanceof PermanentEmployee) {
			System.out.println("empRef is instance of PermanentEmployee");
			PermanentEmployee pe3 = (PermanentEmployee)empRef;
			System.out.println(pe3.getBonus());
		} else {
			System.out.println("empRef is not instance of PermanentEmployee");
		}
		
		
	}

}
