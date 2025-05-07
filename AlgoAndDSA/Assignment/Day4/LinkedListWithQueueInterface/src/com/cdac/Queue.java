package com.cdac;

public interface Queue {
	void enqueue(Object element);
	Object dequeue();
	boolean isFull();
	boolean isEmpty();
	void printQueue();
}
