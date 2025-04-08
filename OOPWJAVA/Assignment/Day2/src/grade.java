import java.util.Scanner;

public class grade{
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Percentage:->");
		float per = sc.nextFloat();

		if(per>= 50 && per<60){
			System.out.println("Pass class");
		}else if(per >=60 && per<75){
			System.out.println("second class");
		}else if(per >=75){
			System.out.println("Distinction");
		}else{
			System.out.println("Fail");
		}
	}
}
/*
Up to 50% pass class
Up to 60% second class
Up to 75% First class
Above 75% Distinction.
*/