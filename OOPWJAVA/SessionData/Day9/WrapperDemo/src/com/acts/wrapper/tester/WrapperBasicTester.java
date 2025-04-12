package com.acts.wrapper.tester;

public class WrapperBasicTester {
	
//	public static Object add(Object a, Object b) {
//		System.out.println("Object");
//		return (Integer)a + (Integer)b;
//	}
	
	public static Number add(Number a, Number b) {
		System.out.println("Number");
		return a.intValue() + b.intValue();
	}
//	
//	public static Integer add(Integer a, Integer b) {
//		System.out.println("Integer");
//		return a + b;
//	}
//	
//	public static int add(int a, int b) {
//		System.out.println("int");
//		return a + b;
//	}
	
	public static void main(String[] args) {
		int i = 10;
		//Manual Boxing
		Integer integer = Integer.valueOf(i);
		System.out.println(integer);
		
		System.out.println(integer.getClass().getSuperclass());
		
		//Auto boxing
		Integer i1  = i;
		System.out.println(i1);
		
		//Un boxing
		int j = i1.intValue();
		
		//Un boxing
		int j1 = i1;
		System.out.println(j1);
		
		WrapperBasicTester.add(10,  20);
	}

}
