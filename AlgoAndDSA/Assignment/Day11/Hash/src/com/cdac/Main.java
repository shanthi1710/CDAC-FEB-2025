package com.cdac;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        
        // Insert some key-value pairs
        hashTable.put(1, 100);
        hashTable.put(2, 200);
        hashTable.put(17, 1700); // This will collide with key 1 in default capacity 16
        
        // Retrieve values
        System.out.println("Key 1: " + hashTable.get(1)); // 100
        System.out.println("Key 2: " + hashTable.get(2)); // 200
        System.out.println("Key 17: " + hashTable.get(17)); // 1700
        
        // Update value
        hashTable.put(1, 150);
        System.out.println("Updated Key 1: " + hashTable.get(1)); // 150
        
        // Remove key
        hashTable.remove(2);
        System.out.println("After removal, Key 2: " + hashTable.get(2)); // null
        
        // Check size
        System.out.println("Size: " + hashTable.size()); // 2
    }
}