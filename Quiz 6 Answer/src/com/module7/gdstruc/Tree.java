package com.module7.gdstruc;

public class Tree {
    private Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        }
        else {
            root.insert(value);
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

    public void traverseInOrderDescending() {
        if (root != null) {
            root.traverseInOrderDescending();
        }
    }

    public Node get(int value) {
        if (root != null) {
            return root.get(value);
        }

        return  null;
    }

    public Node getMin()
    {
        // We will look for the minimum node by searching down the left children of each node
        Node current = root;  //keep track of the current node without changing the root
        if (current != null)
        {
            // Search each node's left child
            while (current.getLeftChild() != null)
            {
                current = current.getLeftChild();
            }
        }
        System.out.println("Node with minimum value: " + current);
        return current;
    }

    public Node getMax()
    {
        // We will look for the maximum node by searching down the right children of each node
        Node current = root;
        if (current != null)
        {
            // Search each node's right child
            while (current.getRightChild() != null)
            {
                current = current.getRightChild();
            }
        }
        System.out.println("Node with maximum value: " + current);
        return root;
    }
}