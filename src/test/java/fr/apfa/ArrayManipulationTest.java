package fr.apfa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ArrayManipulationTest {

    @Test
    void verifyIfSumIndexIsPossible() {

    }

    @Test
    void verifyIfSwapReturnTrue() {

        int a = 3;
        int b = 7;
        int c = -1;
        int d = 1000;
        int[] array = {2, 5, 6, 4, 8, 10, 15, 13, 6, 36};

        boolean result = ArrayManipulation.swap(a, b, array );
        assertTrue(result);

        boolean otherResult = ArrayManipulation.swap(c, d, array);
        assertFalse(otherResult);
    }


    @Test
    void VerifyArraYAverage() {

        int[] array = {2, 5, 6, 4, 8, 10, 15, 13, 6, 36};
        int[] array2 = {-1, 6, 125, 18, 4, 6, 78, 98, 164, 34, 2, 88, 4};
        int[] array3 = {-125, 102, 48, 37, -12, 98, 222, 65, 11, 0, 2};
        int[] arrayNull = {};
        int[] arrayNegative = {-2, -5, -6, -4, -8, -10, -15, -13, -6, -36};

        int result = ArrayManipulation.calculMoyenne(array);
        int result2 = ArrayManipulation.calculMoyenne(array2);
        int result3 = ArrayManipulation.calculMoyenne(array3);
        int result4 = ArrayManipulation.calculMoyenne(arrayNull);
        int result5 = ArrayManipulation.calculMoyenne(arrayNegative);

        assertEquals(10, result);
        assertEquals(48, result2);
        assertEquals(40, result3);
        assertEquals(0, result4);
        assertEquals(-10, result5);
    }
}
