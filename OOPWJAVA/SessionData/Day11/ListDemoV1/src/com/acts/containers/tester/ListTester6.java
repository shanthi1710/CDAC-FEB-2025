package com.acts.containers.tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.acts.DataPrinter;

//09/10/2022
public class ListTester6 {

	public static void main(String[] args) {

		Double arr[] = {10.20, 90.90,120.120,150.150,160.160};

		//Create ArrayList from existing array
		List<Double> arrayList = new LinkedList<>(Arrays.asList(arr));
		DataPrinter.printData(arrayList);
		//DataPrinter.printData1(arrayList);

	}

}
