package com.udemy.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator01 {

    public Comparator01() {
        List<String> names = Arrays.asList("Juan", "Antonia", "Pedro");

        Comparator<String> lengthComparator = (o1, o2) -> o1.length() - o2.length();
        // Comparator<String> lengthComparator = Comparator.comparingInt(String::length);

        Collections.sort(names, lengthComparator);
        // names.sort(lengthComparator);

        System.out.println(names);
    }
}
