package com.acts.tester;
import java.util.Scanner;

public class FlowTester {

	public static int method1() { 
		try {
			Class.forName("java.lang.string");
			System.out.println("In try");
			return 1;
		}
		catch (ClassNotFoundException e) {
			System.out.println("In catch");
			return 2;
		}
		finally {
			System.out.println("In finally");
			return 3;
		}

	}
	public static void main(String[] args) {

		System.out.println(FlowTester.method1());

	}
}