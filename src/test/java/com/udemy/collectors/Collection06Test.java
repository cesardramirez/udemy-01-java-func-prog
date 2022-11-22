package com.udemy.collectors;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Collection06Test {

    private final StudentUtil studentUtil = new StudentUtil();
    List<Student> students = new ArrayList<>();

    @Before
    public void setUp() {
        students = Arrays.asList(
                new Student("David", "ITC", 16),
                new Student("Carolina", "Carmen Teresiano", 17),
                new Student("Cristian", "FITS", 18),
                new Student("Santiago", "FITS", 17));
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
}
