package com.cdac;

public class SingleLinkedList {
    private Node head;
    private int size;

    public SingleLinkedList() {
        head = null;
        size = 0;
    }

    // Add element x at the given index I
    public void add(int x, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node newNode = new Node(x);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    // Remove the last occurrence of X from the list
    public void removeLast(int x) {
        if (head == null) return;

        Node toRemove = null;
        Node prevToRemove = null;
        Node current = head;
        Node prev = null;

        while (current != null) {
            if (current.data == x) {
                prevToRemove = prev;
                toRemove = current;
            }
            prev = current;
            current = current.next;
        }
        // Removing head
        if (toRemove != null) {
            if (prevToRemove == null) {
               
                head = head.next;
            } else {
                prevToRemove.next = toRemove.next;
            }
            size--;
        }
    }

    // Return all elements of the linkedlist separated by comma from head to end
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(",");
            }
            current = current.next;
        }
        return sb.toString();
    }

    // Print the middle element of the linked list
    public void printMiddle() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle element: " + slow.data);
    }

    // Utility method to get size
    public int size() {
        return size;
    }
}