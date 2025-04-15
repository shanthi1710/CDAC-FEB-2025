package com.acts.containers.tester;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.acts.DataPrinter;

//09/10/2022
public class ListTester5 {

	public static void main(String[] args) {

		Integer arr[] = {30,60,90,120,150,160};

		//Create ArrayList from existing array
		List<Integer> linkedList = new LinkedList<Integer>(Arrays.asList(arr));

		System.out.println(linkedList);
		DataPrinter.printData(linkedList);
		System.out.println(linkedList);

		//unmodifiable
		List<Integer> list1 = Arrays.asList(arr);
		DataPrinter.printData(list1);
		System.out.println(linkedList);
		
		//unmodifiable
		List<Integer> unmodifiableList = Collections.unmodifiableList(linkedList);
		DataPrinter.printData(unmodifiableList);
		System.out.println(unmodifiableList);


	}

}
