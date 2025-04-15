package com.acts.containers.tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTester {

	public static void main(String[] args) {
		//Create ArrayList
		//Default size
		LinkedList<Integer> linkedList = new LinkedList<>();
		//Add elements
		linkedList.add(10);
		linkedList.add(50);
		linkedList.add(30);
		linkedList.add(60);
		linkedList.add(90);
		linkedList.add(180);
		
		
		ArrayList<Integer> arrayList1 = new ArrayList<>();
		//Add elements
		arrayList1.add(200);
		arrayList1.add(500);
		arrayList1.add(300);
		arrayList1.add(600);
		
		
		//Add elements from other arrayList
		
		linkedList.addAll(arrayList1);
		
		//get element using Index
		System.out.println(linkedList.get(3));

		//Remove element by index
		System.out.println("Removed ele :" +linkedList.remove(2));
		//Printing list
		System.out.println("Traditional for");
		for( int i =0 ; i < linkedList.size(); i++ ) {
			System.out.println(linkedList.get(i)); // arr[i]
		}
		
		System.out.println("Advanced for");
		for(Integer value : linkedList) {
			System.out.println(value); // arr[i]
		}
		
		System.out.println("List Iterator");
		ListIterator<Integer> iterator = linkedList.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Direct Printing");
		System.out.println(linkedList);
		
		//Check whether element is present in list
		System.out.println("Element found:" + linkedList.contains(180));
		System.out.println("Element found:" + linkedList.contains(1000));
		
		//Check for elements
		System.out.println("All element found:" + linkedList.containsAll(arrayList1));
		
		
		if(!linkedList.isEmpty()) {
			// to check whether empty
			System.out.println("List not empty");
		}
		
		//Convert to plain array
		Object[] arr = linkedList.toArray();
		System.out.println(Arrays.toString(arr));
		
		//Sort
		Collections.sort(linkedList);
		
		System.out.println("Sorted Printing");
		System.out.println(linkedList);
		
	}

}
