package com.udemy.stream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class Stream05Test {

    private PersonUtil personUtil;

    @Before
    public void setUp() {
        personUtil = new PersonUtil();
    }

    @Test
    public void test_firstFunction() {
        List<Person> result = personUtil.peopleWithoutSecondLastName().collect(Collectors.toList());

        assertEquals(1, result.size());
        assertEquals("John", result.get(0).getFirstName());
    }

    @Test
    public void test_secondFunction() {
        List<String> result = personUtil.peopleWithTheirNames().collect(Collectors.toList());

        assertEquals(3, result.size());
        assertEquals("Antonia", result.get(0));
        assertEquals("John", result.get(1));
        assertEquals("Pedro", result.get(2));
    }

    @Test
    public void test_thirdFunction() {
        List<String> result = personUtil.peopleWithTheirFirstLastNameSorted().collect(Collectors.toList());

        assertEquals(3, result.size());
        assertEquals("Garcia", result.get(0));
        assertEquals("Llull", result.get(1));
        assertEquals("Smith", result.get(2));
    }
}
