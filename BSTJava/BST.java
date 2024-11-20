import java.util.Scanner;
/*
 * Class Name: BST.java
 * 
 * Attributes: 
 * 
 * BSTNode root: root node of the Binary Search Tree
 * 
 * The following is an implementation of a Binary Search Tree. The BST is created
 * using hardcoded values, located in the buildTree() method. Then, the main method will create the BST,
 * ask the user for a value to search for in the tree, and the search() method is called to recursively search the
 * BST and check every node to see if that value is in the tree, and will return true or false depending on
 * if the value is found. From there, it will be printed to the user if the value is found or not.
 */
public class BST {

    private BSTNode root;

    // Constructor
    BST() {
        this.root = null;
    }

    // Method to build the BST with hardcoded values
    public void buildTree() {
        root = new BSTNode(5);
        root.setLeft(new BSTNode(2));
        root.getLeft().setLeft(new BSTNode(1));
        root.getLeft().setRight(new BSTNode(3));
        root.setRight(new BSTNode(12));
        root.getRight().setLeft(new BSTNode(9));
        root.getRight().setRight(new BSTNode(21));
        root.getRight().getRight().setLeft(new BSTNode(19));
        root.getRight().getRight().setRight(new BSTNode(25));
    }

    // Recursive method to search for value in the BST
    public boolean search(BSTNode root, int value) {
        if (root == null) return false;
        if (root.getValue() == value) return true;
        else {
            return (search(root.getLeft(), value) || search(root.getRight(), value));
        }
    }
    
    // Main method to test the buildTree and search methods
    public static void main(String[] args) {
        BST b = new BST();
        b.buildTree();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value to be searched for in the BST: ");
        int value = in.nextInt();
        boolean foundVal = b.search(b.root, value);

        if (foundVal) {
            System.out.println("Value found in BST");
        } else {
            System.out.println("Value not found in BST");
        }
    }
}