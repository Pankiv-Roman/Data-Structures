package com.pankiv.datastructure.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkedListTest {

    private List list;
    LinkedList linkedList = new LinkedList();

    @BeforeEach
    void setList() {
        linkedList = new LinkedList();
    }

    @DisplayName("Test add elements non index and size")
    @Test
    void testAddNonIndexElementAndSize() {
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        assertEquals(3, linkedList.size());
    }

    @DisplayName("Test add elements with index and size")
    @Test
    void testAddWithIndexAndSize() {
        linkedList.add("A", 0);
        linkedList.add("B", 1);
        linkedList.add("C", 2);

        assertEquals(3, linkedList.size());
    }

    @DisplayName("Test add elements and remove")
    @Test
    void testAddAndRemove() {
        linkedList.add("A", 0);
        linkedList.add("B", 1);
        linkedList.add("C", 2);

        assertEquals(null, linkedList.remove(0));
    }

    @DisplayName("Test add elements with index")
    @Test
    void testAddWithIndexAndSizeAndGet() {
        linkedList.add("A", 0);
        linkedList.add("B", 1);
        linkedList.add("C", 2);


        assertEquals(3, linkedList.size());
        assertEquals("B", linkedList.get(1));
    }

    @DisplayName("Test add elements and change value")
    @Test
    void testAddAndChangeValue() {
        linkedList.add("A", 0);
        linkedList.add("B", 1);
        linkedList.add("C", 2);

        assertEquals("A", linkedList.set("A", 2));
    }

    @DisplayName("Test add elements, remove with return element")
    @Test
    void testAddAndRemoveAndReturnValue() {
        linkedList.add("A", 0);
        linkedList.add("B", 1);
        linkedList.add("C", 2);
        linkedList.add("D", 3);

        assertEquals(null, linkedList.remove(0));
        assertEquals(3, linkedList.size());

    }

    @DisplayName("Test add elements and clear elements")
    @Test
    void testAddAndClearAndIsEmpty() {
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.clear();
        assertTrue(linkedList.isEmpty());
    }

    @DisplayName("Test add elements and return first element index")
    @Test
    void testAddAndIndexOf() {
        linkedList.add("B");
        linkedList.add("D");
        linkedList.add("A");
        linkedList.add("A");

        assertEquals(2, linkedList.indexOf("A"));
    }

    @DisplayName("Test add element and return last element index")
    @Test
    void testAddAndLastIndexOf() {
        linkedList.add("B");
        linkedList.add("D");
        linkedList.add("A");
        linkedList.add("A");

        assertEquals(3, linkedList.lastIndexOf("A"));
    }

}
