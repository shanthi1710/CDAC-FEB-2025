package com.cdac.acts;

class A {
	
	public static void method1() {
		System.out.println("A::method1");
	}
}

class B extends A{
	
	public static void method1() {
		System.out.println("B::method1");
	}
}

public class StaticTest {
	public static void main(String[] args) {
		B b = new B();
		b.method1();
		B.method1();
	}
}
