package com.filbin.Enumerables.Tree;

public class Binary<T extends Comparable<T>> {

    private Node<T> root;
    private int count;

    public void Add(T element) {
        if (isEmpty()) {
            root = new Node<T>(null, null, element);
        } else {
            addTo(root, element);
        }

        count++;
    }

    private void addTo(Node<T> node, T element) {
        if (element.compareTo(node.getData()) < 0) {
            if (!node.hasLeft()) {
                node.setLeft(new Node<T>(null, null, element));
            } else {
                addTo(node.getLeft(), element);
            }
        } else {
            if (!node.hasRight()) {
                node.setRight(new Node<T>(null, null, element));
            } else {
                addTo(node.getRight(), element);
            }
        }
    }

    public boolean contains(T value) {
        return find(root, value) != null;
    }


    private Node<T> find(Node<T> node, T value) {

        if (node.getData() == null) {
            return null;
        } else {
            int result = node.getData().compareTo(value);

            if (result > 0 && node.hasLeft()) {
                return find(node.getLeft(), value);
            } else if (result < 0 && node.hasRight()) {
                return find(node.getRight(), value);
            } else {
                return node;
            }
        }
    }

    public int size() {
        return count;
    }


    public boolean isEmpty() {
        return root == null;
    }


}
