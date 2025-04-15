package com.cdac.acts;

public class GrowableQueueImpl implements Queue {

	private Integer arr[];
	private int front;
	private int rear;

	public GrowableQueueImpl() {
		super();
		this.arr = new Integer[INIT_CAPACITY];
		this.rear = 0;
		this.front = 0;

	}

	@Override
	public boolean add(Integer ele) {
		if(!full()) {
			arr[rear++] = ele;
		} 
		else {
		//Grow 
			Integer garr[] = new Integer[arr.length * 2];
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
	public Number remove() throws Exception {
		if(!empty()) {
			return arr[front++];
		}  else {
			throw new Exception("Queue is EMPTY");
		}
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
