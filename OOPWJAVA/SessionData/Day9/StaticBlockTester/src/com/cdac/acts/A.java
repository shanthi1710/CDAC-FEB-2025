package com.cdac.acts;

public class A {
	static {
		System.out.println("Inside A static block");
	}
	
	{
		System.out.println("Inside A non-static block");
	}

}
