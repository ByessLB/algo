package fr.apfa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class ArrayManipulation2DTest {

    @Test
    void verifyIfSumArraysReturnCorrectly() {

        int[][] array = {{5, 5, 3}, {7, 11, 8}, {1, 10, 4}, {6, 8, 2}, {88, 4, 1}};
        int[][] array2 = {{5, 4, 3}, {7, 11, 8}, {1, 10, 4}, {6, 8, 2}, {88, 4, 1}};

        int result = ArrayManipulation2D.sumArrays(array2);

        assertNotEquals(array, array2);
        assertEquals(162, result);
    }

    @Test
    void verifySumOfDiagonalValuesOnArray() {
        int[][] array = {{4, 6, 5, 2}, {7, 11, 34, 1}, {28, 6, 2, 15}, {1, 2, 3, 19}};
        int[][] wrongArray = {{}, {}};
        int width = 4;
        int wrongWidhth = 7;
        int height = 4;
        int wrongHeight = 7;
        int diagonal = 1;
        int wrongDiagonal = 0;

        int result = ArrayManipulation2D.sommeValeursEnDiagonale(array, width, height, diagonal);
        int resultErr = ArrayManipulation2D.sommeValeursEnDiagonale(array, wrongWidhth, wrongHeight, diagonal);
        int resultErr1 = ArrayManipulation2D.sommeValeursEnDiagonale(array, wrongWidhth, height, diagonal);
        int resultErr2 = ArrayManipulation2D.sommeValeursEnDiagonale(array, width, height, wrongDiagonal);
        int resultErr3 = ArrayManipulation2D.sommeValeursEnDiagonale(wrongArray, width, height, diagonal);

        assertEquals(36, result);
        assertEquals(-1, resultErr);
        assertEquals(-1, resultErr1);
        assertEquals(-1, resultErr2);
        assertEquals(-1, resultErr3);
    }

    @Test
    void testSommeValeursEnDiagonale() {
        
    }

    @Test
    void testSumArrays() {
        
    }
}
