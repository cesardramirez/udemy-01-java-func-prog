package com.udemy.parallelstream;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ParallelStream07Test {

    private NumberUtil numberUtil;
    private List<Integer> numbers;

    @Before
    public void setUp() {
        numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numberUtil = new NumberUtil(numbers);
    }

    @Test
    public void testMethod_Sum() {
        Integer sum1 = numberUtil.sumStream();
        Integer sum2 = numberUtil.sumParallelStream();
        assertEquals(55, sum1.intValue());
        assertEquals(55, sum2.intValue());
    }

    @Test
    public void testMethod_sumPrint() {
        Integer sum1 = numberUtil.sumStreamPrint();
        Integer sum2 = numberUtil.sumParallelStream();
        assertEquals(55, sum1.intValue());
        assertEquals(55, sum2.intValue());
    }

    @Test
    public void testMethod_stringResult() {
        StringBuilder sb = new StringBuilder();
        numbers.forEach(str -> sb.append(str).append("\t"));

        String result1 = numberUtil.stringStreamResult();
        String result2 = numberUtil.stringParallelStreamResult();

        assertEquals(sb.toString().trim(), result1);
        assertEquals(sb.toString().trim(), result2);  // Se da la coincidencia de que no cambia el orden.
    }
}
