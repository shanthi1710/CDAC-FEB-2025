package com.cdac.acts;

public class ArrayPrinter {

	public static void printArray(int[] arr)   {
		//Print Array Elements
		for (int i = 0; i < arr.length; i++) {
			System.out.println("\nElement="+ arr[i]);
		}  
	}

	public static void printArray(String[] strArr)   {
		//Print Array Elements
		for (int i = 0; i < strArr.length; i++) {
			System.out.println("\nElement="+ strArr[i]);
		}  
	}
	
	public static void main(String args[])   {
		int arr[] = { 10, 60, 90, 50, 40};  
		// passing array to method m1
		printArray(arr);
		String strArr[] = { "C", "C++", "Java", "C Sharp"};  
		printArray(strArr);

	}
}