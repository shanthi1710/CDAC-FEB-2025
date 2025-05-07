package com.cdac;

public class Main {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.insert(8);
		list.insert(6);
		list.insert(9);
		list.insert(10);
		list.insert(6);
		list.print();
		list.delete(3);
		list.print();
		list.deleteAll(6);
		list.print();
		list.printBack();
		
	}

}
