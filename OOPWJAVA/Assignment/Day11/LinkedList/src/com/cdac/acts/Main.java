package com.cdac.acts;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		 LinkedList<String>ls=new LinkedList<>();
		 
		 ls.add("Apple");
		 ls.add("Banana");
		 ls.addFirst("Mango");
		 ls.addLast("Orange");
		 ls.add(2,"Grapes");
		 
		 System.out.println("After adding elements: "+ls);
		 
		 ls.remove("Banana");
		 ls.removeFirst();
		 ls.removeLast();
		 ls.remove(0);
		 
		 System.out.println("After removing elements: "+ls);
		 
		 ls.add("Pineapple");
	     ls.add("Watermelon");
	     ls.add("Kiwi");
	     
	     String firstElement = ls.getFirst();
	     String lastElement = ls.getLast();
	     String elementAtIndex1 = ls.get(3);
	     
	     System.out.println("First element: " + firstElement);
	     System.out.println("Last element: " + lastElement);
	     System.out.println("Element at index 1: " + elementAtIndex1);
	     
	     ls.set(0, "Strawberry");
	     System.out.println("After setting first element: " + ls);
	     
	     ls.offer("Blueberry");
	     ls.push("Raspberry");
	     
	     System.out.println("After offer and push: " + ls);
	     
	     String polled = ls.poll();
	     String popped = ls.pop();
	     
	     System.out.println("Polled: " + polled + ", Popped: " + popped);
	        System.out.println("Final LinkedList: " + ls);
	}

}
