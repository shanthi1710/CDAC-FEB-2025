package com.cdac;

public class DoublyCircularLinkedList implements ListInterface {
	private Node head;
	
	
	DoublyCircularLinkedList(){
		head=new Node(Integer.MIN_VALUE);
		head.next=head;
		head.prev=head;
	}
	
	@Override
	public void addFirst(int data) {
		Node newNode = new Node(data);
        Node first = head.next;

        newNode.prev = head;
        newNode.next = first;
        first.prev = newNode;
        head.next = newNode;
	}
	
	@Override
	public void addLast(int data) {
		Node newNode = new Node(data);
        Node last = head.prev;

        newNode.next = head;
        newNode.prev = last;
        last.next = newNode;
        head.prev = newNode;
	}
	@Override
	public int removeFirst() throws IllegalStateException{
		if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }

        Node first = head.next;
        Node newFirst = first.next;

        head.next = newFirst;
        newFirst.prev = head;

        return first.data;
	}
	@Override
	public int removeLast() throws IllegalStateException{
		if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }

        Node last = head.prev;
        Node newLast = last.prev;

        newLast.next = head;
        head.prev = newLast;

        return last.data;
	}
	@Override
	public boolean isEmpty() {
		 return head.next == head;
	}
	@Override
	public void displayForward() {
		if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node current = head.next;
        System.out.print("Forward: ");
        while (current != head) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
	}
	@Override
	public void displayBackward() {
		if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node current = head.prev;
        System.out.print("Backward: ");
        while (current != head) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
	}
}
