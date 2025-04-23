package fr.apfa;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PalindromeTest {
    @Test
    void testPalindrome() {

        boolean test = Palindrome.palindrome("kayak");

        assertTrue(test);
    }
}
