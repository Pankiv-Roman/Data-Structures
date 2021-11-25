package com.pankiv.datastructure.list;

public class LinkedList implements List {

    Node head;
    Node tail;
    int size;


    void linkedHead(Object value) {
        final Node f = head;
        final Node newNode = new Node(value);
        head = newNode;
        if (f == null)
            tail = newNode;
        else
            f.prev = newNode;
        size++;
    }

    void linkTail(Object value) {
        final Node l = tail;
        final Node newNode = new Node(value);
        tail = newNode;
        if (l == null)
            head = newNode;
        else
            l.next = newNode;
        size++;
    }

    void linkBefore(Object value, Node succ) {
        final Node pred = succ.prev;
        final Node newNode = new Node(value);
        succ.prev = newNode;
        if (pred == null)
            head = newNode;
        else
            pred.next = newNode;
        size++;
    }

    @Override
    public void add(Object value) {
        linkTail(value);
    }

    @Override
    public void add(Object value, int index) {
        checkPositionIndex(index);

        if (index == size)
            linkedHead(value);
        else
            linkBefore(value, node(index));

    }

    @Override
    public Object remove(int index) {
        checkElementIndex(index);
        return unlink(node(index));
    }

    @Override
    public Object get(int index) {
        return node(index).value;
    }

    @Override
    public Object set(Object value, int index) {
        checkElementIndex(index);
        Node x = node(index);
        Object oldVal = x.value;
        x.value = value;
        return oldVal;
    }

    @Override
    public void clear() {
        for (Node x = head; x != null; ) {
            Node next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        head = tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size <= 0;
    }

    @Override
    public boolean contains(Object value) {
        return indexOf(value) >= 0;
    }

    @Override
    public int indexOf(Object value) {
        int index = 0;
        if (value == null) {
            for (Node x = head; x != null; x = x.next) {
                if (x.value == null)
                    return index;
                index++;
            }
        } else {
            for (Node x = head; x != null; x = x.next) {
                if (value.equals(x.value))
                    return index;
                index++;
            }
        }
        return -1;

    }

    @Override
    public int lastIndexOf(Object value) {
        int index = size;
        if (value == null) {
            for (Node x = tail; x != null; x = x.prev) {
                index--;
                if (x.value == null)
                    return index;
            }
        } else {
            for (Node x = tail; x != null; x = x.prev) {
                index--;
                if (value.equals(x.value))
                    return index;
            }
        }
        return -1;
    }

    private void checkElementIndex(int index) {
        if (!(index >= 0 && index < size)) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    private void checkPositionIndex(int index) {
        if (!(index >= 0 && index <= size)){
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);}
    }

    Object unlink(Node x) {
        final Object element = x.item;
        final Node next = x.next;
        final Node prev = x.prev;

        if (prev == null) {
            head = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            tail = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        return element;
    }

    Node node(int index) {
        if (index < (size >> 1)) {
            Node x = head;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node x = tail;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }

}