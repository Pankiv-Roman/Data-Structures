package com.pankiv.datastructure.queue;


import java.util.Arrays;

public class ArrayQueue implements Queue {

    int size;
    private Object[] array;

    public ArrayQueue() {
        array = new Object[10];
    }

    public ArrayQueue(int initialCapacity) {
        array = new Object[initialCapacity];
    }

    @Override
    public void enqueue(Object value) {

        array[size] = value;
        size++;
    }

    @Override
    public Object dequeue() {

        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }
        Object e = array[0];
        array = Arrays.copyOfRange(array, 1, size);
        size--;
        return e;
    }

    @Override
    public Object peek() {
        return array[0];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object value) {
        for (int i = 0; i < size; i++) {
            Object valueInQueue = array[i];
            if (value.equals(valueInQueue)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        size = 0;
    }
}
