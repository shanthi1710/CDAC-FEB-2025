package com.cdac;

import java.util.Scanner;

public class Main {
	public static boolean findUsingBinarySearch(int[] arr, int n,int element) {
		 int left =0;
		 int right = n-1;
		 int mid;
		 
		 while(left<=right) {
			 mid = left+(right-left)/2;
			 
			 if(arr[mid]==element) {
				 return true;
			 }
			 if(element<arr[mid]) {
				 right = mid-1;
			 }else {
				 left = mid + 1;
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
		
		if(findUsingBinarySearch(arr,n,ele)) {
			System.out.println("Element found");
		}else {
			System.out.println("Element not found");
		}
		sc.close();
		
	}

}
