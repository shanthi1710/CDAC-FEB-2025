package com.acts;

public class dataStack implements Stack{
	private int[] stackData;
	private int top;
	private static final int DEFAULT_CAPACITY= 2;
	private static final double GROWTH_FACTOR = 1.5;
	
	public dataStack(int n) {
		if(n<=0) {
			throw new IllegalArgumentException("Initial capacity must be positive");
		}
		stackData = new int[n];
		top=-1;
	}
	
	@Override
	public void push(int element) {
		 	if (isFull()) {
	            resize();
	        }
	        stackData[++top] = element;
	}
	@Override
	public int pop() {
		if (isEmpty()) {
            throw new IllegalStateException("Cannot pop from an empty stack");
        }
        return stackData[top--];
	}
	@Override
	public int peek() {
		if (isEmpty()) {
            throw new IllegalStateException("Cannot peek an empty stack");
        }
        return stackData[top];
	}
	@Override
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	}
	@Override
	public boolean isFull() {
		 if(top==stackData.length) {
			 return true;
		 }
		 return false;
	}
	
	public void resize() {
		int newCapacity = (int)(stackData.length*GROWTH_FACTOR);
		 int[] newStack = new int[newCapacity];
		 System.arraycopy(stackData,0,newStack,0,stackData.length);
		 stackData=newStack;
		 
	}
	public int size() {
        return top + 1;
    }

    public int capacity() {
        return stackData.length;
    }
}
