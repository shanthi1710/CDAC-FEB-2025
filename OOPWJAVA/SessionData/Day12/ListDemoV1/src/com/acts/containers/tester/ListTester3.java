package com.acts.containers.tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//09/10/2022
public class ListTester3 {

	public static void main(String[] args) {

		Integer arr[] = {30,60,90,120,150,160};

		//Create ArrayList from existing array
		List<Integer> arrayList = Arrays.asList(arr);
		System.out.println(arrayList);

		//Create ArrayList from existing array
		//ArrayList​(Collection<? extends E> c)
		List<Integer> arrayList2 = new ArrayList(Arrays.asList(arr));
		System.out.println(arrayList2);

		//Create arraylist from other arraylist
		//ArrayList​(Collection<? extends E> c)
		List<Integer> arrayList1 = new ArrayList<>(arrayList);
		System.out.println(arrayList1);

		//Modify element ate index
		arrayList1.set(3, 500);
		System.out.println(arrayList1);

		//Removal of element while iterating ConcurrentModificationException
		for(Integer  i : arrayList1) {
			System.out.println(i);
			//arrayList1.remove(0);
			//arrayList1.add(i);
		}

		//Removal of element while iterating before it.next( IllegalStateEception
		Iterator<Integer> itr = arrayList1.listIterator();
		System.out.println("****************");
		while(itr.hasNext()) {
			itr.remove();
			System.out.println(itr.next());
			//itr.remove();
		}
		System.out.println("****************");
		System.out.println(arrayList1);
	}

}
