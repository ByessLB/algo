package fr.apfa;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PalindromeTest {
    @Test
    void testPalindrome() {

        boolean test = Palindrome.palindrome("Mon nom");
        boolean test1 = Palindrome.palindrome("Esope reste ici et se repose");
        boolean test2 = Palindrome.palindrome("La mariée ira mal");
        boolean test3 = Palindrome.palindrome("Léon, émir cornu, d'un roc rime Noël.");
        boolean test4 = Palindrome.palindrome("Elu par cette crapule");

        assertTrue(test);
        assertTrue(test1);
        assertTrue(test2);
        assertTrue(test3);
        assertTrue(test4);
    }
}
