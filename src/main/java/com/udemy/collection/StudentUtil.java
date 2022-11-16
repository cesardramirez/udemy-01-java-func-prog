package com.udemy.collection;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentUtil {

    public Map<String, List<Student>> studentsBySchool(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getSchool));
    }

    public double studentsMiddleAge(List<Student> students) {
        return students.stream()
                .collect(Collectors.averagingInt(Student::getAge));
    }

    public Map<String, Double> studentsAverageAgeBySchool(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(
                        Student::getSchool,
                        Collectors.averagingInt(Student::getAge)
                ));
    }
}
