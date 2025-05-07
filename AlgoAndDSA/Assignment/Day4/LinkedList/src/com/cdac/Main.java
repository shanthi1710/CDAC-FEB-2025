package com.cdac;

public class Main {

	public static void main(String[] args) {
		 LinkedList list = new LinkedList();
		 
		 list.addLast(10);
		 list.addFirst(5);
		 list.add(1, 7);
		 list.addLast(15);
		 System.out.println("List: " + list); 
	        System.out.println("Size: " + list.size());  
	        
	        System.out.println("Element at index 2: " + list.get(2));  
	        list.set(2, 12);
	        System.out.println("After set: " + list);  
	        
	        list.removeFirst();
	        System.out.println("After remove first: " + list);  
	        
	        list.removeLast();
	        System.out.println("After remove last: " + list); 
	        
	        list.remove(1);
	        System.out.println("After remove at index 1: " + list);  
	        
	        System.out.println("After clear: " + list);  
	}

}
