package com.cdac;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Insert elements
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
        
        
        // Display tree using inorder traversal
        System.out.println("Inorder traversal of the BST:");
        bst.displayUsingInorder();
        
        //Smallest Element
        System.out.println("Smallest element:-> "+bst.findSmallestRec());
        
        //Largest Element;
        System.out.println("Largest element:-> "+bst.findLargestRec());
        
        // Search for elements
        System.out.println("Search for 40: " + bst.search(40));
        System.out.println("Search for 90: " + bst.search(90));

        // Delete elements
        System.out.println("\nDeleting 20 (leaf node)");
        bst.deleteElementUsingSuccessor(20);
        bst.displayUsingInorder();

        System.out.println("\nDeleting 30 (node with one child)");
        bst.deleteElementUsingSuccessor(30);
        bst.displayUsingInorder();

        System.out.println("\nDeleting 50 (node with two children)");
        bst.deleteElementUsingSuccessor(50);
        bst.displayUsingInorder();
    }
}