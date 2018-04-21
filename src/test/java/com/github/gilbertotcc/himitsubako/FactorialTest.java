package com.github.gilbertotcc.himitsubako;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import java.math.BigInteger;
import java.util.List;

import org.junit.Test;

public class FactorialTest {

    private final List<Integer> LIST_OF_NUMBERS = asList(0, 1, 2, 3, 4, 5);
    private final int A_BIG_NUMBER = 1000;

    @Test
    public void calculateFactorialOfZero() {
        BigInteger factorial = Factorial.factorialOf(0);
        assertEquals(BigInteger.ONE, factorial);
    }

    @Test
    public void calculateFactorialOfOne() {
        BigInteger factorial = Factorial.factorialOf(1);
        assertEquals(BigInteger.ONE, factorial);
    }

    @Test
    public void calculateFactorialOfFive() {
        BigInteger factorial = Factorial.factorialOf(5);
        assertEquals(BigInteger.valueOf(120), factorial);
    }

    @Test
    public void calculateFactorialOfList() {
        List<BigInteger> factorials = Factorial.factorialOf(LIST_OF_NUMBERS);
        assertEquals(
                asList(
                        BigInteger.valueOf(1),
                        BigInteger.valueOf(1),
                        BigInteger.valueOf(2),
                        BigInteger.valueOf(6),
                        BigInteger.valueOf(24),
                        BigInteger.valueOf(120)),
                factorials);
    }

    @Test
    public void calculateFactorialOfABigNumber() {
        BigInteger factorial = Factorial.factorialOf(A_BIG_NUMBER);
        assertEquals(BigInteger.ONE, factorial);
    }
}
