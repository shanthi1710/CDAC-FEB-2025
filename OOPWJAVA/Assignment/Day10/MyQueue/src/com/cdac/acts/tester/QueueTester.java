package com.cdac.acts.tester;

import com.cdac.acts.FixedQueueImpl;
import com.cdac.acts.GrowableQueueImpl;
import com.cdac.acts.Queue;
import com.cdac.acts.QueueEmptyException;

public class QueueTester {
	public static void main(String[] args) {
		 
        Queue fixedQueue = new FixedQueueImpl();
        testQueue(fixedQueue, "Fixed Queue");
        
       
        Queue growableQueue = new GrowableQueueImpl();
        testQueue(growableQueue, "Growable Queue");
    }

    private static void testQueue(Queue queue, String queueType) {
        System.out.println("\nTesting " + queueType);
        try {
            for (int i = 1; i <= 15; i++) {
                boolean added = queue.add(i);
                System.out.println("Added " + i + ": " + added);
            }
        } finally {
            System.out.println("Completed add operations");
        }
 
        try {
            for (int i = 1; i <= 15; i++) {
                try {
                    int value = queue.remove();
                    System.out.println("Removed: " + value);
                } catch (QueueEmptyException e) {
                    System.err.println("Error: " + e.getMessage());
                    break;
                }
            }
        } finally {
            System.out.println("Completed remove operations");
        }
        try {
            queue.remove();
        } catch (QueueEmptyException e) {
            System.err.println("Caught expected exception: " + e.getMessage());
        } finally {
            System.out.println("Completed empty queue test");
        }
	}

}
