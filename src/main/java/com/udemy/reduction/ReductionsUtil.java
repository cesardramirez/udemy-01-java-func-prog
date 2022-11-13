package com.udemy.reduction;

import java.util.Collection;
import java.util.List;

/**
 * Utilizar streams con operaciones intermedias y una operación terminal (final) con una estructura mutable.
 */
public class ReductionsUtil {

    /**
     * Método que recibe una lista de strings y retorna un string nuevo con las siguientes condiciones:
     * - Se eliminan los valores nulos.
     * - Los valores actuales se pasan en mayúsculas.
     * Ejem:
     *   {"a", null, "b", null} -> {"A", "B"}
     *
     * @param original es el listado de strings original.
     * @return una colección de strings con el resultado final.
     */
    public Collection<String> getCollectionOfValuesWithUppercase(List<String> original) {
        return null;
    }

    /**
     * Método que recibe una lista de números y retorna una lista donde:
     *   La posición 0 indica la cantidad de números pares encontrados.
     *   La posición 1 indica la cantidad de nímeros impares encontrados.
     * Ejem:
     *   {0, 1, 2, 4} -> [3, 1]
     *
     * @param numbers es el listado de números original.
     * @return una lista de números con el resultado final.
     */
    public int[] getPairAndOddNumbersFromAList(List<Integer> numbers) {
        int[] count = {0, 0};

        return null;
    }
}
