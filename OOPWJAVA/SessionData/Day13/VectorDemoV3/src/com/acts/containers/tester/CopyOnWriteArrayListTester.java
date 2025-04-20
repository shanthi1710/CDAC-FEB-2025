package com.acts.containers.tester;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTester {

	public static void main(String[] args) {
		
		List<Integer> list = new CopyOnWriteArrayList<>();
		//Add elements
		list.add(200);
		list.add(500);
		list.add(300);
		list.add(600);
		
		
		System.out.println("Enhanced for");
		for(Integer value : list) {
			System.out.println(value); // arr[i]
			list.add(100000);
		}
		
		
		System.out.println("Enhanced for2");
		for(Integer value : list) {
			System.out.println(value); // arr[i]
		}
	}

}
