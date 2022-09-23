package com.udemy.lambdaexpressions;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Lambas03Test {

    private LambdaFactory lambdaFactory = new LambdaFactory();

    @Test
    public void returnNumberFive_whenCallTheMethod() {
        assertEquals(5, lambdaFactory.returnFive().value());
    }

    @Test
    public void returnSum_whenOperateTwoNumbers() {
        assertEquals(7, lambdaFactory.getSum().operate(4, 3));
    }

    @Test
    public void returnArray_whenCallInitializer() {
        String[] array = new String[4];

        lambdaFactory.getInitializer().initialize(array, "A");

        assertArrayEquals(array, new String[]{"A", "A", "A", "A"});
    }
}
