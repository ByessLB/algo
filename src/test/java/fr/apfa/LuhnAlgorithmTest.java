package fr.apfa;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class LuhnAlgorithmTest {
    @Test
    void testAlgorithmeLuhn() {

        String cbValide = "4263982640269299";
        String cbValide1 = "4539319503436467";
        String cbValide2 = "79927398713";

        String cbNonValide = "4223982640269299";
        String cbNonValide1 = "4539319503436476";
        String cbNonValide2 = "8273 1232 7352 0569";

        boolean test = LuhnAlgorithm.algorithmeLuhn(cbValide);
        boolean test1 = LuhnAlgorithm.algorithmeLuhn(cbValide2);
        boolean test2 = LuhnAlgorithm.algorithmeLuhn(cbValide1);
        boolean test3 = LuhnAlgorithm.algorithmeLuhn(cbNonValide);
        boolean test4 = LuhnAlgorithm.algorithmeLuhn(cbNonValide1);
        boolean test5 = LuhnAlgorithm.algorithmeLuhn(cbNonValide2);

        assertTrue(test);
        assertTrue(test1);
        assertTrue(test2);

        assertFalse(test3);
        assertFalse(test4);
        assertFalse(test5);
    }
}
