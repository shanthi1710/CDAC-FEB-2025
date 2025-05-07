package com.cdac;

public class Inorder {
	public int nodeCount;
	public int leafCount;
	Node root;
	
	public Inorder() {
		nodeCount=0;
		leafCount=0;
		root = null;
	}
	
	public void buildTree01() {
		Node n1 = new Node(5);
		Node n2 = new Node(1);
		Node n3 = new Node(3);
		Node n4 = new Node(2);
		
		n1.leftChild = n2;
		n1.rightChild = n3;
		
		n2.leftChild = n4;
		
		root = n1;		 
	}
	private void inorder(Node root) {
		nodeCount++;
		if(root==null) {
			return;
		}
		if (root.leftChild == null && root.rightChild == null) {
	            leafCount++;  
	    }
		if(root.leftChild != null) {
			inorder(root.leftChild);
		}
		
		System.out.print(root.data + " ");
		
		if(root.rightChild != null) {
			inorder(root.rightChild);
		}
		
	}
	public void inorder() {
		inorder(root);
		System.out.println("total node in tree: "+ nodeCount);
		System.out.println("total leaf node in tree: "+ leafCount);
		
	}
}
