package com.cdac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue queue = new LinkedListQueue();
		int choice;
		
		do {
			display();
			System.out.println("Enter your choice:->");
			choice=sc.nextInt();
			
			switch(choice){
				case 1:{
					System.out.println("Enter element to queue: ");
					try {
						Object ele = sc.next();
						queue.enqueue(ele);
						System.out.println("Element " + ele + " added to queue.");
					}catch(Exception e) {
						 System.out.println("Invalid input. Please try again.");
	                     sc.nextLine();
					}
					break;
				}
				case 2:{
					try {
						Object element = queue.dequeue();
                        System.out.println("Dequeued element: " + element);
					}catch(IllegalStateException e) {
						System.out.println("Error: " + e.getMessage());
					}
					break;
				}
				case 3:{
					System.out.println("Queue is " + (queue.isEmpty() ? "empty" : "not empty"));
					break;
				}
				case 4:{
					System.out.println("Queue is " + (queue.isFull() ? "full" : "not full"));
					break;
				}
				case 5:{
					queue.printQueue();
					break;
				}
				case 6:{
					System.exit(0);
					sc.close();
					break;
				}
				default:{
					System.out.println("Invalid choice");
				}
			}
		}while(choice!=6);
	}
	public static void display() {
		 System.out.println("\n--- Queue Operations Menu ---");
         System.out.println("1. Enqueue (Add element)");
         System.out.println("2. Dequeue (Remove element)");
         System.out.println("3. Check if queue is empty");
         System.out.println("4. Check if queue is full");
         System.out.println("5. Print queue contents");
         System.out.println("6. Exit");
	}

}
