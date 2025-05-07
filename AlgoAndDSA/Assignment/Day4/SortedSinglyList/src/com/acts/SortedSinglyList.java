package com.acts;

public class SortedSinglyList implements SortedList{
	SNode head;
	
	public SortedSinglyList() {
		head = null;
	}
	
	@Override
	public void insert(int element) {
		SNode newNode = new SNode(element);
		if(head==null) {
			head=null;
			return;
		}
		
		SNode curr = head;
		SNode prev = null;
		while(curr!=null) {
			if(curr.data>element) {
				break;
			}else {
				prev = curr;
				curr=curr.next;
			}
		}
		if(prev==null){
			newNode.next=head.next;
			head = newNode;
			return;
		}
		prev.next=newNode;
		newNode.next=curr;
	}
	
	@Override
	public void delete(int element) {
		if(head==null) {
			System.out.println("Can't delete " + element + " as list is empty!");
			return;
		}
		SNode curr = head;
		SNode prev = null;
		
		while(curr!=null) {
			if(curr.data==element) {
				break;
			}else {
				prev = curr;
				curr=curr.next;
			}
		}
		
		if(curr == null) {
			System.out.println("Can't find " + element + " in list!");
			return;
		}
		
		if(prev == null) {
			head = curr.next;
			return;
		}
		prev.next=curr.next;
	}
	
	@Override
	public void deleteAll(int element) {
		while(true) {
			if(head==null) {
				System.out.println("Can't delete " + element + " as list is empty!");
				return;
			}
			SNode curr = head;
			SNode prev = null;
			while(curr != null) {
				if(curr.data == element) {
					break;
				} else {
					prev = curr;
					curr = curr.next;
				}
			}
			if(curr == null) {
				break;
			}
			if(prev == null) {
				head=curr.next;
				return;
			}
			prev.next = curr.next;
			
		}
	}
	
	@Override
	public void print() {
		SNode curr = head;
		while(curr!=null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println("");
	}
	
	@Override
	public boolean search(int element) {
		SNode found = head;
		while(found != null) {
			if(found.data == element) {
				return true;
			}else {
				found = found.next;
			}
		}
		return false;
	}
}
