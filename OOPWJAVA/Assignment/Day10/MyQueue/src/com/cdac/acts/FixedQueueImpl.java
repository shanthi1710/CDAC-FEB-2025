package com.cdac.acts;

public class FixedQueueImpl implements Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;

    public FixedQueueImpl() {
        this.arr = new int[INIT_CAPACITY];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    @Override
    public boolean add(int ele) {
        try {
            if (full()) {
                return false;
            }
            arr[rear] = ele;
            rear = (rear + 1) % arr.length;
            size++;
            return true;
        } finally {
            System.out.println("Add operation attempted on FixedQueue");
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
            System.out.println("Remove operation attempted on FixedQueue");
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