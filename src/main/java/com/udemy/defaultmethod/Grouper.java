package com.udemy.defaultmethod;

import java.util.Collection;

public interface Grouper {

    void add(Object element);

    int numberElements();

    /**
     * Default method.
     * No es necesaria su implementación en las clases que la usan.
     * @param collection
     */
    default void addAll(Collection collection) {
        for (Object obj : collection) {
            add(obj);
        }
    }
}
