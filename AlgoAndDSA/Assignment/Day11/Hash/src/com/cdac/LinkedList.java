package com.cdac;

public class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    public void add(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }
}