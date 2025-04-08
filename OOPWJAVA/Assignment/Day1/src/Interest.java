/* 3)Write menu driven java program with below options

	Calculate simple interest
	Calculate compound interest */
	
import java.lang.Math;
import java.util.Scanner;	
public class Interest{
	public static double simpleInterest(){
		double principle,rate,result;
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principle: ");
		principle = sc.nextDouble();
		System.out.print("Enter rate: ");
		rate = sc.nextDouble();
		System.out.print("Enter term: ");
		year = sc.nextInt();
		result = (principle * rate * year)/100;
		return result;
	}
	public static double compoundInterest(){
		double principle,rate,result;
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principle: ");
		principle = sc.nextDouble();
		System.out.print("Enter rate: ");
		rate = sc.nextDouble();
		System.out.print("Enter term: ");
		year = sc.nextInt();
		double amt = principle * Math.pow(1 + rate/100, year);
		result = amt - principle;
		return result;
	}
	
	public static void main(String[] args){
		int num;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("1) Simple Interest 2) Compound Interest 3)Exit");
			System.out.println("Enter your choice: ");
			num= sc.nextInt();
			//float interest;
			switch(num)
			{
				case 1: System.out.println(simpleInterest());
						break;
				case 2: System.out.print(compoundInterest());
						break;
				case 3: System.out.println("Bye");
						break;
				default: System.out.println("Invalid Option");		
			}
		}while(num !=3);
		sc.close();
	}
}