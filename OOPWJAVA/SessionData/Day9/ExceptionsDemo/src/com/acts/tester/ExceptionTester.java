package com.acts.tester;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionTester {


	public static void main(String[] args) throws ParseException {

		//NumberFormatException is unchecked exception
//		short s = Short.parseShort("Hi"); 
//		System.out.println(s);

		// ParseException is checked exception
		try {
			//Program to interface or abstract class but not to concrete class
			DateFormat sdf = new SimpleDateFormat();
			Date d = sdf.parse("Hi");
			System.out.println("Try complete");
		} catch(ParseException pe) {
			System.out.println("Catch complete");
			pe.printStackTrace();
			//return;
			throw pe;
		} finally {
			System.out.println("Finally complete");	
		}
	}
}
