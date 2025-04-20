package com.acts.emp.tester;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTester {
	public static void main(String[] args) {
		Map<Integer, String> cHashMap = new ConcurrentHashMap<>();
		//Put
		cHashMap.put(1, "One");
		cHashMap.put(2, "Two");
		cHashMap.put(3, "Three");
		cHashMap.put(4, "Four");
		cHashMap.put(5, "Five");
		cHashMap.put(6, "SiX");
		//Print hashtable
		System.out.println(cHashMap);
	}

}
