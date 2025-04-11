package com.cdac.acts.recursion;

import java.util.Scanner;

public class ResursionTest {

	public static int factorialWithLoop(int no) {
		int fact = 1;
		while(no > 1) {
			fact = fact * no;
			no = no - 1;
		}
		return fact;
	}

	//calling a method within itself
	public static int factorial(int no) {
		if(no > 1) {
			return no * factorial(no - 1);
		}

		return 1;
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number");
		int no = scanner.nextInt();
		System.out.println("Factorial using Loop = " + factorialWithLoop(no));
		System.out.println("Factorial using recursion = " + factorial(no));
		scanner.close();

	}

}
