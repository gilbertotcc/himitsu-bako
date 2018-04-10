package com.github.gilbertotcc.himitsubako;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.Test;

public class EvenAndOddNumbersTest {

    private static final List<Integer> NUMBERS = asList(1, 2, 3, 4, 5, 6, 7);

    @Test
    public void evenAndOddNumbersOfNumberListShouldReturnTheProperResult() {
        final Map<String, List<Integer>> result = EvenAndOddNumbers.evenAndOddNumbers(NUMBERS);

        final List<Integer> expectedOddNumbers = asList(1, 3, 5, 7);
        final List<Integer> oddNumbers = result.get("odd");
        assertEquals(expectedOddNumbers, oddNumbers);

        final List<Integer> expectedEvenNumbers = asList(2, 4, 6);
        final List<Integer> evenNumbers = result.get("even");
        assertEquals(expectedEvenNumbers, evenNumbers);
    }
}
