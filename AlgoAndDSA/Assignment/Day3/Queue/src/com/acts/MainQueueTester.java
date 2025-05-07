package com.acts;

public class MainQueueTester {

	public static void main(String[] args) {
		
		try {
			Queue queue = new GenericQueue(2);
			
			queue.enqueue(new Student("Shanthi",24));
			
			queue.enqueue(10);
			queue.printQueue();
			
			
			queue.dequeue();
			//System.out.println("NEXT");
			queue.printQueue();
			queue.dequeue();
			queue.printQueue();
			
			if(queue.isEmpty() && queue.isFull()) {
				System.out.println("ERROR!");
			}
			queue.enqueue(new Student("Suri", 25));
			queue.enqueue("Shilpa");
			queue.printQueue();
		}catch(QueueEmptyException e) {
			System.out.println(e);
		} catch(QueueFullException e) {
			System.out.println(e);
		}
	}

}
