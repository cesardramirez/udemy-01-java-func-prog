package com.udemy.defaultmethod;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Grouper02Test {

    /*
     * Completar la definición de la clase ListGrouper para que implemente la interface.
     * Nota: Este test no utiliza los default methods.
     */
    @Test
    public void shouldAddElementList() {
        Grouper grouper = new ListGrouper();

        assertEquals(0, grouper.numberElements());

        grouper.add("primero");

        assertEquals(1, grouper.numberElements());
    }

    /*
     * Definir un método llamado default addAll que acepte un Collection y añada cada objeto al agrupador.
     * Nota: Test que utiliza los default methods.
     */
    @Test
    public void shouldAddAllElementList() {
        Grouper grouper = new ListGrouper();

        grouper.addAll(Arrays.asList("primero", "segundo"));

        assertEquals(2, grouper.numberElements());
    }
}
