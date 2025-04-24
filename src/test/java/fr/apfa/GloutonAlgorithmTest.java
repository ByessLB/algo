package fr.apfa;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class GloutonAlgorithmTest {
    @Test
    void testGloutonAlgorithm() {

        double test = 4.63;
        int[] arrayResult = {2, 0, 1, 0, 1, 0, 1, 1};

        int[] arrayTest = GloutonAlgorithm.gloutonAlgorithm(test);

        assertArrayEquals(arrayResult, arrayTest);
    }
}
