package com.udemy.collectors;

public class Student {

    private final String name;
    private final String school;
    private final int age;

    public Student(String name, String school, int age) {
        this.name = name;
        this.school = school;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    public int getAge() {
        return age;
    }
}
