package com.cdac;

public interface ListInterface {
	void addFirst(int data);
	void addLast(int data);
	int removeFirst() throws IllegalStateException;
	int removeLast() throws IllegalStateException;
	boolean isEmpty();
	void displayForward();
	void displayBackward();
}
