package com.acts;

import java.util.Iterator;
import java.util.List;

public class DataPrinter {
	public static void printData(List<? extends Number> list) {
				Iterator<? extends Number> itr = list.iterator();
				System.out.println("****************");
				while(itr.hasNext()) {
					System.out.println(itr.next());
					//itr.remove();
				}
	}
	
	public static void printData1(List<? super Integer> list) {
		Iterator<? super Integer> itr = list.iterator();
		System.out.println("****************");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
}

}
