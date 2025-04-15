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
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		//Add elements
		arrayList.add(10);
		arrayList.add(50);
		arrayList.add(30);
		arrayList.add(60);
		arrayList.add(90);
		arrayList.add(180);
		
		
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		//Add elements
		arrayList1.add(200);
		arrayList1.add(500);
		arrayList1.add(300);
		arrayList1.add(600);
		
		
		//Add elements from other arrayList
		arrayList.addAll(arrayList1);
		
		//get element using Index
		System.out.println(arrayList.get(3));

		//Remove element by index
		System.out.println("Removed ele :" +arrayList.remove(2));
		//Printing list
		System.out.println("Traditional for");
		for( int i =0 ; i < arrayList.size(); i++ ) {
			System.out.println(arrayList.get(i)); // arr[i]
		}
		
		System.out.println("Enhanced for");
		for(Integer value : arrayList) {
			System.out.println(value); // arr[i]
		}
		
		System.out.println("List Iterator");
		ListIterator<Integer> iterator = arrayList.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Direct Printing");
		System.out.println(arrayList);
		
		
		
		//Check whether element is present in list
		System.out.println("Element found:" + arrayList.contains(180));
		System.out.println("Element found:" + arrayList.contains(1000));
		
		//Check for elements
		System.out.println("All element found:" + arrayList.containsAll(arrayList1));
		
		
		if(!arrayList.isEmpty()) {
			// to check whether empty
			System.out.println("List not empty");
		}
		
		//Ref of interface and object of a concrete class
		List<Integer> al = new ArrayList<Integer>();
		
		Integer arr[] = {1,2,3};
		List<Integer> al1 = Arrays.asList(arr);
		
		//Convert to plain array
		Object[] arr1 = arrayList.toArray();
		System.out.println(Arrays.toString(arr1));
		
		//Sort
		Collections.sort(arrayList);
		
		System.out.println("Sorted Printing");
		System.out.println(arrayList);
		
		Collections.reverse(arrayList);
		System.out.println(arrayList);
		
	}
	
	

}
