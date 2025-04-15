package com.acts.containers.tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.acts.DataPrinter;

//09/10/2022
public class ListTester5 {

	public static void main(String[] args) {

		Integer arr[] = {30,60,90,120,150,160};

		//Create ArrayList from existing array
		List<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));

		System.out.println(arrayList);
		DataPrinter.printData(arrayList);
		System.out.println(arrayList);

		//unmodifiable
		List<Integer> list1 = Arrays.asList(arr);
		DataPrinter.printData(list1);
		System.out.println(arrayList);
		
		//unmodifiable
		List<Integer> unmodifiableList = Collections.unmodifiableList(arrayList);
		DataPrinter.printData(unmodifiableList);
		System.out.println(unmodifiableList);


	}

}
