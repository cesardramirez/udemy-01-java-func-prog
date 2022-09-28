package com.udemy.jdkfunctionalinterfaces;

import org.junit.Test;

import java.util.function.*;

import static org.junit.Assert.*;

public class FunctionalInterfaces04Test {

    @Test
    public void shouldReturnSquareValue_whenGiveAnInteger() {
        IntUnaryOperator square = num -> num * num;  // Dado un entero, retorna su valor al cuadrado.

        assertEquals(0, square.applyAsInt(0));
        assertEquals(1, square.applyAsInt(1));
        assertEquals(4, square.applyAsInt(2));
        assertEquals(9, square.applyAsInt(3));
    }

    @Test
    public void shouldReturnSmallestValue_whenGiveTwoLongNumbers() {
        LongBinaryOperator smaller = (a, b) -> a < b ? a : b;  // Dado dos números, retorne el de menor valor.
        // (a, b) -> a < b ? a : b
        // (a, b) -> Math.min(a, b)
        // Math::min

        assertEquals(-2, smaller.applyAsLong(-2, 3));
        assertEquals(5, smaller.applyAsLong(10, 5));
    }

    /*
     * Se utiliza de forma genérica Function, pero puede ser cualquier interfaz funcional del JDK.
     */
    @Test
    public void test_person() {
        Person personWithoutSecondSurname = new Person("David", "Perdomo", null);
        Person personWithSecondSurname = new Person("Andrea", "Perdomo", "Salgado");
        Person unknownPerson = new Person("Albert", "Einstein", null);

        // Validar si la persona no tiene segundo apellido.
        Predicate<Person> secondSurnameIsNullValidator = person -> person.getSecondSurname() == null;

        assertTrue(secondSurnameIsNullValidator.test(personWithoutSecondSurname));
        assertFalse(secondSurnameIsNullValidator.test(personWithSecondSurname));

        // Validar si 2 personas son parientes (tienen el mismo apellido).
        BiPredicate<Person, Person> areRelativesValidator = (person, person2) -> person.getSurname().equals(person2.getSurname());

        assertTrue(areRelativesValidator.test(personWithoutSecondSurname, personWithSecondSurname));
        assertFalse(areRelativesValidator.test(personWithoutSecondSurname, unknownPerson));

        // Consumir (de cualquier forma) los datos de una persona.
        Consumer<Person> mask = person -> {
            String tmp = person.getSurname();
            person.setSurname(person.getSecondSurname());
            person.setSecondSurname(person.getName());
            person.setName(tmp);
        };

        mask.accept(personWithSecondSurname);

        assertEquals("Perdomo", personWithSecondSurname.getName());
        assertEquals("Salgado", personWithSecondSurname.getSurname());
        assertEquals("Andrea", personWithSecondSurname.getSecondSurname());
    }

    @Test
    public void test_validator() {
        Validator<Person> validator = new Validator<Person>();

        // Se envía como parámetro un predicado que valide si la persona tiene un primer apellido.
        validator.add(person -> person.getSurname() != null);

        assertTrue(validator.validate(new Person("Carlos","Caicedo","Burgos")));
        assertFalse(validator.validate(new Person("Johana",null,"Barrios")));
    }
}
