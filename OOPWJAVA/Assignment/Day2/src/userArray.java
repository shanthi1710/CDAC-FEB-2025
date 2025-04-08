/* Write a java program to sort an array of 10 numbers. Get array element from user and use any sorting method you like.*/
import java.util.Scanner;
public class userArray{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		 
		int []arr = new int[10];

		System.out.println("Enter Array Element...");
		for(int i=0;i<10;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Elements...");
		
		for(int i=0;i<10;i++){
			System.out.println(arr[i]);
		}
	}
}