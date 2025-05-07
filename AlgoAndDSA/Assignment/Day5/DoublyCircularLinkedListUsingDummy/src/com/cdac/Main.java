package com.cdac;

public class Main {

	public static void main(String[] args) {
		 DoublyCircularLinkedList list = new DoublyCircularLinkedList();
		 
		 list.addFirst(10);
		 list.addFirst(5);
		 list.addFirst(1);
		 list.displayForward();
		 list.displayBackward();
		 list.addLast(15);
		 list.addLast(20);
		 list.addLast(25);
		 list.displayForward();
		 list.displayBackward();
		 list.removeFirst();
		 list.displayForward();
		 list.removeLast();
		 list.displayForward();
	}

}
