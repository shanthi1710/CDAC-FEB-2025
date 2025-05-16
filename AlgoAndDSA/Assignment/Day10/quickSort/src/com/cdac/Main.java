package com.cdac;
import java.util.Scanner;
public class Main {
    
     public static int partition(int arr[],int low,int high) {
         int pivot = arr[high];
         int i=low-1;
         
         for(int j =low;j<high;j++) {   
             if(arr[j]<pivot) {
                 i++;
                 int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
             }
         }
         i++;
         
         // Correct pivot swap: arr[i] <-> arr[high]
         int temp = arr[i];
         arr[i] = arr[high];
         arr[high] = temp;
         
         return i;
     }
    public static void quickSort(int arr[],int low,int high) {
        if(low<high) {
            int pidx = partition(arr,low,high);
            quickSort(arr,low,pidx-1);
            quickSort(arr,pidx+1,high);
        }
    }
    public static void addElement(int arr[],int n,Scanner sc) {
        System.out.println("Enter array elements:-> ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
    }
    public static void displayElement(int arr[],int n) {
        
        System.out.println("Array elements ");
        for(int i=0;i<n;i++) {
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:->");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        addElement(arr,n,sc);   
        quickSort(arr,0,n-1);   
        displayElement(arr,n);   
    }
}