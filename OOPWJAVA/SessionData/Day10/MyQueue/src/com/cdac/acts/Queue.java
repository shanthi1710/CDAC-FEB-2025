package com.cdac.acts;

public interface Queue {
	public static final int INIT_CAPACITY = 10;
	boolean add(Integer ele);
	Number remove() throws Exception;
	boolean empty();
	boolean full();
	default void print() {
		System.out.println("Queue");
	}
}
