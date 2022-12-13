package com.udemy.comparator;

import java.util.Comparator;

public class Person {

    private final String surname;
    private final int age;

    public Person(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    static Comparator<Person> byAge() {
        return Comparator.comparingInt(Person::getAge);
    }

    static Comparator<Person> bySurname() {
        return Comparator.comparing(Person::getSurname);
    }
}
