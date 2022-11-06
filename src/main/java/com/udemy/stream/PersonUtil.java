package com.udemy.stream;

import java.util.ArrayList;
import java.util.Comparator;
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
        return people.stream()
                .filter(it -> !it.getSecondLastName().isPresent());
    }

    /**
     * @return stream con los nombres de las personas.
     */
    public Stream<String> peopleWithTheirNames() {
        return people.stream()
                .map(Person::getFirstName);
    }

    /**
     * @return stream por el apellido ordenado asc, no se tiene en cuenta mayúsculas ni minúsculas.
     */
    public Stream<String> peopleWithTheirFirstLastNameSorted() {
        return people.stream()
                .map(Person::getFirstLastName)
                .sorted(String::compareToIgnoreCase);  // (p1, p2) -> p1.compareToIgnoreCase(p2)
    }

    /**
     * @return string con los nombres de las personas ordenados por tamaño de menor a mayor.
     */
    public String peopleConcatenateTheirNames() {
        return people.stream()
                .map(Person::getFirstName)
                .sorted(Comparator.comparingInt(String::length))  // (p1, p2) -> p1.length() - p2.length()
                .map(it -> "'" + it + "'")
                .reduce("", (a, b) -> a + "\t" + b);
    }
}
