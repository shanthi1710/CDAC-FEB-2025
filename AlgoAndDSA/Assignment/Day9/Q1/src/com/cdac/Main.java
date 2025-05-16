package com.cdac;
import java.util.Scanner;

public class Main {
	public static boolean findUsingLinearSearch(int[] arr,int n,int element) {
		 for(int i=0;i<n;i++) {
			 if(arr[i]==element) {
				 return true;
			 }
		 }
		 return false;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size:-> ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter array element:-> ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element which you want to be search:->");
		int ele = sc.nextInt();
		
		if(findUsingLinearSearch(arr,n,ele)) {
			System.out.println("Element found");
		}else {
			System.out.println("Element not found");
		}
		sc.close();
		
	}

}
