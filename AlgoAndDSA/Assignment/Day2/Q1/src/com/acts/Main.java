package com.acts;

public class Main {
	
	public static void main(String[] args) {
		
		Stack stack= new dataStack(15);
		 	
		stack.push(10);
		 	
		stack.push(20);
	    stack.push(30);
	    
	    //resize
	    stack.push(40);
	    
	    System.out.println("Top element: " + stack.peek()); 
        System.out.println("Stack size: " + ((dataStack)stack).size()); 
        System.out.println("Stack capacity: " + ((dataStack)stack).capacity());
        
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
        
        try {
            stack.pop(); 
        } catch (IllegalStateException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
	}

}
