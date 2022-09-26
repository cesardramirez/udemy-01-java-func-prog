package com.udemy.jdkfunctionalinterfaces;

import java.util.ArrayList;
import java.util.List;

/*
 * La clase Validator es determinar qué objetos del tipo T cumplen determinados requisitos.
 *   Los requisitos son dinámicos (se pueden configurar durante la ejecución).
 *     No se tiene una comparación fija, sino será una lista de validadores individuales (validators).
 *   También:
 *     - Implementar el método add() que acepta un nuevo validador individual y se agrega a la lista de validadores.
 *     - Implementar el método validate() que devolverá true si el objeto que recibe como parámetro cumple con todos los validadores de la lista,
 *         sino los cumple, devolverá un false.
 */

/**
 * Clase Validator que determina qué objetos de tipo T cumplen determinadas validaciones.
 * @param <T>
 */
public class Validator<T> {

    // TODO : Definir el tipo de la List.
    List validators = new ArrayList<>();

    public boolean validate(Object value) {  // TODO : Cambiar Object a un tipo más adecuado.
        return true;  // TODO : Retorna true si pasa todas las validaciones, sino false.
    }

    // TODO : Implementar método para agregar nuevas validaciones.
    public void add() {

    }
}
