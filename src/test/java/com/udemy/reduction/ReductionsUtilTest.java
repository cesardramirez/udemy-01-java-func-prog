package com.udemy.reduction;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ReductionsUtilTest {

    private final ReductionsUtil reductionsUtil = new ReductionsUtil();

    @Test
    public void test_firstFunction() {
        List<String> original = Arrays.asList("first", null, "second");

        Collection<String> result = reductionsUtil.getCollectionOfValuesWithUppercase(original);

        assertEquals(2, result.size());
        assertTrue(result.contains("FIRST"));
        assertTrue(result.contains("SECOND"));
    }

    @Test
    public void test_secondFunction() {
        List<Integer> numbers = Arrays.asList(2, 3, 1, 5);

        int[] result = reductionsUtil.getPairAndOddNumbersFromAList(numbers);

        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
    }
}
