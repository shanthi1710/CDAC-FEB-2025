package com.acts.emp.tester;

import java.util.Hashtable;

public class HashTableTester {
	public static void main(String[] args) {
		Hashtable<Integer, String> hashtable = new Hashtable<>();
		//Put
		hashtable.put(1, "One");
		hashtable.put(2, "Two");
		hashtable.put(3, "Three");
		hashtable.put(4, "Four");
		hashtable.put(5, "Five");
		hashtable.put(6, "SiX");
		//Print hashtable
		System.out.println(hashtable);
	}

}
