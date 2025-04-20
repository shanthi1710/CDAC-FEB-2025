package com.acts.emp.tester;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTester {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<>();
		//Put
		hashMap.put(1, "One");
		hashMap.put(2, "Two");
		hashMap.put(3, "Three");
		hashMap.put(4, "Four");
		hashMap.put(5, "Five");
		hashMap.put(6, "SiX");
		hashMap.put(null, "My Value");
		//Print hashmap
		System.out.println(hashMap);
		
		//PutifAbsent
		hashMap.putIfAbsent(7, "Seven");
		hashMap.putIfAbsent(6, "My value");
		hashMap.putIfAbsent(8, null);
		//Print hashmap
		System.out.println(hashMap);

		//Remove
		hashMap.remove(7);
		System.out.println(hashMap.get(2));
		
		//Print hashmap
		System.out.println(hashMap);
		//Get method give value for key
		System.out.println("Value at key" +hashMap.get(4));
		
		//keySet
		Set<Integer> keys = hashMap.keySet();
		System.out.println("Key set:"+keys);
		//Get keys and for every key get values
		for(Integer key : keys) {
			String val = hashMap.get(key);
			System.out.println("Key="+key + ",  value=" + val);
		}
		
		//Values
		System.out.println("Values collection"+hashMap.values());
		Collection<String> values = hashMap.values();
		System.out.println("Values :"+values);
		for(String value : values) {
			System.out.println("value=" + value);
		}
		
		//Iterate using entry
		Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
		for(Map.Entry<Integer, String> entry : entries) {
			System.out.println("Key="+entry.getKey() + ", "
					+ " value=" + entry.getValue());
		}
	}


}
