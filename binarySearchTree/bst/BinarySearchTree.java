package binarySearchTree.bst;

public class BinarySearchTree {
    public class BinarySearchTreeNode {
        public int key;
        BinarySearchTreeNode left;
        BinarySearchTreeNode right;

        public BinarySearchTreeNode(int key) {
            this.key = key;
        }
    }

    public BinarySearchTreeNode root;
    public BinarySearchTree() {
        root = null;
    }
    

    public  BinarySearchTreeNode Insert(BinarySearchTreeNode x, int key) {
        if (x == null) {
            x = new BinarySearchTreeNode(key);
            return x;
        }

        if(x.key > key) {
            x.left = Insert(x.left, key);
        } else {
            x.right = Insert(x.right, key);
        }

        return x;
    }

    public BinarySearchTreeNode Search(BinarySearchTreeNode x, int key) {
        if (x == null || x.key == key) {
            return x;
        }

        if (x.key > key) {
            return Search(x.left, key);
        } else {
            return Search(x.right, key);
        }
    }

    public void InOrder(BinarySearchTreeNode x) {
        if (x != null) {
            InOrder(x.left);
            System.out.printf("%d\n", x.key);
            InOrder(x.right);
        }
    }

    public void PreOrder(BinarySearchTreeNode x) {
        if (x != null) {
            System.out.printf("%d\n", x.key);
            PreOrder(x.left);
            PreOrder(x.right);
        }
    }

    public void PostOrder(BinarySearchTreeNode x) {
        if (x != null) {
            PostOrder(x.left);
            PostOrder(x.right);
            System.out.printf("%d\n", x.key);
        }
    }
}
