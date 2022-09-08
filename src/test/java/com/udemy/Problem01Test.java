package com.udemy;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Problem01Test {

    @Test
    public void shouldReturnOrderHighestToLowest() {
        List<String> names = Arrays.asList("Juan", "Antonia", "Pedro");

        /*
          Asignar en la variable lengthComparator un comparador que ordene los strings
          según la longitud de MAYOR a MENOR (contrario a lo planteado en el problema original).
         */
        Comparator<String> lengthComparator = (o1, o2) -> o2.length() - o1.length();

        assertNotNull("No has creado aun el comparador", lengthComparator);

        names.sort(lengthComparator);

        assertEquals("El primer elemento deberia ser Antonia", "Antonia", names.get(0));
        assertEquals("El segundo elemnento deberia ser Pedro", "Pedro", names.get(1));
        assertEquals("El tercer elemento debeia ser Juan", "Juan", names.get(2));
    }
}
