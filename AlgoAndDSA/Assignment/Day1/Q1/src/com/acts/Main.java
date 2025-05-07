package com.acts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:->");
        int n = sc.nextInt(); 
        int arr[] = new int[n];
        
        System.out.println("Enter array elements:->");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("All Array Elements:->");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
        
        System.out.println("Enter index which you want to delete:->");
        int pos = sc.nextInt();
        
         
        if(pos < 0 || pos >= n) {
            System.out.println("Invalid position!");
            return;
        }
        
        
        for(int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        
        
        n--;
        
        System.out.println("After deletion, All Array Elements:->");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}