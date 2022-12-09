package com.udemy.collectors;

import java.util.List;
import java.util.Map;

public class PersonUtil {

    /**
     * Método que recibe un listado de personas y se eliminan del listado los que tengan en su nombre espacios en blanco.
     * @param original es el listado de personas original.
     */
    public void removeNamesWithSpaces(List<Person> original) {
    }

    /**
     * Método que recibe un listado de personas y convierte cada uno de sus valores de minísculas a mayúsculas.
     * - Tener en cuenta el Optional para el segundo apellido.
     * @param original es el listado de personas original.
     */
    public void convertValuesToUppercase(List<Person> original) {
    }

    /**
     * Método que recibe un map de facturas para retornar un string concatenado con un formato específico.
     * Ejem:
     *   {"prodA" : 4, "prodB" : 5} -> "prod1:4,prod2:5,"
     * @param invoices
     */
    public String convertMapToString(Map<String, Integer> invoices) {
        return "";
    }
}
