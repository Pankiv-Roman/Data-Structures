package com.pankiv.datastructure.list;


public class Node {
    public Object item;
    Node next;
    Node prev;
    Object value;

    public Node(Object value) {
        this.value = value;
    }

    public Node(Node prev, Object element, Node next) {
        this.item = element;
        this.next = next;
        this.prev = prev;
    }
}

