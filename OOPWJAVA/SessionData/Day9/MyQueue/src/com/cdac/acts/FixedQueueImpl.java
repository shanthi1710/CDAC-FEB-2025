package com.cdac.acts;

public class FixedQueueImpl implements Queue{

	private int arr[];
	private int front;
	private int rear;
	
	public FixedQueueImpl() {
		super();
		this.arr = new int[INIT_CAPACITY];
		this.rear = 0;
		this.front = 0;
		
	}

	@Override
	public boolean add(int ele) {
		
		if(!full()) {
		arr[rear++] = ele;
		return true;
		}
		return false;
	}

	@Override
	public int remove() {
		if(!empty()) {
		return arr[front++];
		} 
		//throw exception
		return -1;
	}

	@Override
	public boolean empty() {
		return rear == front;
	}

	@Override
	public boolean full() {
		return rear == arr.length;
	}

}
