package com.cdac.acts;

public class B extends A {
	static {
		System.out.println("Inside B static block");
	}
	
	{
		System.out.println("Inside B non-static block");
	}
}
