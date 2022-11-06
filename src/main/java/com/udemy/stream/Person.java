package com.udemy.stream;

import java.util.Optional;

public class Person {

    private String firstName;
    private String firstLastName;
    private Optional<String> secondLastName;

    public Person(String firstName, String firstLastName, Optional<String> secondLastName) {
        this.firstName = firstName;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public Optional<String> getSecondLastName() {
        return secondLastName;
    }

    @Override
    public String toString() {
        return firstName + "," + firstLastName + " " + secondLastName.orElse("");
    }
}
