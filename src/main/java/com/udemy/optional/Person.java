package com.udemy.optional;

import java.util.Optional;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Método con posibilidad de un NPE en el objeto person o en el campo firstName.
     *
     * @param person object.
     * @return el saludo "Hola César" si hay valores.
     */
    static String greetingOne(Person person) {
        return "Hola " + person.getFirstName();
    }

    /**
     * Método que valida manualmente el NPE en el objeto person pero no valida el NPE del campo firstName.
     *
     * @param person object.
     * @return el saludo "Hola César" si hay valores.
     */
    static String greetingTwo(Person person) {
        if (person == null) {
            return "Estoy solo";
        }
        return "Hola " + person.getFirstName();
    }

    /**
     * El método get() accede al valor, previamente validado por isPresent().
     *
     * @param person object.
     * @return el saludo "Hola César" si hay valores.
     */
    static String greetingThree(Optional<Person> person) {
        if (person.isPresent()) {
            return "Hola " + person.get().getFirstName();
        } else {
            return "Estoy solo";
        }
    }

    /**
     * El método map() ejecuta una función sobre el valor de un Optional si el valor está presente,
     * sino está presente, ejecuta lo mencionado en el método orElse().
     *
     * @param person object.
     * @return el saludo "Hola César" si hay valores.
     */
    static String greetingFour(Optional<Person> person) {
        return person.map(value -> "Hola " + value.getFirstName())
                .orElse("Estoy solo");
    }

    /**
     * En el primer map() valida también que el nombre de la persona no sea nulo.
     * @param person object.
     * @return el saludo "Hola César" si hay valores.
     */
    static String greetingFive(Optional<Person> person) {
        return person.map(Person::getFirstName)
                .map("Hola "::concat)
                .orElse("Estoy solo");
    }
}
