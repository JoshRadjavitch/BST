/*
 * Class Name: BSTNode.java
 * 
 * Attributes:
 * 
 * int value: integer value of the node
 * BSTNode left: the left child node of the current node
 * BSTNode right: the right child node of the current node
 * 
 * The following is an object definition for a node in a Binary Search Tree. It contains a constructor, getters and setters for the left and right node,
 * and a getter for the value. These are required to implement the methods contained in BST.java.
 */
public class BSTNode {
    private int value;
    private BSTNode left;
    private BSTNode right;

    // Constructor
    BSTNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    // Setter for Left Child Node
    public void setLeft(BSTNode left) {
        this.left = left;
    }

    // Setter for Right Child Node
    public void setRight(BSTNode right) {
        this.right = right;
    }

    // Getter for Left Child Node
    public BSTNode getLeft() {
        return this.left;
    }
    
    // Getter for Right Child Node
    public BSTNode getRight() {
        return this.right;
    }
    
    // Getter for value of node
    public int getValue() {
        return this.value;
    }
}