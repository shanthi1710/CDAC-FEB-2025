package com.cdac;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public boolean search(int data) {
        return searchRec(root, data);
    }

    private boolean searchRec(Node root, int data) {
        if (root == null) {
            return false;
        }

        if (root.data == data) {
            return true;
        }

        if (data < root.data) {
            return searchRec(root.left, data);
        }

        return searchRec(root.right, data);
    }

    public void displayUsingInorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public void deleteElementUsingSuccessor(int data) {
        root = deleteRec(root, data);
    }

    private Node deleteRec(Node root, int data) {
        if (root == null) {
            return root;
        }

        if (data < root.data) {
            root.left = deleteRec(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRec(root.right, data);
        } else {
            
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

          
            root.data = minValue(root.right);

          
            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    private int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }
    public int findSmallestRec() {
    	if(null == root) {
    		throw new IllegalStateException("Tree is Empty");
    	}
    	return findSmallestRec(root);
    }
    private int findSmallestRec(Node root) {
    	if(root.left==null) {
    		return root.data;
    	}
    	return findSmallestRec(root.left);
    }
    
    public int findLargestRec() {
    	if(null == root) {
    		throw new IllegalStateException("Tree is Empty");
    	}
    	return findLargestRec(root);
    }
    
    private int findLargestRec(Node root) {
    	if(null == root.right) {
    		return root.data;
    	}
    	return findLargestRec(root.right);
    }
    
    /*
    public void deleteElementUsingPredecessor(int key) {
    	
        root = deleteRec(root, key);
    }
    
    private Node deleteRec(Node root, int key) {
        // Base case: tree is empty or key not found
        if (root == null) return null;

        // Traverse left or right based on key
        if (key < root.data) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.data) {
            root.right = deleteRec(root.right, key);
        } else { // Node to delete found
            // Case 1: No child or one child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Case 2: Two children → Replace with inorder predecessor
            root.data = maxValue(root.left); // Find predecessor
            root.left = deleteRec(root.left, root.data); // Delete the predecessor
        }
        return root;
    }
    
    private int maxValue(Node root) {
        int max = root.data;
        while (root.right != null) {
            max = root.right.data;
            root = root.right;
        }
        return max;
    }
    */
}