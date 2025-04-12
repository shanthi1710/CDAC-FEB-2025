package com.acts.tester;
import java.util.Scanner;

public class ArithmaticTester5 {
	public static void main(String[] args) {
		;
		System.out.println("\n Enter 2 nos");
		
		double z = 0.0;
		//Try with AutoCloseable
				try (Scanner sc = new Scanner(System.in)) {
					int a = sc.nextInt();
					int b = sc.nextInt();
					System.out.println("In try block");
					z = ArithmaticOperations.divide(a,b);
				}
				catch (NumberFormatException nfe) {
					System.out.println("In catch block");
					System.out.println("Please do enter numbers only");
					nfe.printStackTrace();
				}
				catch (RuntimeException ae) {
					System.out.println("In catch block");
					System.out.println("Please do not enter 0 as second number");
					//ae.printStackTrace();
					System.out.println(ae.getMessage());
				}
				
				finally {
					System.out.println("In finally block");
				}

		System.out.println("\n Quotient ="+ z);

	}
}