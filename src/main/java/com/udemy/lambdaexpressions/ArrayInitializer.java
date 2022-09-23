package com.udemy.lambdaexpressions;

@FunctionalInterface
public interface ArrayInitializer {

    /**
     * Método que inicializa un array de strings.
     * @param array (debe estar ya creado).
     * @param value valor por defecto a inicializar.
     */
    void initialize(String[] array, String value);
}
