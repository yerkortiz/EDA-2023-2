package binarySearchTree;

import binarySearchTree.bst.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.Insert(bst.root, 5);
        bst.InOrder(bst.root);
    }
}
