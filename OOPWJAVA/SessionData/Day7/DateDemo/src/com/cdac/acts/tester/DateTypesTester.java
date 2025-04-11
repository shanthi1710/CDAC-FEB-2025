package com.cdac.acts.tester;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class DateTypesTester {

	public static void main(String[] args) {
		
//		Date date = new Date();
//		System.out.println(date);
//		
//		java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
//		System.out.println(sqlDate);
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		String strDate = localDate.toString();
		System.out.println(strDate);
		
		//String( 2025-04-10) -> LocalDate
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter date in YYYY-MM-DD format");
		String str = sc.next();
		LocalDate localDate1 = LocalDate.parse(str);
		System.out.println(localDate1);
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String str1 = localDate1.format(formatter);
		System.out.println(str1);
		
		LocalDate date = LocalDate.parse(str1, formatter);
		System.out.println(date);
		sc.close();
		

	}

}
