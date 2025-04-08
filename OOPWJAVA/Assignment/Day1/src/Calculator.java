/* 2) Write menu driven java program for performing 
Add, Subtract, Multiplication and division of numbers. */

import java.util.Scanner;

public class Calculator{
		public static void main(String... args){
			Scanner sc = new Scanner(System.in);
			int num;
			float result, a, b;
			do{
				System.out.println("Choose from below:");
				System.out.println("1)Add 2)Subtract 3)Multiply 4)Division 5)Exit");
				System.out.println("Enter your choice");
				num = sc.nextInt();
				
				switch(num){
					case 1: System.out.println("Enter first number");
							a = sc.nextInt();
							System.out.println("Enter second number");
							b = sc.nextInt();
							result = a + b;
							System.out.println("Sum is "+result);
							break;
					case 2: System.out.println("Enter first number");
							a = sc.nextInt();
							System.out.println("Enter second number");
							b = sc.nextInt();
							result = a - b;
							System.out.println("Difference is "+result);
							break;
					case 3: System.out.println("Enter first number");
							a = sc.nextInt();
							System.out.println("Enter second number");
							b = sc.nextInt();
							result = a * b;
							System.out.println("Product is "+result);
							break;
					case 4: System.out.println("Enter first number");
							a = sc.nextInt();
							System.out.println("Enter second number");
							b = sc.nextInt();
							result = a / b;
							System.out.println("Division is "+result);
							break;
					case 5: System.out.println("Bye...");
							break;
					default: System.out.println("Invalid Input!");
							break;
				}
				
			}while(num != 5);
			sc.close();
		}
	
}