package com.udemy.defaultmethod;

import java.util.ArrayList;
import java.util.List;

public class ListGrouper implements Grouper {

    private List<Object> content = new ArrayList<>();

    @Override
    public void add(Object element) {
        content.add(element);
    }

    @Override
    public int numberElements() {
        return content.size();
    }
}
