package fr.apfa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinaryConversionTest {
    @Test
    void testBase10() {

        int un = BinaryConversion.base10("00000001");
        int quatre = BinaryConversion.base10("100");
        int quaranteTrois = BinaryConversion.base10("101011");
        int cinqCentOnze = BinaryConversion.base10("111111111");

        assertEquals(1, un);
        assertEquals(4, quatre);
        assertEquals(43, quaranteTrois);
        assertEquals(511, cinqCentOnze);
    }

    @Test
    void testBase10aBinaire() {

        String dix = BinaryConversion.base10aBinaire(10);
        String vide = BinaryConversion.base10aBinaire(0);
        String un = BinaryConversion.base10aBinaire(1);
        String deuxCentCinquanteCinq = BinaryConversion.base10aBinaire(255);

        assertEquals("1010", dix);
        assertEquals("", vide);
        assertEquals("1", un);
        assertEquals("11111111", deuxCentCinquanteCinq);
    }
}
