package com.cdac;

public class Postorder {
	Node root;
	
	public Postorder() {
		root = null;
	}
	
	public void buildTree03() {
		Node n1 = new Node(5);
		Node n2 = new Node(1);
		Node n3 = new Node(3);
		Node n4 = new Node(2);
		
		n1.leftChild = n2;
		n1.rightChild = n3;
		
		n2.leftChild = n4;
		
		root = n1;		 
	}
	private void postorder(Node root) {
		if(root==null) {
			return;
		}
		if(root.leftChild != null) {
			postorder(root.leftChild);
		}
		 
		if(root.rightChild != null) {
			postorder(root.rightChild);
		}
		System.out.print(root.data + " ");
	}
	public void postorder() {
		postorder(root);
	}
}
