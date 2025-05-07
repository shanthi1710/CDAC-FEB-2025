package com.cdac;

public class LinkedListQueue implements Queue{
	private Node front;
	private Node rear;
	private int size;
	
	public LinkedListQueue() {
		front=null;
		rear=null;
		size=0;
	}
	
	@Override
	public void enqueue(Object element) {
		Node newNode = new Node(element);
		if(isEmpty()){
			front=newNode;
		}else {
			rear.setNext(newNode);
		}
		rear=newNode;
		size++;
	}
	@Override
	public boolean isEmpty() {
		return front==null;
	}
	@Override
	public boolean isFull() {
		return false;
	}
	@Override
	public void printQueue() {
		Node curr = front;
		System.out.println("Queue: ");
		while(curr!=null) {
			System.out.println(curr.getData()+" -> ");
			curr=curr.getNext();
		}
		System.out.println();
	}
	@Override
	public Object dequeue() {
		if(isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		Object reomovedData = front.getData();
		front=front.getNext();
		if(front==null) {
			rear=null;
		}
		size--;
		return reomovedData;
	}
	public int size() {
		return size;
	}
	
}
