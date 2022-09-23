package com.udemy.lambdaexpressions;

/*
 * Implementar los métodos para que devuelvan una expresión lambda.
 */
public class LambdaFactory {

    /*
     * Esta implementación debe tener la estructura:
     *   return lambda_expression;
     * lambda_expression es una una implementación del método:
     *   int value() que siempre devuelve el valor 5.
     */
    public Constant returnFive() {
        return () -> 5;
    }

    /*
     * lambda_expression es una implementación del método:
     *   int operate(int a, int b) que realiza la suma de dos enteros.
     */
    public Operator getSum() {
        return (a, b) -> a + b;
        //return Integer::sum;
    }

    /*
     * lambda_expression es una implementación del método:
     *   void initialize(String[] array, String value) que devuelve el inicializador de un array de strings.
     *     Recibe el array ya creado y define un valor por defecto para todas las posiciones.
     */
    public ArrayInitializer getInitializer() {
        return (array, valor) -> {
            for (int i = 0; i < array.length; i++) {
                array[i] = valor;
            }
        };
        //return Arrays::fill;
    }
}
