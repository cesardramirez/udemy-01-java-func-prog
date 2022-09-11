package com.udemy.defaultmethod;

public class ArrayGrouper implements Grouper {

    private Object[] content = new Object[20];
    private int index = 0;

    @Override
    public void add(Object element) {
        content[index++] = element;
    }

    @Override
    public int numberElements() {
        return index;
    }
}
