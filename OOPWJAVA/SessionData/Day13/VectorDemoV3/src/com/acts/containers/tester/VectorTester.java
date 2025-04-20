package com.acts.containers.tester;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorTester {

	public static void main(String[] args) {
		//Default size
		List<Integer> vector = new Vector<>();
		//Add elements
		vector.add(10);
		vector.add(50);
		vector.add(30);
		vector.add(60);
		vector.add(90);
		vector.add(180);
		
		
		Vector<Integer> vector1 = new Vector<>();
		//Add elements
		vector1.add(200);
		vector1.add(500);
		vector1.add(300);
		vector1.add(600);
		
		
		//Add elements from other arrayList
		
		vector.addAll(vector1);
		
		//get element using Index
		System.out.println(vector.get(3));

		//Remove element by index
		System.out.println("Removed ele :" +vector.remove(2));
		//Printing list
		System.out.println("Traditional for");
		for( int i =0 ; i < vector.size(); i++ ) {
			System.out.println(vector.get(i)); // arr[i]
		}
		
		System.out.println("Enhanced for");
		for(Integer value : vector) {
			System.out.println(value); // arr[i]
		}
		
		System.out.println("List Iterator");
		ListIterator<Integer> iterator = vector.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Direct Printing");
		System.out.println(vector);
		
		System.out.println("Using for each Printing");
		vector.forEach(System.out::println);
		
		//Check whether element is present in list
		System.out.println("Element found:" + vector.contains(180));
		System.out.println("Element found:" + vector.contains(1000));
		
		//Check for elements
		System.out.println("All element found:" + vector.containsAll(vector1));
		
		
		if(!vector.isEmpty()) {
			// to check whether empty
			System.out.println("List not empty");
		}
		
		//Convert to plain array
		Object[] arr = vector.toArray();
		System.out.println(Arrays.toString(arr));
		
		//Sort
		Collections.sort(vector);
		
		System.out.println("Sorted Printing");
		System.out.println(vector);
		
	}

}
