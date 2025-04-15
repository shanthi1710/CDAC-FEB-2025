package com.cdac.acts.tester;

import com.cdac.acts.FixedQueueImpl;
import com.cdac.acts.GrowableQueueImpl;
import com.cdac.acts.Queue;

public class QueueTester {
	public static void main(String[] args) throws Exception {
		Queue queue = new FixedQueueImpl();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		System.out.println(queue.add(50));
		
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		
		long startTime = System.currentTimeMillis();
		queue = new GrowableQueueImpl();
		for(int i =1; i <300000000; i++) {
			queue.add(i);
		}
		long endTime = System.currentTimeMillis();
		long diff = endTime - startTime;
		System.out.println("time taken:=" + diff);
		System.out.println(queue.remove());
		System.out.println(queue.remove());
	}

}
