package com.cdac;

public class Preorder {
	Node root;
	
	public Preorder() {
		root = null;
	}
	
	public void buildTree02() {
		Node n1 = new Node(5);
		Node n2 = new Node(1);
		Node n3 = new Node(3);
		Node n4 = new Node(2);
		
		n1.leftChild = n2;
		n1.rightChild = n3;
		
		n2.leftChild = n4;
		
		root = n1;		 
	}
	private void preorder(Node root) {
		if(root==null) {
			return;
		}
		
		System.out.print(root.data + " ");
		
		if(root.leftChild != null) {
			preorder(root.leftChild);
		}
		
		if(root.rightChild != null) {
			preorder(root.rightChild);
		}
	}
	public void preorder() {
		preorder(root);
	}
	
	public int countDuplicate(int element) {
		return countDuplicate(root, element);
	}

	private int countDuplicate(Node root, int element) {
		if(root == null) {
			return 0;
		}
		
		if(root.data == element) {
			return 1;
		}
		return countDuplicate(root.leftChild, element) + countDuplicate(root.rightChild, element);
	}
}
