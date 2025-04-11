package com.acts.emp.tester;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.acts.date.DateUtils;
import com.acts.emp.ContractEmployee;
import com.acts.emp.Employee;

public class EmployeeTester {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws ParseException {
		
		System.out.println("Please enter date in DD/MM/YYYY  format: ");
		String strDate = sc.next();
		
		Date date = DateUtils.getDate(strDate, DateUtils.DD_MM_YYYY);
		Employee empCon;
		empCon = new ContractEmployee("Shanthinath Shedbale","SW_ENGG",date,6000,22);
		System.out.println(empCon.calculateSalary());
	}

}
