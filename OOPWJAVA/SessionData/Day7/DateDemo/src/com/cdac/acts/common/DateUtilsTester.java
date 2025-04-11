package com.cdac.acts.common;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class DateUtilsTester {
	public static void main(String[] args) throws ParseException {
		//Create Date object
		LocalDate todaysDate = LocalDate.now();
		System.out.println(todaysDate);
		String formattedString = DateUtils.getFormattedDate(todaysDate);
		System.out.println(formattedString);
		
		
		System.out.println("Please enter date in dd/MM/yyyy format");
		Scanner sc = new Scanner(System.in);
		String strDate = sc.nextLine();
		LocalDate date = DateUtils.getDate(strDate);
		System.out.println(date);
		System.out.println(DateUtils.getFormattedDate(date));
		sc.close();
		
	}

}
