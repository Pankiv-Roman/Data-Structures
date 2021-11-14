package com.pankiv.datastructure.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ArrayQueueTest {

    private Queue queue;
    ArrayQueue arrayQueue = new ArrayQueue();

    @BeforeEach
    void setUp() {
        queue = new ArrayQueue();
    }

    @Test
    void testDequeueAndEnqueue() {
        arrayQueue.enqueue("A");
        arrayQueue.enqueue("B");
        arrayQueue.enqueue("C");

        assertEquals(3, arrayQueue.size());
        assertEquals("A", arrayQueue.dequeue());
        assertEquals("B", arrayQueue.dequeue());
        assertEquals("C", arrayQueue.dequeue());


    }

    @Test
    void testDequeueAndPeek() {
        arrayQueue.enqueue("A");
        arrayQueue.enqueue("B");

        assertEquals("A", arrayQueue.peek());
        assertEquals("A", arrayQueue.peek());
        assertEquals(2, arrayQueue.size());
    }


    @Test
    public void testDequeueAndSize() {
        arrayQueue.enqueue("A");
        arrayQueue.enqueue("B");

        assertEquals(2, arrayQueue.size());
    }

    @Test
    public void testDequeueAndRemove() {
        arrayQueue.enqueue("A");
        arrayQueue.enqueue("B");

        arrayQueue.clear();
        assertTrue(arrayQueue.isEmpty());
    }

    @Test
    public void testIsEmptyReturnTrueIsQueueWithData() {
        arrayQueue.enqueue("A");
        arrayQueue.enqueue("B");

        assertTrue(arrayQueue.contains(new String("A")));
    }

    @Test
    public void testIsEmptyReturnFalseIsEmptyQueue() {
        arrayQueue.enqueue("A");
        arrayQueue.enqueue("B");

        assertFalse(arrayQueue.contains(new String("C")));

    }

}
