package com.cdac.acts;

public class StringBasic {

	public static void main(String[] args) {

		String str1 = "ACTS";
		System.out.println(str1);
		
		String str5 = "ACTS";
		System.out.println(str5);
		if(str1 == str5) {// String is same or not
			System.out.println("SAME 1 5");
		}
		
		char data[] = {'A', 'C', 'T', 'S'};
		String str2 = new String(data);
		System.out.println(str2);
		str2 = str2.intern();
		if(str1 == str2) {// String is same or not// ref check
			System.out.println("SAME 1 2");
		}
		
		if(str1.equals(str2)) {// content check
			System.out.println("content 1 2");
		}
		
		String str3 = new String("ACTS");
		System.out.println(str3);
		if(str1 == str3) {// String is same or not
			System.out.println("SAME 1 3");
		}
		
		byte[] barr = "ACTS".getBytes();
		String str4 = new String(barr);
		System.out.println(str4);
		if(str1 == str4) {// String is same or not
			System.out.println("SAME 1 4");
		}
		
				
		str5 = str5 + "CDAC";
		System.out.println(str5);
		System.out.println(str1);
		
		
	}

}
