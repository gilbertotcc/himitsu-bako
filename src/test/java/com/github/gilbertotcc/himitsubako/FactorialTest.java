package com.github.gilbertotcc.himitsubako;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class FactorialTest {

    private final List<Long> LIST_OF_NUMBERS = asList(0L, 1L, 2L, 3L, 4L, 5L);
    private final long A_BIG_NUMBER = 1000L;

    @Test
    public void calculateFactorialOfZero() {
        long factorial = Factorial.factorialOf(0);
        assertEquals(1, factorial);
    }

    @Test
    public void calculateFactorialOfOne() {
        long factorial = Factorial.factorialOf(1);
        assertEquals(1, factorial);
    }

    @Test
    public void calculateFactorialOfFive() {
        long factorial = Factorial.factorialOf(5);
        assertEquals(120, factorial);
    }

    @Test
    public void calculateFactorialOfList() {
        List<Long> factorials = Factorial.factorialOf(LIST_OF_NUMBERS);
        assertEquals(asList(1L, 1L, 2L, 6L, 24L, 120L), factorials);
    }

    @Test
    public void calculateFactorialOfABigNumber() {
        long factorial = Factorial.factorialOf(A_BIG_NUMBER);
        assertEquals(1, factorial);
    }
}
