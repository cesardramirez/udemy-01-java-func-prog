package com.udemy.lambdaexpressions;

@FunctionalInterface
public interface Operator {

    /**
     * Método que realiza la operación de dos números.
     * @param a integer.
     * @param b integer.
     * @return operation result.
     */
    int operate(int a, int b);
}
