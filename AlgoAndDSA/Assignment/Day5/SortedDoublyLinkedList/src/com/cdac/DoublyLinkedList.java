package com.cdac;

public class DoublyLinkedList implements CrudInterface{
	
	Node head;
	Node tail;
	
	public DoublyLinkedList() {
		head=null;
		tail=null;
	}
	
	@Override
	public boolean isEmpty() {
		if(head == null && tail == null) {
			return true;
		}
		return false;
	}
	
	@Override
	public void insert(int element) {
		Node newNode =new Node(element);
		
		if(isEmpty()) {
			head=newNode;
			tail=newNode;
			return;
		}
		
		Node curr = head;
		while(curr!=null) {
			if(curr.data > element) {
				break;
			}
			curr=curr.next;
		}
		if(curr==head) {
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
			return;
		}
		if(curr == null) {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			return;
		}
		newNode.next = curr;
		newNode.prev = curr.prev;
		curr.prev = newNode;
		curr.prev.next = newNode;
	}
	@Override
	public void delete(int element) {
		//traversal
				Node current = head;
				while(current != null) {
					if(current.data == element) {
						break;
					}
					current = current.next;
				}
				
				//empty or no element found
				if(current == null) {
					System.out.println("Element not found!");
					return;
				}
				
				//first element
				if(current == head) {
					head = current.next;
					//checking if list got empty
					if(head == null) {
						tail = null;
						return;
					}
					head.prev = null;
					return;
				}
				
				//last element
				if(current == tail) {
					tail = current.prev;
					if(tail == null) {
						head = null;
						return;
					}
					tail.next = null;
					return;
				}
				
				//generic code
				current.prev.next = current.next;
				current.next.prev = current.prev;
	}
	@Override
	public void deleteAll(int element) {
		while(true) {
			Node current = head;
			while(current != null) {
				if(current.data == element) {
					break;
				}
				current = current.next;
			}
			
			//empty or no element found
			if(current == null) {
				break;
			}
			
			//first element
			if(current == head) {
				head = current.next;
				//checking if list got empty
				if(head == null) {
					tail = null;
					return;
				}
				head.prev = null;
				return;
			}
			
			//last element
			if(current == tail) {
				tail = current.prev;
				if(tail == null) {
					head = null;
					return;
				}
				tail.next = null;
				return;
			}
			
			//generic code
			current.prev.next = current.next;
			current.next.prev = current.prev;
		}

	}
	@Override
	public boolean search(int element) {
		Node current = head;
		while(current != null) {
			if(current.data == element) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	@Override
	public void print() {
		Node curr =head;
		while(curr!=null) {
			System.out.print(curr.data+" -> ");
			curr=curr.next;
		}
		System.out.print(" null");
		System.out.print(isEmpty());
	}
	public void printBack() {
		Node current = tail;
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.prev;
		}
		System.out.println("");
	}

}
