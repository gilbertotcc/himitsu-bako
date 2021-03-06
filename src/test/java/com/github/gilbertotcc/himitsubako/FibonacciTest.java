package com.github.gilbertotcc.himitsubako;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * Fibonacci Definition:
 * fibonacci(0) = 0
 * fibonacci(1) = 1
 * fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
 */
public class FibonacciTest {

    private final int A_BIG_NUMBER = 21356;

    @Test
    public void calculateFibonacciOfZero() {
        int fibonacci0 = Fibonacci.fibonacciOf(0);
        assertEquals(0, fibonacci0);
    }

    @Test
    public void calculateFibonacciOfOne() {
        int fibonacci1 = Fibonacci.fibonacciOf(1);
        assertEquals(1, fibonacci1);
    }

    @Test
    public void calculateFibonacciOfFive() {
        int fibonacci5 = Fibonacci.fibonacciOf(5);
        assertEquals(5, fibonacci5);
    }

    @Test
    public void calculateFibonacciOfABigNumber() {
        int fibonacciBig = Fibonacci.fibonacciOf(A_BIG_NUMBER);
        assertEquals(1078193757, fibonacciBig);
    }
}
