package com.acts.tester;
//qualified name
//com.acts.operations.ArithmaticOperations
public class ArithmaticOperations {
	private ArithmaticOperations() {
		
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int add(int a, byte b) {
		return a + b;
	}
	
	public static int add(int a, int b, int c) {
		return a + b +c;
	}
	
	public static double add(double a, double b) {
		return a + b;
	}
	
	public static int substract(int a, int b) {
		return a - b;
	}
	
	public static double divide(int a, int b) {
		return a / b;
	}
}