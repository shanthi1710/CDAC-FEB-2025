package com.acts;

import java.time.LocalDate;

public class ValidationUtils {
	public static LocalDate validateDate(LocalDate date) {
		if(date.isBefore(LocalDate.now())) {
			return date;
		} else {
			return null;
		}
	}
	
	public static String validatePhone(String num) {
		if(num.length() == 10) {
			return num;
		} else {
			return null;
		}
	}
}
