package com.cdac.acts.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {
	
	private static final String FORMAT = "dd/MM/yyyy";
	private static final String EMPTY = "";

	private DateUtils() {
		//Do nothing constructor to stop object instantiation
	}
	
	public static String getFormattedDate(LocalDate date) { 
		//null check
		if ( null == date) {
			return null;
		}
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMAT);
		return date.format(formatter);
	}
	
	/*
	 * this method takes String and returns date object
	 */
	public static LocalDate getDate(String strDate) throws ParseException { 
		//null check
		if ( null == strDate || EMPTY.equals(strDate)) {
			return null;
		}
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMAT);
		LocalDate date = LocalDate.parse(strDate, formatter);
		return date;
	}
}
