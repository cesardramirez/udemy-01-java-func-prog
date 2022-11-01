package com.udemy.optional;

import java.util.Optional;

public class PersonOptional {
    private Optional<String> name;

    public PersonOptional(Optional<String> name) {
        this.name = name;
    }

    Optional<String> getName() {
        return name;
    }

    /**
     * Para evitar un Optional<Optional<String>> se utiliza el método flatMap(),
     *   unifica todos los posibles resultados para desvolver un único Optional<>.
     * @param person object.
     * @return el saludo "Hola César" si hay valores.
     */
    static String greetingSix(Optional<PersonOptional> person) {
        return person.flatMap(PersonOptional::getName)
                .map("Hola "::concat)
                .orElse("Estoy solo");
    }
}
