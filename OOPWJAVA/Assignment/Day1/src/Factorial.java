/* 5) Write a function for factorial and use the function for printing factorial series like 1 2 6 24 120……… */

import java.util.Scanner;
public class Factorial{
	
	
	public static int factorial(int num){
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
		
		
	}
	
	public static void main(String[] args){
		int num;
		System.out.println("Enter term: ");
		Scanner sc= new Scanner(System.in);
		num = sc.nextInt();
		for(int i=1;i<=num;i++)
	{
		System.out.print(factorial(i) + " ");	
	}	
	}	
}