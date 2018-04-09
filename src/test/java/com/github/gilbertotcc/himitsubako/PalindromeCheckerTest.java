package com.github.gilbertotcc.himitsubako;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class PalindromeCheckerTest {

    private static final long PALINDROMIC_NUMBER = 121L;
    private static final long NOT_PALINDROMIC_NUMBER = 123L;
    private static final List<Long> LIST_OF_NUMBERS = asList(1L, 2L, 10L, 11L, 12L, 22L);

    @Test
    public void testIsPalindromicNumberWithPalindromicNumber() {
        final boolean palindrome = PalindromeChecker.isPalindromicNumber(PALINDROMIC_NUMBER);
        assertTrue(palindrome);
    }

    @Test
    public void testIsPalindromicNumberWithNotPalidromicNumber() {
        final boolean palindrome = PalindromeChecker.isPalindromicNumber(NOT_PALINDROMIC_NUMBER);
        assertFalse(palindrome);
    }

    @Test
    public void testPalindromicNumbersIn() {
        final List<Long> palindromicNumbers = PalindromeChecker.palindromicNumbersIn(LIST_OF_NUMBERS);
        assertEquals(asList(1L, 2L, 11L, 22L), palindromicNumbers);
    }
}