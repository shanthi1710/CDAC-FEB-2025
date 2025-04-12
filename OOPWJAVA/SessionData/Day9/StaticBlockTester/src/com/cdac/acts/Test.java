package com.cdac.acts;

public class Test {
	static {
		System.out.println("static");
	}
	
	
	static {
		System.out.println("static rfrwer");
	}
	
	{
		System.out.println("non static");
	}
	
	public Test() {
		System.out.println("Test");
	}
	
	public static void main(String[] args) {
		System.out.println("in main");
		new Test();
		new Test();
		new Test();
		new Test();
		new Test();
	}
}