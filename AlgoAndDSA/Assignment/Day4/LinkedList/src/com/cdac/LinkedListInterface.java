package com.cdac;

public interface LinkedListInterface {
	boolean isEmpty();
	int size();
	void addFirst(int data);
	void addLast(int data);
	void add(int index,int data);
	int removeFirst();
	int removeLast();
	int remove(int index);
	int get(int index);
	void set(int index,int data);
}
