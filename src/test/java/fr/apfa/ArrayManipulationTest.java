package fr.apfa;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ArrayManipulationTest {

    @Test
    void verifyIfSumIndexIsPossible() {

        int a = 1;
        int b = 8;
        int c = 5; 
        int d = 6;
        int err = -1;
        int[] array = {32, 5, 6, 71, 8, 65, 2, 12, 25, 44, 31, 9};

        int result = ArrayManipulation.sumIndexArray(b, a, array);
        int result2 = ArrayManipulation.sumIndexArray(err, c, array);
        int result3 = ArrayManipulation.sumIndexArray(c, d, array);

        assertEquals(-1, result);
        assertEquals(-1, result2);
        assertNotEquals(-1, result3);
        assertEquals(67, result3);
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
    void verifyArrayAverageIsCorrect() {

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

    @Test
    void verifyIfArrayInvertIsCorrect() {
        int[] array = {2, 5, 6, 4, 8, 10, 15, 13, 6, 36};
        int[] array3 = {-125, 102, 48, 37, -12, 98, 222, 65, 11, 0, 2};
        int[] invertArray = {36, 6, 13, 15, 10, 8, 4, 6, 5, 2};

        int[] result = ArrayManipulation.invert(array);

        assertNotEquals(array3, result);
        assertNotEquals(array, result);
        assertArrayEquals(invertArray, result);
    }
}
