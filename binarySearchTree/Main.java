package binarySearchTree;

import binarySearchTree.binarySearchTree.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.Insert(bst.root, 5);
        bst.InOrder(bst.root);
    }
}
