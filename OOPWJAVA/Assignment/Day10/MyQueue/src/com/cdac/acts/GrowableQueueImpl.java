package com.cdac.acts;

public class GrowableQueueImpl implements Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;

    public GrowableQueueImpl() {
        this.arr = new int[INIT_CAPACITY];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    @Override
    public boolean add(int ele) {
        try {
            if (full()) {
                grow();
            }
            arr[rear] = ele;
            rear = (rear + 1) % arr.length;
            size++;
            return true;
        } finally {
            System.out.println("Add operation attempted on GrowableQueue");
        }
    }

    private void grow() {
        try {
            int newCapacity = arr.length * 2;
            int[] newArr = new int[newCapacity];
            
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[(front + i) % arr.length];
            }
            
            arr = newArr;
            front = 0;
            rear = size;
        } finally {
            System.out.println("Queue grew from " + (arr.length/2) + " to " + arr.length);
        }
    }

    @Override
    public int remove() throws QueueEmptyException {
        try {
            if (empty()) {
                throw new QueueEmptyException("Cannot remove from empty queue");
            }
            int ele = arr[front];
            front = (front + 1) % arr.length;
            size--;
            return ele;
        } finally {
            System.out.println("Remove operation attempted on GrowableQueue");
        }
    }

    @Override
    public boolean empty() {
        return size == 0;
    }

    @Override
    public boolean full() {
        return size == arr.length;
    }

    @Override
    public int capacity() {
        return arr.length;
    }
}