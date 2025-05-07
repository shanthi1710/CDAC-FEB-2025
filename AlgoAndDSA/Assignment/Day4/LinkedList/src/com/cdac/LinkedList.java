package com.cdac;

public class LinkedList implements LinkedListInterface {
	private Node head;
	private int size;
	
	public LinkedList() {
		head=null;
		size=0;
	}
	
	@Override
	public boolean isEmpty() {
		return head==null;
	}
	
	@Override
	public int size() {
		return size;
	}
	
	@Override
	public void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next=head;
		head=newNode;
		size++;
	}
	
	@Override
	public void addLast(int data) {
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			head=newNode;
		}else {
			Node curr = head;
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next=newNode;
		}
		size++;
	}
	@Override
	public void add(int index,int data) {
		if(index<0 || index>size()) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		
		if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
        	Node newNode = new Node(data);
        	Node curr = head;
        	
        	for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
        	newNode.next=curr.next;
        	curr.next=newNode;
        	size++;
        }
	}
	
	@Override
	public int removeFirst() {
		 if (isEmpty()) {
			 throw new RuntimeException("List is empty");
	     }
		 int data = head.data;
		 head=head.next;
		 size--;
		 return data;
	}
	@Override
	public int removeLast() {
		 if (isEmpty()) {
			 throw new RuntimeException("List is empty");
	     }
		 if(size==1) {
			 return removeFirst();
		 }
		 Node curr = head;
		 while(curr.next.next != null) {
			 curr=curr.next;
		 }
		 int data = curr.next.data;
		 curr.next=null;
		 size--;
		return data;
		
	}
	@Override
	public int remove(int index) {
		 if (index < 0 || index >= size) {
	            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		 }
		 if (index == 0) {
	            return removeFirst();
	        } else if (index == size - 1) {
	            return removeLast();
	        } else {
	        	Node curr = head;
	        	for (int i = 0; i < index - 1; i++) {
	                curr = curr.next;
	            }
	            
	            int data = curr.next.data;
	            curr.next = curr.next.next;
	            size--;
	            return data;
	        }
		 
	}
	 @Override
	    public int get(int index) {
	        if (index < 0 || index >= size) {
	            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
	        }
	        
	        Node curr = head;
	        for (int i = 0; i < index; i++) {
	            curr = curr.next;
	        }
	        
	        return curr.data;
	    }
	 public void set(int index, int data) {
	        if (index < 0 || index >= size) {
	            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
	        }
	        
	        Node curr = head;
	        for (int i = 0; i < index; i++) {
	            curr = curr.next;
	        }
	        
	        curr.data = data;
	    }

	@Override
	public String toString() {
		if(isEmpty()) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder("[");
		Node curr = head;
		
		while(curr != null) {
			 sb.append(curr.data);
	            if (curr.next != null) {
	                sb.append(", ");
	            }
	            curr = curr.next;
		}
		sb.append("]");
        return sb.toString();
	}
}

