package com.acts.containers.tester;

import java.util.HashSet;
import java.util.Set;

public class HashSetTester {

	public static void main(String[] args) {
		//Create HashSet
		Set<String> hashSet = new HashSet<>();
		//Add elements
		System.out.println("Hi" + "Hi".hashCode());
		hashSet.add("Hi");

		System.out.println("Hello" + "Hello".hashCode());
		hashSet.add("Hello");

		System.out.println("hello" + "hello".hashCode());
		hashSet.add("hello");

		System.out.println("How are you" + "How are you".hashCode());
		hashSet.add("How are you");


		System.out.println("*******Enhanced for***********");
		for(String value : hashSet) {
			System.out.println(value); 
		}
		//		
		//		HashSet<String> hashSet1 = new HashSet<>();
		//		//Add elements
		//		System.out.println("Hi" + "Hi".hashCode());
		//		hashSet1.add("Hi");
		//		System.out.println("Bye" + "Bye".hashCode());
		//		hashSet1.add("Bye");
		//		System.out.println("tata" + "tata".hashCode());
		//		hashSet1.add("tata");
		//		System.out.println("see you" +"see you".hashCode());
		//		hashSet1.add("see you");
		//
		////
		//		//Add elements from other arrayList
		//
		//		hashSet.addAll(hashSet1);
		//
		//
		//		System.out.println("*******Advanced for***********");
		//		for(String value : hashSet) {
		//			System.out.println(value); 
		//		}
	}

}
