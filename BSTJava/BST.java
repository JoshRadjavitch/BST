import java.util.Scanner;

public class BST {

    private BSTNode root;

    // Constructor
    BST() {
        this.root = null;
    }

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

    public boolean search(BSTNode root, int value) {
        if (root == null) return false;
        if (root.getValue() == value) return true;
        else {
            return (search(root.getLeft(), value) || search(root.getRight(), value));
        }
    }
    
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