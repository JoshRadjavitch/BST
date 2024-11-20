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

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }

    public BSTNode getLeft() {
        return this.left;
    }
    
    public BSTNode getRight() {
        return this.right;
    }
    
    public int getValue() {
        return this.value;
    }
}