package com.cdac.acts;

public class StaticBlockTester {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(C.str);
		
		C c = new C();
		System.out.println(C.str);
//		
//		C c = new C();
//		new A();
//		System.out.println(C.str);
//		
////		AS
//		CS
//		AI
//		CI
//		AI
//		Inside A non-static block
	}
}
