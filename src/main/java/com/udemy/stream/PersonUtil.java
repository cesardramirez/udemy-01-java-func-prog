package com.udemy.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class PersonUtil {

    // Los métodos posteriores deben construir streams a partir de la siguiente lista:
    private List<Person> people = new ArrayList<>();

    public PersonUtil() {
        people.add(new Person("Antonia", "Garcia", Optional.of("Sastre")));
        people.add(new Person("John", "Smith", Optional.empty()));
        people.add(new Person("Pedro", "Llull", Optional.of("Mir")));
    }

    /**
     * @return stream de las personas que no tienen segundo apellido.
     */
    public Stream<Person> peopleWithoutSecondLastName() {
        return null;
    }

    /**
     * @return stream con los nombres de las personas.
     */
    public Stream<String> peopleWithTheirNames() {
        return null;
    }

    /**
     * @return stream por el apellido ordenado asc, no se tiene en cuenta mayúsculas ni minúsculas.
     */
    public Stream<String> peopleWithTheirFirstLastNameSorted() {
        return null;
    }
}
