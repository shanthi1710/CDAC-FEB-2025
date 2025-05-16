package com.cdac;

import java.util.Arrays;
import java.util.Scanner;

class Main {
  
    static void heapify(int arr[], int n, int i) {

        int largest = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }
    static void heapSort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0]; 
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
    public static void addElement(int arr[],int n,Scanner sc) {
		System.out.println("Enter array elements:-> ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
	}
	public static void displayElement(int arr[],int n) {
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
	}
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:->");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		addElement(arr,n,sc);
        heapSort(arr);
        System.out.println("Sorted array is ");
        displayElement(arr,n);
    }
}
