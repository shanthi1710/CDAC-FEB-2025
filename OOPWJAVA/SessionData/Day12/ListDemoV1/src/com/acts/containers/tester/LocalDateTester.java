package com.acts.containers.tester;

import java.time.LocalDate;
import java.util.Date;

import com.acts.ValidationUtils;

public class LocalDateTester {

	public static void main(String[] args) {
		LocalDate today =  LocalDate.now();
		today = today.minusYears(21);
		System.out.println(today);
		
		String strDate = "2022-10-05";
		LocalDate dob = LocalDate.parse(strDate);
		System.out.println(dob);
		
		LocalDate d = ValidationUtils.validateDob(strDate);
		if(null == d) {
			System.out.println("invalid DOB");
		}
		System.out.println(d);
		

	}

}
