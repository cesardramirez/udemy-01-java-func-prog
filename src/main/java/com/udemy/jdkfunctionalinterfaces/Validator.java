package com.udemy.jdkfunctionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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

    // Se define el tipo de la lista como Predicate ya que este guardará el resultado boleano de una condición.
    // Se coloca una T porque el dominio de la función puede ser cualquier cosa.
    List<Predicate<T>> validators = new ArrayList<>();

    public boolean validate(T value) {  // T: Dominio de una función.
        for (Predicate<T> validator : validators) {
            if(!validator.test(value)) {  // Método test() de la Interfaz Funcional Predicate.
                return false;  // Apenas encuentre una validación que no cumple, retorna false y se sale del ciclo.
            }
        }
        return true;  // Retorna true si pasa todas las validaciones.
    }

    public void add(Predicate<T> validator) {
        validators.add(validator);
    }
}
