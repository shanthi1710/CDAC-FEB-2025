package com.acts.emp.tester;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapTester2 {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();
		//Put
		hashMap.put("DAC", "Diploma in Advanced Computing");
		hashMap.put("DAC", "Diploma in Computing");
		hashMap.put("DESD", "Diploma in Advanced Computing");
		hashMap.put(null, "My Value");
		//Print hashmap
		System.out.println(hashMap);
		
		String str = hashMap.get("DESD");
		System.out.println(str);
		
		System.out.println(hashMap);
		
		if(hashMap.containsKey("DESD")) {
			hashMap.remove("DESD");
			System.out.println("Entry removed");
		}
		

		if(hashMap.containsValue("My Value")) {
			System.out.println("Value present");
		}
	}

}
