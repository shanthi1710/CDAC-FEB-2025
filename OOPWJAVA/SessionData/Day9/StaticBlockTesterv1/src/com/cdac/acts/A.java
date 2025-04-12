package com.cdac.acts;

public class A {
	public static String str;
	static {
		str = "Inside A static block";
		System.out.println("AS");
	}
	
	{
		str = "Inside A non-static block";
		System.out.println("AI");
	}

}
