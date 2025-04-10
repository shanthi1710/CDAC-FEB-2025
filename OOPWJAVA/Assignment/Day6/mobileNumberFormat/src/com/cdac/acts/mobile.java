package com.cdac.acts;
import java.util.Scanner;
public class mobile {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		 
		System.out.println("Enter mobile number: ");
		String mobileNumber = sc.nextLine().trim();
		
		try {
			String formattedNumber = formatMobileNumber(mobileNumber);
			System.out.println("Formatted number: "+formattedNumber);
		}catch(IllegalArgumentException e) {
			
			System.out.println("Error: "+e.getMessage());
			
		}
	}
	
	public static String formatMobileNumber(String mb) {
		String digitsOnly = mb.replaceAll("[^0-9]","");
		
		if(digitsOnly.length()<10 ||  digitsOnly.length() >12 || digitsOnly.length() ==11) {
			throw new IllegalArgumentException("Number must have at least 10 digit");
		}
		
		String last10Digits = digitsOnly.substring(digitsOnly.length()-10);
		
		return "+91-" + last10Digits.substring(0,3)+"-"+last10Digits.substring(3,6)+"-"+last10Digits.substring(6);
	}

}
