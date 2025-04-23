package fr.apfa;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringManipulationTest {
    @Test
    void testCamelCase() {

        String test = StringManipulation.camelCase("Je suis une fougère");

        assertEquals("jeSuisUneFougère", test);
    }

    @Test
    void testCountUpperCase() {

        int testUn = StringManipulation.countUpperCase("Je Suis Une fougère");
        int testDeux = StringManipulation.countUpperCase("AnacondA");
        int testTrois = StringManipulation.countUpperCase("ORANGE");

        assertEquals(3, testUn);
        assertEquals(2, testDeux);
        assertEquals(6, testTrois);

    }

    @Test
    void testDecompteVoyelle() {

        int testUn = StringManipulation.decompteVoyelle("Je suis une fougère");
        int testDeux = StringManipulation.decompteVoyelle("AnaconDA");
        int testTrois = StringManipulation.decompteVoyelle("orAngE");

        assertEquals(9, testUn);
        assertEquals(4, testDeux);
        assertEquals(3, testTrois);

    }

    @Test
    void testLocalisationStringOnString() {

        Integer[] test = StringManipulation.localisationStringOnString("Je suis une fougère", "fougère");
        Integer[] expected = {12, 18};

        assertArrayEquals(expected, test);
    }

    @Test
    void testLowerToUpper() {

        String orange = StringManipulation.lowerToUpper("orange");

        assertEquals("ORANGE", orange);
    }

    @Test
    void testMirror() {

        String test = StringManipulation.mirror("egnaro");

        assertEquals("orange", test);
    }
}
