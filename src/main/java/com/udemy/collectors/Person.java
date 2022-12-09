package com.udemy.collectors;

import java.util.Optional;

public class Person {

    private String name;
    private String surname;
    private Optional<String> secondSurname;

    public Person(String name, String surname, Optional<String> secondSurname) {
        this.name = name;
        this.surname = surname;
        this.secondSurname = secondSurname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Optional<String> getSecondSurname() {
        return secondSurname;
    }

    @Override
    public String toString() {
        return name + ", " + surname + ", " + secondSurname.orElse("");
    }
}
