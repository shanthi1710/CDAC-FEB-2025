package com.cdac;

public class Main {

	public static void main(String[] args) {
		 doublyLinkedList list = new doublyLinkedList();
		 list.addAtFront(10);
		 list.addAtEnd(20);
		 list.addAtFront(5);
		 list.addAtEnd(30);
		 list.display();
		 System.out.println("\nremoved element-> "+list.removeAtFront());
		 list.display();
		 System.out.println("\nremoved element-> "+list.removeAtEnd());
		 list.display();
	}

}
