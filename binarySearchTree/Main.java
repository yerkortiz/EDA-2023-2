package binarySearchTree;

import binarySearchTree.bst.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = bst.Insert(bst.root, 5);
        bst.root = bst.Insert(bst.root, 8);
        bst.root = bst.Insert(bst.root, 9);
        bst.root = bst.Insert(bst.root, 1);
        bst.InOrder(bst.root);
    }
}
