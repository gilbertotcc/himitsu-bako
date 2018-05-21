package com.github.gilbertotcc.himitsubako;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import com.github.gilbertotcc.himitsubako.util.Constants;
import org.junit.Test;

public class PalindromicStringsTest {

    private static final List<String> SEQUENCES = Arrays.asList(
            "Anna",
            "Rise to vote, sir!",
            "Never odd or even",
            "Never odd and even",
            "Was it a car or a cat I saw?",
            "Was it a car or a dog I saw?",
            "Doc, note: I dissent. A fast never prevents a fatness. I diet on cod.",
            Constants.VERY_LONG_PALINDROME
    );

    @Test
    public void stringAtIndex0ShouldBePalindrome() {
        assertTrue(PalindromicStrings.isPalindrome(SEQUENCES.get(0)));
    }

    @Test
    public void stringAtIndex1ShouldBePalindrome() {
        assertTrue(PalindromicStrings.isPalindrome(SEQUENCES.get(1)));
    }

    @Test
    public void stringAtIndex2ShouldBePalindrome() {
        assertTrue(PalindromicStrings.isPalindrome(SEQUENCES.get(2)));
    }

    @Test
    public void stringAtIndex3ShouldNotBePalindrome() {
        assertFalse(PalindromicStrings.isPalindrome(SEQUENCES.get(3)));
    }

    @Test
    public void stringAtIndex4ShouldBePalindrome() {
        assertTrue(PalindromicStrings.isPalindrome(SEQUENCES.get(4)));
    }

    @Test
    public void stringAtIndex5ShouldNotBePalindrome() {
        assertFalse(PalindromicStrings.isPalindrome(SEQUENCES.get(5)));
    }

    @Test
    public void stringAtIndex6ShouldBePalindrome() {
        assertTrue(PalindromicStrings.isPalindrome(SEQUENCES.get(6)));
    }

    @Test
    public void stringAtIndex7ShouldBePalindrome() {
        assertTrue(PalindromicStrings.isPalindrome(SEQUENCES.get(7)));
    }

}
