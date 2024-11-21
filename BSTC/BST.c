/*
* Class Name: BST.c
*
* Structures: 
* Node: contains the value stored in the node, with a pointer to both the left and right child nodes
* Tree: contains a pointer to the root node of the BST
*
*
* The following is an implementation of a Binary Search Tree using C and the imperative programming paradigm. This implementation contains 
* a method to build the tree with hardcoded values, which repeatedly calls the createNode method, which allocates and initializes memory to create a new
* BST node and place it in the correct spot in the tree. In addition, there is a recursive search method, which searches through the tree to find the value
* provided by the user, and it will return true if it finds the value, and false if it does not. Based on the returned value, it is returned to the user
* whether or not the value was found.
*
*/
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

// Initialization of the Node structure
typedef struct BSTNode {
    int value;
    struct BSTNode *left;
    struct BSTNode *right;
} Node;

// Initialization of the Tree structure
typedef struct BST {
    Node* root;
} Tree;

// Function prototypes
Tree buildTree();
Node* createNode(int val);
bool search(Node *root, int val);

// Main function to test BST functionality
int main(int argc, char * argv[]) {
    Tree b = buildTree();

    int value;
    printf("Enter a value to search the BST for: ");
    scanf("%d", &value);
    bool found = search(b.root, value);
    if (found) {
        printf("\nValue found in BST");
    }
    else {
        printf("\nValue not found in BST");
    }
    return 0;
}

// Function to create and initalize a node
Node* createNode(int val) {
    Node *new = (Node *) malloc(sizeof(Node));
    new->value = val;
    new->left = NULL;
    new->right = NULL;
    return new;
}

// Function to build BST with hardcoded values
Tree buildTree() {
    Tree *b = (Tree *) malloc(sizeof(Tree));
    b->root = createNode(5);
    b->root->left = createNode(2);
    b->root->left->left = createNode(1);
    b->root->left->right = createNode(3);
    b->root->right = createNode(12);
    b->root->right->left = createNode(9);
    b->root->right->right = createNode(21);
    b->root->right->right->left = createNode(19);
    b->root->right->right->right = createNode(25);
    return *b;
}

// Recursive function to search BST for the value val
bool search(Node *root, int val) {
    if (root == NULL) {
        return false;
    }
    if (root->value == val) {
        return true;
    }
    else {
        return (search(root->left, val) || search(root->right, val));
    }
}