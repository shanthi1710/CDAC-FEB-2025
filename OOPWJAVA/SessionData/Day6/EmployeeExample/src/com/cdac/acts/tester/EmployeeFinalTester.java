package com.cdac.acts.tester;

public class EmployeeFinalTester {
	private final float PI = 3.142F;
	private static final float PI1 = 3.142F;
	
	public void printPI() {
		System.out.println(PI);
		System.out.println(PI1);
	}
	
	public static void printPIV1() {
		//System.out.println(PI);
		System.out.println(PI1);
	}
	
	public static void main(String[] args) {
		//System.err.println(PI);
		System.out.println(PI1);
	}

}
