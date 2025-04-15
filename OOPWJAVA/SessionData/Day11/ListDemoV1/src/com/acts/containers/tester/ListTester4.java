package com.acts.containers.tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//09/10/2022
public class ListTester4 {

	public static void main(String[] args) {

		Integer arr[] = {30,60,90,120,150,160};

		//Create ArrayList from existing array
		List<Integer> arrayList = Arrays.asList(arr);
		System.out.println(arrayList);
		
		int ele = Collections.binarySearch(arrayList, 120);
		System.out.println(ele);

		Collections.shuffle(arrayList);
		System.out.println(arrayList);
		
		Collections.fill(arrayList, 100);
		System.out.println(arrayList);
		
		List<Integer> unmodifiableList = Collections.unmodifiableList(arrayList);
		unmodifiableList.add(200);
		System.out.println(unmodifiableList);

	}

}
