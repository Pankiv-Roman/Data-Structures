package com.pankiv.datastructure.list;

import java.util.Arrays;
import java.util.StringJoiner;

public class ArrayList implements List {
    private Object[] array = new Object[10];
    private int size;

    @Override
    public void add(Object value) {
        array[size] = value;
        size++;
    }

    @Override
    public void add(Object value, int index) {
        if (index == size) {
            Capacity();
        }
        if (value == null) {
            size = size - 1;
        }
        indexOutOfBoundsException(index);
        array[index] = value;
        size++;
    }

    private void Capacity() {
        if (size == array.length) {
            Object[] newArray = new Object[(int) (size * 1.5)];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    public void indexOutOfBoundsException(int index) {
        if (array.length < index) {
            throw new IndexOutOfBoundsException("Error! Array most index!");
        }
    }

    @Override
    public Object remove(int index) {
        Object result = array[index];
        size--;
        indexOutOfBoundsException(index);
        for (int i = 0; i < size(); i++) {
            array[index] = array[index + 1];
            index++;
        }

        return result;
    }

    @Override
    public Object get(int index) {
        indexOutOfBoundsException(index);
        return array[index];
    }

    @Override
    public Object set(Object value, int index) {
        indexOutOfBoundsException(index);
        return array[index] = value;
    }

    @Override
    public void clear() {
        array = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        array = null;
        size = 0;
        return true;
    }

    @Override
    public boolean contains(Object value) {
        return false;
    }

    @Override
    public int indexOf(Object value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object value) {
        for (int i = size; i >= 0; i--) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < size; i++) {
            stringJoiner.add(array[i].toString());
        }
        return stringJoiner.toString();
    }
}