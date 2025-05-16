package com.cdac;

import java.util.Scanner;

public class Main {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        for(int i=0;i<n-1;i++) {
            swapped = false;
            for(int j=0;j<n-i-1;j++) {
                if(arr[j]<arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }
     
    static boolean isArraySorted(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i] < arr[i+1]) {  
                return false;         
            }
        }
        return true;   
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        
        // Check if array is sorted before sorting
        System.out.println("Is array sorted before sorting? " + isArraySorted(arr));
        
        bubbleSort(arr);
        
        System.out.println("Sorted array in descending order: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        
        // Check if array is sorted after sorting
        System.out.println("\nIs array sorted after sorting? " + isArraySorted(arr));
        
        sc.close();
    }
}