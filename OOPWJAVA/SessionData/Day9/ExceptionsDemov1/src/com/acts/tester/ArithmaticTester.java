package com.acts.tester;
import java.util.Scanner;

public class ArithmaticTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter 2 nos");
		String x = sc.next();
		String y = sc.next();
		double z = 0.0;
				try {
					System.out.println("In try block");
					int a = Integer.parseInt(x);
					int b = Integer.parseInt(y);
					
					z = ArithmaticOperations.divide(a,b);
				} catch (ArithmeticException ae) {
					System.out.println("In catch block");
					System.out.println("Please do not enter 0 as second number");
					//ae.printStackTrace();
					System.out.println(ae.getMessage());
				}
				catch (NumberFormatException nfe) {
					System.out.println("In catch block");
					System.out.println("Please do enter numbers only");
					nfe.printStackTrace();
				}
				finally {
					System.out.println("In finally block");
				}
//
//		int a;
//		int b;
//		try {
//			System.out.println("In try block");
//			a = Integer.parseInt(x);
//			b = Integer.parseInt(y);
//		}
//		catch (NumberFormatException nfe) {
//			System.out.println("In catch block");
//			System.out.println("Please do enter numbers only");
//			nfe.printStackTrace();
//		}
//		finally {
//			System.out.println("In finally block");
//		}
//
//
//		try {
//			z = ArithmaticOperations.divide(a,b);
//		} catch (ArithmeticException e) {
//			System.out.println("In catch block");
//			e.printStackTrace();
//		}

		System.out.println("\n Quotient ="+ z);

		sc.close();

	}
}