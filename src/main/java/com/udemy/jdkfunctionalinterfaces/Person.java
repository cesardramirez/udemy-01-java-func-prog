package com.udemy.jdkfunctionalinterfaces;

public class Person {
    private String name;
    private String surname;
    private String secondSurname;

    public Person(String name, String surname, String secondSurname) {
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

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", secondSurname='" + secondSurname + '\'' +
                '}';
    }
}
