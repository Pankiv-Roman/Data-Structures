package com.pankiv.datasructure.queue;

public interface Queue {
    void dequeue(Object value);

    Object enqueue();

    Object peek();

    boolean offer(Object value);

    int size();

    void remove();
}
