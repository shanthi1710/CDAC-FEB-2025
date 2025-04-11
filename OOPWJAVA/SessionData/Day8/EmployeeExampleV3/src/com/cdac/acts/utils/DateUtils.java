package com.cdac.acts.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	private static final String FORMAT = "dd/MM/yyyy";
	private static final String EMPTY = "";

	private DateUtils() {
		//Do nothing constructor to stop object instantiation
	}
	
	public static String getFormattedDate(Date date) { 
		//null check
		if ( null == date) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
		return sdf.format(date);
	}
	
	/*
	 * this method takes String and returns date object
	 */
	public static Date getDate(String strDate) throws ParseException { 
		//null check
		if ( null == strDate || EMPTY.equals(strDate)) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
		Date date = sdf.parse(strDate);
		return date;
	}
}
