package com.acts.tester;
import java.util.Scanner;

public class TryWithResourceTester {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);) {
			System.out.println("\n Enter 2 nos");
			int x = sc.nextInt();
			int y = sc.nextInt();
			double z = 0.0;
			System.out.println("In try block");
			z = ArithmaticOperations.divide(x,y);
			System.out.println("\n Quotient ="+ z);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("\n Enter 2 nos");
			int x = sc.nextInt();
			int y = sc.nextInt();
			double z = 0.0;
			System.out.println("In try block");
			z = ArithmaticOperations.divide(x,y);
			System.out.println("\n Quotient ="+ z);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
		
	}
}