package com.pankiv.datastructure.list;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    private List list;
    ArrayList arrayList = new ArrayList();

    @BeforeEach
    void setList() {
        arrayList = new ArrayList();
    }

    @DisplayName("Test add elements not index")
    @Test
    void testAddNonIndexAndSize() {
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        assertEquals(3, arrayList.size());
    }

    @DisplayName("Test add elements with index")
    @Test
    void testAddWithIndexAndSizeAndGet() {
        arrayList.add("A", 0);
        arrayList.add("B", 1);
        arrayList.add("C", 2);
        arrayList.add("C", 3);
        arrayList.add("B", 4);
        arrayList.add("C", 5);
        arrayList.add("C", 6);
        arrayList.add("B", 7);
        arrayList.add("null", 8);
        arrayList.add("C", 9);
        arrayList.add("B", 10);
        arrayList.add(null, 11);
        arrayList.add(null, 12);

        assertEquals(11, arrayList.size());
        assertEquals("A", arrayList.get(0));
    }

    @DisplayName("Test add elements and change value")
    @Test
    void testAddAndChangeValue() {
        arrayList.add("A", 0);
        arrayList.add("B", 1);
        arrayList.add("C", 2);

        assertEquals("A", arrayList.set("A", 3));
    }

    @DisplayName("Test add elements, remove with return element")
    @Test
    void testAddAndRemoveAndReturnValue() {
        arrayList.add("A", 0);
        arrayList.add("B", 1);
        arrayList.add("C", 2);
        arrayList.add("D", 3);

        assertEquals("B", arrayList.remove(1));
        assertEquals(3, arrayList.size());
        assertEquals("C", arrayList.get(1));
        assertEquals("A", arrayList.get(0));
        assertEquals("D", arrayList.get(2));
    }

    @DisplayName("Test add elements and clear elements")
    @Test
    void testAddAndClearAndIsEmpty() {
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.clear();
        assertTrue(arrayList.isEmpty());
    }

    @DisplayName("Test add elements and return first element index")
    @Test
    void testAddAndIndexOf() {
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("A");
        arrayList.add("A");

        assertEquals(2, arrayList.indexOf("A"));
    }

    @DisplayName("Test add elements and return index non-existent element")
    @Test
    void testAddAndIndexOfReturnNegativeResult() {
        arrayList.add("A");

        assertEquals(-1, arrayList.indexOf("B"));
    }

    @DisplayName("Test add element and return last element index")
    @Test
    void testAddAndLastIndexOf() {
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("A");
        arrayList.add("A");

        assertEquals(3, arrayList.lastIndexOf("A"));
    }

    @DisplayName("Test non element array list")
    @Test
    void testArrayListNonElement() {
        assertTrue(arrayList.isEmpty());
    }
}
