package com.acts.tester;
import java.util.Scanner;

public class ArithmaticTester3 {
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
				} catch (ArithmeticException | NumberFormatException e) {
					System.out.println("In catch block");
					System.out.println("Please do not enter 0 as second number");
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
				finally {
					System.out.println("In finally block");
				}

		System.out.println("\n Quotient ="+ z);

		sc.close();

	}
}