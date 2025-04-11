package com.cdac.acts;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		int arr[] = new int[]{40,55,63,17,22,68,89,97,89};
		//int arr1[] = {40,55,63,17,22,68,89,97,89};
		String[] strArr = {"Hi","Hello","Namste"};
		int[][] array2D = {{1,2,3},{4,5,6}};
		String[][] strArray2D = {{"Hi","Hello","Namste"},{"Bye","Tata","Chalta hu"}};
		System.out.println(Arrays.toString(arr));
		int searchedValueIndex = Arrays.binarySearch(arr, 17);
		
//		// Setting values to array element
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = 0;
//		}
//		// Accessing the elements of array
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("At index " + i + " : "+ arr[i]);
//		}
		int arr1[] = {40,55,63,17,22,68,89,97,89};
		System.out.println(Arrays.toString(arr1));
		System.out.println(searchedValueIndex);
		

	}

}
