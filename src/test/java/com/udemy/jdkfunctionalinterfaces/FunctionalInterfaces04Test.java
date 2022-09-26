package com.udemy.jdkfunctionalinterfaces;

import org.junit.Test;

import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;

import static org.junit.Assert.*;

public class FunctionalInterfaces04Test {

    @Test
    public void shouldReturnSquareValue_whenGiveAnInteger() {
        // TODO : Construir lambda. Dado un entero, retorne su valor cuadrado.
        IntUnaryOperator square = null;

        assertEquals(0, square.applyAsInt(0));
        assertEquals(1, square.applyAsInt(1));
        assertEquals(4, square.applyAsInt(2));
        assertEquals(9, square.applyAsInt(3));
    }

    @Test
    public void shouldReturnSmallestValue_whenGiveTwoLongNumbers() {
        // TODO : Construir lambda. Dado dos números, retorne el de menor valor.
        LongBinaryOperator smaller = null;

        assertEquals(-2, smaller.applyAsLong(-2, 3));
        assertEquals(5, smaller.applyAsLong(10, 5));
    }

    /*
     * TODO:
     *  - Implementar la declaración de la interfaz funcional.
     *  - Construir el lambda.
     *  - Construir pruebas unitarias.
     * Se utiliza de forma genérica Function, pero puede ser cualquier interfaz funcional del JDK.
     *
     */
    @Test
    public void test_person() {
        Person personWithoutSecondSurname = new Person("David", "Perdomo", null);
        Person personWithSecondSurname = new Person("Andrea", "Reyes", "Salgado");
        Person unknownPerson = new Person("Albert", "Einstein", null);

        // TODO : Construir lambda y 2 assert. Validar si la persona no tiene segundo apellido.

        // TODO : Construir lambda y 2 assert. Validar si 2 personas son parientes (tienen el mismo apellido).

        // TODO : Construir lambda y 3 assert. Consumir los datos de una persona.
    }

    @Test
    public void test_validator() {
        Validator<Person> validator = new Validator<Person>();

        // TODO : Enviar como parámetro un predicado que valide si la persona tiene un primer apellido.
        validator.add(/**/);

        assertTrue(validator.validate(new Person("Carlos","Caicedo","Burgos")));
        assertFalse(validator.validate(new Person("Johana",null,"Barrios")));
    }
}
