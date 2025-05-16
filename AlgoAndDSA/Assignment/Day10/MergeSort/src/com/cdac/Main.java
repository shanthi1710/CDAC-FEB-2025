package com.cdac;
import java.util.Scanner;
public class Main {
	
	public static void conquer(int arr[],int left,int mid,int right) {
		int merger[] = new int[right-left+1];
		
		int idx1 = left;
		int idx2 = mid+1;
		int x = 0;
		  
		while(idx1<=mid && idx2<=right) {
			if(arr[idx1]<=arr[idx2]) {
				merger[x++]=arr[idx1++];
			}else {
				merger[x++]=arr[idx2++];
			}
		}
		while(idx1<=mid) {
			merger[x++]=arr[idx1++];
		}
		while( idx2<=right) {
			merger[x++]=arr[idx2++];
		}
		for(int i=0,j=left;i<merger.length;i++,j++) {
			arr[j]=merger[i];
		}
	}
	public static void divide(int arr[],int left,int right) {
		if(left>=right) {
			return;
		}
		int mid = left+(right-left)/2;
		divide(arr,left,mid);
		divide(arr,mid+1,right);
		conquer(arr,left,mid,right);
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
		divide(arr,0,n-1);
		displayElement(arr,n);
	}

}
