package com.cdac.acts;

public class StringTester2 {
	
//	private String str;
//	
//	public void printData(){
//		System.out.println(str);
//	}
	public static void main(String[] args) {
		String str1 = "CDAC";
		System.out.println(str1);
		String str2 = "CDACACTS";
		System.out.println(str2);
		
		//str1 = str1 + "ACTS";
		//str1 = str1.intern();
		str1 = str1.concat("ACTS");
		
		String str3 = new String("CDACACTS");
		System.out.println(str3);
		
		if( str3 == str2) {
			System.out.println(str3 + " same");
		} else {
			System.out.println("not same");
		}
		
		if( str3.equals(str2)) {
			System.out.println(str3 + " equal");
		} else {
			System.out.println("not equal");
		}
		
		if( str1 == str2) {
			System.out.println(str2 + "same");
		} else {
			System.out.println("not same");
		}
		
		if( str1.equals(str2)) {
			System.out.println(str2 + " equals");
		} else {
			System.out.println("not equals");
		}
	}

}
