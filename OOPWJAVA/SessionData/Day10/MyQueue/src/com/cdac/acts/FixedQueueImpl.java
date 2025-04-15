package com.cdac.acts;

public class FixedQueueImpl implements Queue{

	private Integer arr[];
	private int front;
	private int rear;

	public FixedQueueImpl() {
		super();
		this.arr = new Integer[INIT_CAPACITY];
		this.rear = 0;
		this.front = 0;

	}

	@Override
	public boolean add(Integer ele) {

		if(!full()) {
			arr[rear++] = ele;
			return true;
		}
		return false;
	}

	@Override
	public Integer remove() throws Exception {
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
