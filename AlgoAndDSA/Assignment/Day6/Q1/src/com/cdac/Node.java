package com.cdac;

public class Node {
	public int data;
	public Node leftChild;
	public Node rightChild;
	
	public Node() {
		leftChild=null;
		rightChild=null;
	}
	
	public Node(int data) {
		this.data=data;
		leftChild=null;
		rightChild=null;
	}
}
