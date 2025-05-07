package com.cdac;

public class Main {
	public static void tesTraversal01() {
		Inorder bt01 = new Inorder();
		bt01.buildTree01();
		
		System.out.println("Inorder traversal....");
		bt01.inorder();
	}
	
	public static void tesTraversal02() {
		Preorder bt01 = new Preorder();
		bt01.buildTree02();
		
		System.out.println("Preorder traversal....");
		bt01.preorder();
		
		System.out.println("\nDuplicates count of 5: " + bt01.countDuplicate(50));
	}
	public static void tesTraversal03() {
		Postorder bt01 = new Postorder();
		bt01.buildTree03();
		
		System.out.println("Postorder traversal....");
		bt01.postorder();
		Node n = new Node(50);
//		System.out.println("HERE");
//		bt01.postorder(n);
	}
	public static void main(String[] args) {
		 tesTraversal01();
		 System.out.println("\n");
//		 tesTraversal02();
//		 System.out.println("\n");
//		 tesTraversal03();
	}

}
