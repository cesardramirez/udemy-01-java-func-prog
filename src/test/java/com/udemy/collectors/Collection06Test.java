package com.udemy.collectors;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Collection06Test {

    private final StudentUtil studentUtil = new StudentUtil();
    private final PersonUtil personUtil = new PersonUtil();
    List<Student> students = new ArrayList<>();
    List<Person> people = new LinkedList<>();

    @Before
    public void setUp() {
        students = Arrays.asList(
                new Student("David", "ITC", 16),
                new Student("Carolina", "Carmen Teresiano", 17),
                new Student("Cristian", "FITS", 18),
                new Student("Santiago", "FITS", 17));

        people.add(new Person("Luisa de", "Pico", Optional.of("Ducuara")));
        people.add(new Person("Brayam", "Castrillon", Optional.empty()));
        people.add(new Person("Sandra", "Rojas", null));
    }

    @Test
    public void test_firstFunction() {
        Map<String, List<Student>> bySchool = studentUtil.studentsBySchool(students);

        assertEquals(2, bySchool.get("FITS").size());
        assertEquals("Cristian", bySchool.get("FITS").get(0).getName());
        assertEquals("Santiago", bySchool.get("FITS").get(1).getName());
    }

    @Test
    public void test_secondFunction() {
        double middleAge = studentUtil.studentsMiddleAge(students);

        assertEquals(17, middleAge, 0.0);
    }

    @Test
    public void test_thirdFunction() {
        Map<String, Double> avgAgeBySchool = studentUtil.studentsAverageAgeBySchool(students);

        assertEquals(17, avgAgeBySchool.get("FITS"), 0.5);
        assertEquals(16, avgAgeBySchool.get("ITC"), 0.0);
    }

    @Test
    public void test_fourthFunction() {
        personUtil.removeNamesWithSpaces(people);

        assertEquals(1, people.size());
        assertEquals("Brayam", people.get(0).getName());
    }

    @Test
    public void test_fifthFunction() {
        personUtil.convertValuesToUppercase(people);

        assertEquals(2, people.size());
        assertEquals("LUISA DE", people.get(0).getName());
        assertEquals("BRAYAM", people.get(1).getName());
        assertEquals("ROJAS", people.get(2).getSurname());
        assertFalse(people.get(1).getSecondSurname().isPresent());
    }

    @Test
    public void test_sixthFunction() {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("prodA", 4);
        map.put("prodB", 5);

        String result = personUtil.convertMapToString(map);

        assertEquals("prodA:4,prodB:5,", result);
    }
}
