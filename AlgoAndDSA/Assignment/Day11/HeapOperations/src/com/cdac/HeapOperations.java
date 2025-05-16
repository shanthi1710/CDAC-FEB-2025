package com.cdac;

import java.util.Arrays;

public class HeapOperations {
    
    // Original recursive version with tail recursion
    public static void makeMaxHeapRecursive(int[] arr, int i, int heapSize) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        
        if (left < heapSize && arr[left] > arr[largest]) {
            largest = left;
        }
        
        if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }
        
        if (largest != i) {
            swap(arr, i, largest);
            makeMaxHeapRecursive(arr, largest, heapSize); // Tail recursion
        }
    }
    
    // Modified iterative version without tail recursion
    public static void makeMaxHeapIterative(int[] arr, int i, int heapSize) {
        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int largest = i;
            
            if (left < heapSize && arr[left] > arr[largest]) {
                largest = left;
            }
            
            if (right < heapSize && arr[right] > arr[largest]) {
                largest = right;
            }
            
            if (largest == i) {
                break; // Heap property satisfied
            }
            
            swap(arr, i, largest);
            i = largest; // Update i for next iteration instead of recursion
        }
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    // Build max heap using the iterative version
    public static void buildMaxHeap(int[] arr) {
        int heapSize = arr.length;
        // Start from the last non-leaf node
        for (int i = heapSize / 2 - 1; i >= 0; i--) {
            makeMaxHeapIterative(arr, i, heapSize);
        }
    }
    
    // Example usage
    public static void main(String[] args) {
        int[] arr = {4, 10, 3, 5, 1};
        buildMaxHeap(arr);
        System.out.println(Arrays.toString(arr)); // Should print the max heap array
    }
}