package com.cdac;

public interface CrudInterface {
	void addAtFront(int element);
	void addAtEnd(int element);
	int removeAtFront();
	int removeAtEnd();
	boolean isEmpty();
	void display();
}
