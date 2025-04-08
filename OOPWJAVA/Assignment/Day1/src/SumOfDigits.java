/* 4)Get 4-digit number from user, write a function to calculate sum of digits of the 4-digit number: Using loop and Using recursion */
import java.util.Scanner;

public class SumOfDigits{
	public static int sumUsingLoop(int num){
			int sum =0;
			while(num != 0){
				sum = sum + num%10;
				num = num/10;
			};
			return sum;
	}
	public static int sumUsingRecur(int num){
			if(num <= 0){
				return 0;
			}
			return num%10 + sumUsingRecur(num/10);
	}
	
	public static void main(String[] args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 Digit Number");
		num = sc.nextInt();
		System.out.println("Output from loop: "+ sumUsingLoop(num));
		System.out.println("Output from recursion :"+ sumUsingRecur(num));	
	}
}