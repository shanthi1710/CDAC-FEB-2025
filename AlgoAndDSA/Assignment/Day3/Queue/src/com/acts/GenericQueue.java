package com.acts;

public class GenericQueue implements Queue {
	private Object queueData[];
	private int front;
	private int rear;
	
	public GenericQueue(int n) {
		queueData = new Object[n];
		front=-1;
		rear=-1;
	}
	
	public void enqueue(Object element) {
		 if(isFull() && isEmpty()) {
			 front=rear=-1;
		 }
		 if(!isFull()) {
			 ++rear;
			 queueData[rear]=element;
			 System.out.println(element + " added!");
		 }else {
			 throw new QueueFullException("Queue is Full");
		 }
	}

	@Override
	public Object dequeue() {
		if(!isEmpty()) {
			++front;
			System.out.println(queueData[front] + " deleted!");
			return queueData[front];
		} else {
			throw new QueueEmptyException("Queue is empty");
		}
	}

	@Override
	public boolean isFull() {
		if(rear == queueData.length - 1) {
			System.out.println("Queue is full!");
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		if(rear == front) {
			System.out.println("Queue is empty!");
			return true;
		}
		return false;
	}
	
	@Override
	public void printQueue() {
		for(int i = front + 1; i <= rear; i++) {
			System.out.println(queueData[i]);
		}
	}
	
	
	
}
