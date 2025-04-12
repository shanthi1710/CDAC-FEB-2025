package com.acts.tester;
import java.util.Scanner;

public class ArithmaticTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter 2 nos");
		int x = sc.nextInt();
		int y = sc.nextInt();
		double z = 0.0;
		try {
			System.out.println("In try block");
			z = ArithmaticOperations.divide(x,y);
		} catch (ArithmeticException ae) {
			System.out.println("In catch block");
			System.out.println("Please do not enter 0 as second number");
		}
		finally {
			System.out.println("In finally block");
		}
		System.out.println("\n Quotient ="+ z);

		sc.close();

	}
}