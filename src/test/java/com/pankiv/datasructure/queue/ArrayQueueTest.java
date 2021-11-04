package com.pankiv.datasructure.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayQueueTest {

    private Queue queue;

    @BeforeEach
    void setUp() {
        queue = new ArrayQueue();
    }

    @Test
    void dequeue() {
        queue.dequeue("A");
        queue.dequeue("B");


    }

    @Test
    void enqueue() {
    }

    @Test
    void peek() {
    }

    @Test
    void offer() {
    }

    @Test
    void size() {
    }

    @Test
    void remove() {
    }
}