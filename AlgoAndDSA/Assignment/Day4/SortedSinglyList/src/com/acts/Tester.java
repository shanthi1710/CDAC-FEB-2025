package com.acts;

public class Tester {

	public static void main(String[] args) {
		SortedList l1 = new SortedSinglyList();
		l1.insert(1);
		l1.insert(2);
		l1.insert(10);
		l1.insert(10);
		l1.insert(20);
		l1.insert(15);
		l1.insert(5);
		l1.insert(4);
		l1.deleteAll(10);
		System.out.println(l1.search(4));
		System.out.println(l1.search(100));
//		l1.delete(1);
//		l1.delete(4);
//		l1.delete(5);
//		l1.delete(10);
		
		l1.print();
	}

}
