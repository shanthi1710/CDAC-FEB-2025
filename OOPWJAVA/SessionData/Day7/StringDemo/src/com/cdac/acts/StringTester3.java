package com.cdac.acts;

public class StringTester3 {

	private String name;
	private static String name1;

	public void printData(){
		System.out.println(name);
		System.out.println(name1);
	}
	public static void main(String[] args) {
		StringTester3 stringTester3 = new StringTester3();
		System.out.println("ACTS".charAt(50));
		stringTester3.printData();

	}

}
