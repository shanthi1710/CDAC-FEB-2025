package com.cdac.acts;

public class C extends A {
	static {
		str = "Inside C static block";
		System.out.println("CS");
	}
	
	{
		str = "Inside C non-static block";
		System.out.println("CI");
	}
}
