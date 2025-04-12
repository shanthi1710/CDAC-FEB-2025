package com.acts.tester;
import java.util.Scanner;

public class ArithmaticTester1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter 2 nos");
		String x = sc.next();
		String y = sc.next();
		double z = 0.0;
				
		int a = 0;
		int b = 0;
		try {
			System.out.println("In try block");
			a = Integer.parseInt(x);
			b = Integer.parseInt(y);
		}
		catch (NumberFormatException nfe) {
			System.out.println("In catch block");
			System.out.println("Please do enter numbers only");
			nfe.printStackTrace();
		}
		finally {
			System.out.println("In finally block");
		}


		try {
			z = ArithmaticOperations.divide(a,b);
		} catch (ArithmeticException e) {
			System.out.println("In catch block");
			e.printStackTrace();
		}

		System.out.println("\n Quotient ="+ z);

		sc.close();

	}
}