package fr.apfa;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ArrayFusionTest {
    @Test
    void testFusionDeTableau() {

        int[] tab1 = { 2, 6, 1, 3, 5, 15 };
        int[] tab2 = { 4, 5, 4, 78, 1, 3, 2, 54 };
        int[] result = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 15, 54, 78};

        int[] finalTab = ArrayFusion.fusionDeTableau(tab1, tab2);

        assertArrayEquals(result, finalTab);
    }
}
