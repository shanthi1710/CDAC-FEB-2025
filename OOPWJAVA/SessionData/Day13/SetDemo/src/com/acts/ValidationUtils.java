package com.acts;

import java.time.LocalDate;

public class ValidationUtils {
	//get enum from String
	public static Course getValidCourse(String course) {
		Course courseEnum = null;
		try {
			courseEnum = Course.valueOf(course);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		return courseEnum;
	}
	
	public static LocalDate validateDob(String strDob) {
		LocalDate dob = LocalDate.parse(strDob);
		
		LocalDate today = LocalDate.now();
		LocalDate requiredDate = today.minusYears(18);
		
		if(dob.isBefore(requiredDate)) {
			return dob;
		}
		return null;
	}

}
