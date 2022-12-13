package com.udemy.comparator;

import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Comparator09Test {

    List<Person> people = new LinkedList<>();

    @Before
    public void setUp() {
        people.add(new Person("Ramirez", 33));
        people.add(new Person("Rojas", 28));
        people.add(new Person("Cediel", 35));
        people.add(new Person("Avellaneda", 18));
        people.add(new Person("Aranguren", 30));
    }

    @Test
    public void returnListOrderedByAgeMinorToMajor() {
        people.sort(Person.byAge());

        assertEquals("Avellaneda", people.get(0).getSurname());
        assertEquals("Cediel", people.get(4).getSurname());
    }

    @Test
    public void returnListOrderedByAgeMajorToMinor() {
        people.sort(Person.byAge().reversed());

        assertEquals("Cediel", people.get(0).getSurname());
        assertEquals("Rojas", people.get(3).getSurname());
    }

    @Test
    public void returnListOrderedBySurnameMinorToMajor() {
        people.sort(Person.bySurname());

        assertEquals("Aranguren", people.get(0).getSurname());
        assertEquals("Rojas", people.get(4).getSurname());
    }

    @Test
    public void returnListOrderedByAgeAndSurnameMinorToMajor() {
        people.sort(Person.byAge().thenComparing(Person.bySurname()));

        assertEquals("Avellaneda", people.get(0).getSurname());
        assertEquals("Cediel", people.get(4).getSurname());
    }

    @Test
    public void returnListOrderedByAgeAndSurnameMinorToMajorNullsLast() {
        List<Person> peopleWithNull = listWithNullValues();
        peopleWithNull.sort(Comparator.nullsLast(Person.byAge().thenComparing(Person.bySurname())));

        assertEquals("Cediel", peopleWithNull.get(4).getSurname());
        assertNull(peopleWithNull.get(5));
        assertNull(peopleWithNull.get(6));
    }

    private List<Person> listWithNullValues() {
        List<Person> people = new LinkedList<>();

        people.add(new Person("Ramirez", 33));
        people.add(new Person("Rojas", 28));
        people.add(null);
        people.add(new Person("Cediel", 35));
        people.add(new Person("Avellaneda", 18));
        people.add(null);
        people.add(new Person("Aranguren", 30));

        return people;
    }
}
