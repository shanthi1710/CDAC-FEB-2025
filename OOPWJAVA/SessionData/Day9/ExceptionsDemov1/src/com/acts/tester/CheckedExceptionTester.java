package com.acts.tester;

public class CheckedExceptionTester {
	
	public static void loadClass(String className) throws ClassNotFoundException {
		Class.forName(className);
		System.out.println("class is loaded");
	}
	
	public static void loadClass1(String className){
		try {
			Class.forName(className);
			System.out.println("class is loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			CheckedExceptionTester.loadClass("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		CheckedExceptionTester.loadClass1("java.lang.String");

	}

}
