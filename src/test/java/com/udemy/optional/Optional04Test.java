package com.udemy.optional;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class Optional04Test {

    @Test
    public void test_AllPossibleOptionsOptional() {
        Person juan = new Person("Juan", "Salgado");
        Person david = new Person("David", "Reyes");

        Optional<Person> personJ = Optional.of(juan);  // El valor de juan no puede ser null.
        Optional<Person> personE = Optional.empty();  // El Optional no va a tener ningún valor.
        Optional<Person> personD = Optional.ofNullable(david);  // El valor de david puede ser null.

        assertTrue(personJ.isPresent());
        assertFalse(personE.isPresent());
        assertTrue(personD.isPresent());
    }

    @Test
    public void test_AllFunctionsOptional() {
        Person person = new Person("Cesar", "Ramirez");
        PersonOptional personOptional = new PersonOptional(Optional.of("Andrea"));

        assertEquals("Hola Cesar", Person.greetingOne(person));
        assertEquals("Hola Cesar", Person.greetingTwo(person));
        assertEquals("Hola Cesar", Person.greetingThree(Optional.of(person)));
        assertEquals("Hola Cesar", Person.greetingFour(Optional.of(person)));
        assertEquals("Hola Cesar", Person.greetingFive(Optional.of(person)));
        assertEquals("Hola Andrea", PersonOptional.greetingSix(Optional.of(personOptional)));
        assertEquals("Andrea", personOptional.getName().get());
    }
}