package com.filbin.Enumerables.Linked.Single;

/**
 * Created by mfilbin on 4/12/15.
 */
public class Node<T> {

    public T data;
    public Node<T> next;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

}
