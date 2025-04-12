package com.cdac.acts;

public class GrowableQueueImpl implements Queue {

	private int arr[];
	private int front;
	private int rear;

	public GrowableQueueImpl() {
		super();
		this.arr = new int[INIT_CAPACITY];
		this.rear = 0;
		this.front = 0;

	}

	@Override
	public boolean add(int ele) {
		if(!full()) {
			arr[rear++] = ele;
		} 
		else {
		//Grow 
			int garr[] = new int[arr.length * 2];
			//Add existing elements
			for(int i =0; i <arr.length; i++) {
				garr[i] = arr[i];
			}
			//Repoint
			arr = garr;
			//Add element after grow
			arr[rear++] = ele;
		}
		return true;
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
