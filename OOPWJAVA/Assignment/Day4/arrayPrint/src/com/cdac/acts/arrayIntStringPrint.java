package com.cdac.acts;
import java.util.Scanner;
import java.util.Arrays;

public class arrayIntStringPrint {
	
	public static void printArray(int[] arr) {
		System.out.print(Arrays.toString(arr));
	}
	public static void printArray(String[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the length of integer array:->");
		 int len = sc.nextInt();
		 int [] arr = new int[len];
		 
		 System.out.println("Enter "+len+" integers");
		 
		 for(int i=0;i<len;i++){
			 arr[i]=sc.nextInt();
		 }
		 
		 System.out.println("The entered array is");
		 printArray(arr);

		 System.out.println("Enter the length of String array: ");
		 int size = sc.nextInt();
		 sc.nextLine();
		 String[] sarr = new String[size];
		 System.out.println("Enter "+ size +" integers:");
		 for(int i = 0; i < size; i++) {
			 sarr[i] = sc.nextLine();
		 }
		 System.out.println("The entered array is : ");
		 printArray(sarr);
		 sc.close();
	}

}
