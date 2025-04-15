package com.cdac.acts;

public interface Queue {
	public static final int INIT_CAPACITY = 10;
	boolean add(int ele);
	int remove() throws QueueEmptyException;
	boolean empty();
	boolean full();
	int capacity();
	default void print() {
		System.out.println("Queue");
	}
}
