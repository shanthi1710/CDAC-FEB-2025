package com.cdac.acts;

public class B extends A {
	static {
		str = "Inside B static block";
		System.out.println("BS");
	}
	
	{
		str = "Inside B non-static block";
		System.out.println("BI");
	}
}
