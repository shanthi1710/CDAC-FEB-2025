package com.acts.date.util.tester;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.acts.date.util.DateUtils;

public class DateTester {
	
	
	public static void main(String[] args) throws ParseException {

		//Way1
		Date date = new Date();
		System.out.println(date);

		//Way2
		Date date1 = new Date(System.currentTimeMillis());
		System.out.println(date1);

		//Way 3

		SimpleDateFormat dateFormat = new SimpleDateFormat(DateUtils.DD_MM_YYYY);
		Date date3 = dateFormat.parse("01/10/2022");
		System.out.println(date3);
		String strDate = dateFormat.format(date3);
		System.out.println(strDate);
		
		//Way4
		Date doj = DateUtils.getDate("31/12/2021", DateUtils.DD_MM_YYYY);
		System.out.println(DateUtils.getFormattedDate(doj, DateUtils.DD_MM_YYYY));

	}
}
