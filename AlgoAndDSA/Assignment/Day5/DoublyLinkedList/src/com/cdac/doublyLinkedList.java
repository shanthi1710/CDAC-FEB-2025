package com.cdac;

public class doublyLinkedList implements CrudInterface{
	Node head;
	Node tail;
	
	doublyLinkedList(){
		head=null;
		tail=null;
	}
	
	
	@Override
	public void addAtFront(int element) {
		Node newNode = new Node(element);
		if(isEmpty()) {
			head=newNode;
			tail=newNode;
			return;
		}
		newNode.next=head;
		head.prev=newNode;
		head=newNode;
	}
	@Override
	public void addAtEnd(int element) {
		Node newNode = new Node(element);
		if(isEmpty()) {
			head=newNode;
			tail=newNode;
			return;
		}
		tail.next=newNode;
		newNode.prev = tail;
		tail=newNode;
	}
	@Override
	public int removeAtFront() {
		if(isEmpty()) {
			throw new IllegalStateException("Linked list is empty");
		}
		Node temp =head;
		head=head.next;
		if(head==null) {
			tail=null;
			return temp.data;
		}
		head.prev=null;
		return temp.data;
	}
	@Override
	public int removeAtEnd() {
		if(isEmpty()) {
			throw new IllegalStateException("Linked list is empty");
		}
		Node temp=tail;
		tail=tail.prev;
		if(tail==null) {
			head=null;
			return temp.data;
		}
		tail.next=null;
		return temp.data;
	}
	@Override
	public boolean isEmpty() {
		if(head==null && tail==null) {
			return true;
		}
		return false;
	}
	@Override
	public void display() {
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+" -> ");
			curr=curr.next;
		}
		System.out.print("null");
		 
	}

}
