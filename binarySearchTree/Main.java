package binarySearchTree;

import binarySearchTree.bst.BinarySearchTree;
import binarySearchTree.bst.BinarySearchTree.BinarySearchTreeNode;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = bst.Insert(bst.root, 5);
        bst.root = bst.Insert(bst.root, 8);
        bst.root = bst.Insert(bst.root, 9);
        bst.root = bst.Insert(bst.root, 1);
        BinarySearchTreeNode x = bst.Search(bst.root, 3);
        System.out.println(x.key);
        // bst.InOrder(bst.root);
        // bst.PreOrder(bst.root);
        // bst.PostOrder(bst.root);
    }
}
