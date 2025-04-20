package com.acts.txt.io;

import java.time.LocalDate;

public class ValidationUtils {
	//get enum from String
	public static BookType getValidCourse(String bookType) {
		BookType bookEnum = null;
		try {
			bookEnum = BookType.valueOf(bookType);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		return bookEnum;
	}
	
	public static LocalDate validatePublishDate(String strDob) {
		LocalDate publishDate = LocalDate.parse(strDob);
		LocalDate today = LocalDate.now();
		
		if(publishDate.isBefore(today)) {
			return publishDate;
		}
		return null;
	}

}
