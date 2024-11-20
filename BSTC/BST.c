#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct BSTNode {
    int value;
    struct BSTNode *left;
    struct BSTNode *right;
} Node;

typedef struct BST {
    Node* root;
} Tree;

Tree buildTree();
Node createNode(int val);
bool search(Node *root, int val);

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

Node createNode(int val) {
    Node *new = (Node *) malloc(sizeof(Node));
    new->value = val;
    new->left = NULL;
    new->right = NULL;
}

Tree buildTree() {
    Tree *b = (Tree *) malloc(sizeof(Tree));
    *b->root = createNode(5);
    *b->root->left = createNode(2);
    *b->root->left->left = createNode(1);
    *b->root->left->right = createNode(3);
    *b->root->right = createNode(12);
    *b->root->right->left = createNode(9);
    *b->root->right->right = createNode(21);
    *b->root->right->right->left = createNode(19);
    *b->root->right->right->right = createNode(25);
    return *b;
}

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