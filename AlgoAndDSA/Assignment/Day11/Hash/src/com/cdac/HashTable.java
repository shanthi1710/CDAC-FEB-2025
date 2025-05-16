package com.cdac;

public class HashTable {
    private static final int DEFAULT_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;
    
    private LinkedList[] buckets;
    private int size;
    
    // Constructor
    @SuppressWarnings("unchecked")
    public HashTable() {
        buckets = new LinkedList[DEFAULT_CAPACITY];
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            buckets[i] = new LinkedList();
        }
        size = 0;
    }
    
    // Basic hash function
    private int hash(int key) {
        return Math.abs(key) % buckets.length;
    }
    
    // Put a key-value pair into the hash table
    public void put(int key, int value) {
        // Check if we need to resize
        if ((double)size / buckets.length > LOAD_FACTOR) {
            resize();
        }
        
        int index = hash(key);
        LinkedList bucket = buckets[index];
        
        // Check if key already exists
        Node current = bucket.head;
        while (current != null) {
            if (current.key == key) {
                current.value = value; // Update existing value
                return;
            }
            current = current.next;
        }
        
        // Add new entry
        bucket.add(new Node(key, value));
        size++;
    }
    
    // Get a value by key
    public Integer get(int key) {
        int index = hash(key);
        LinkedList bucket = buckets[index];
        
        Node current = bucket.head;
        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }
        
        return null; // Key not found
    }
    
    // Remove a key-value pair
    public Integer remove(int key) {
        int index = hash(key);
        LinkedList bucket = buckets[index];
        
        Node prev = null;
        Node current = bucket.head;
        
        while (current != null) {
            if (current.key == key) {
                if (prev == null) {
                    bucket.head = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return current.value;
            }
            prev = current;
            current = current.next;
        }
        
        return null; // Key not found
    }
    
    // Check if key exists
    public boolean containsKey(int key) {
        int index = hash(key);
        LinkedList bucket = buckets[index];
        
        Node current = bucket.head;
        while (current != null) {
            if (current.key == key) {
                return true;
            }
            current = current.next;
        }
        
        return false;
    }
    
    // Get the size of the hash table
    public int size() {
        return size;
    }
    
    // Resize the hash table when load factor is exceeded
    @SuppressWarnings("unchecked")
    private void resize() {
        LinkedList[] oldBuckets = buckets;
        buckets = new LinkedList[oldBuckets.length * 2];
        
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList();
        }
        
        size = 0;
        
        // Rehash all entries
        for (LinkedList bucket : oldBuckets) {
            Node current = bucket.head;
            while (current != null) {
                put(current.key, current.value);
                current = current.next;
            }
        }
    }
}