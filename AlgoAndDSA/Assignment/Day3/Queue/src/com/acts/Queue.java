package com.acts;

public interface Queue {
	void enqueue(Object element);
	Object dequeue();
	boolean isFull();
	boolean isEmpty();
	public void printQueue();
}
