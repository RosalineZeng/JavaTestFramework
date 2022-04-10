package com.hello.demo.controller;

public class BSTree<T extends Comparable<T>> {
    private BSTNode<T> mRoot;

    public class BSTNode<T extends Comparable<T>> {
        T key;
        BSTNode<T> left;
        BSTNode<T> right;
        BSTNode<T> parent;

        public BSTNode(T key, BSTNode<T> parent, BSTNode<T> left, BSTNode<T> right) {
            this.key = key;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }

        public T getKey() {
            return key;
        }

        public String toString() {
            return "Key: " + key;
        }
    }

    public BSTree() {
        mRoot = null;
    }

    private void preOrder(BSTNode<T> tree) {
        if(tree != null) {
            System.out.println(tree.key + " ");
            preOrder(tree.left);
            preOrder(tree.right);
        }
    }

    public void preOrder() {
        preOrder(mRoot);
    }

    private void inOrder(BSTNode<T> tree) {
        if(tree != null) {
            inOrder(tree.left);
            System.out.println(tree.key + " ");
            inOrder(tree.right);
        }
    }

    public void inOrder() {
        inOrder(mRoot);
    }

    private void postOrder(BSTNode<T> tree) {
        if(tree != null) {
            postOrder(tree.left);
            postOrder(tree.right);
            System.out.println(tree.key + " ");
        }
    }

    public void postOrder() {
        postOrder(mRoot);
    }

    private BSTNode<T> search(BSTNode<T> x, T key) {
        if (x==null){
            return x;
        }

        int cmp = key.compareTo(x.key);
        if(cmp < 0) {
            return search(x.left, key);
        } else if (cmp > 0) {
            return search(x.right,key);
        } else {
            return x;
        }
    }

    public BSTNode<T> search(T key) {
        return search(mRoot, key);
    }

    private BSTNode<T> iterativeSearch(BSTNode<T> x, T key) {
        while (x!= null) {
            int cmp = key.compareTo(x.key);

            if(cmp < 0) {
                x = x.left;
            } else if (cmp > 0) {
                x = x.right;
            } else {
                return x;
            }
        }
        return x;
    }

    public BSTNode<T> iterativeSearch(T key) {
        return iterativeSearch(mRoot, key);
    }

    private BSTNode<T> minimum(BSTNode<T> tree) {
        if (tree == null) {
            return null;
        }

        while(tree.left != null) {
            tree = tree.left;
        }
        return tree;
    }

    public T minimum() {
        BSTNode<T> p = minimum(mRoot);
        if(p != null) {
            return p.key;
        }
        return null;
    }

    private BSTNode<T> maximum(BSTNode<T> tree) {
        if (tree == null) {
            return null;
        }
        while(tree.right != null) {
            tree = tree.right;
        }
        return tree;
    }

    public T maximum() {
        BSTNode<T> p = maximum(mRoot);
        if(p != null) {
            return p.key;
        }
        return null;
    }
}
