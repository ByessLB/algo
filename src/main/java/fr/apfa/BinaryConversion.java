package fr.apfa;

public class BinaryConversion {

    public static void main(String[] args) {
    //     base10("00000001");
        base10("100");
    //     base10("101011");
        // base10("111111111");
    //     base10("11110000");

    // base10aBinaire(43);
    }

    /**
     * Conversion binaire vers base10
     * @param string
     * @return int
     */
    public static Integer base10(String string) {
        int[] array = new int[string.length()];
        int decimal = 0;

        // Intégration et transformation en entier des valeurs de la chaîne
        for (int i = string.length() -1; i >= 0; i--) {
            array[i] = Character.getNumericValue(string.charAt(i));
        }

        // Conversion du tableau binaire en base 10
        for (int i = 0; i < array.length; i++) {
            decimal += array[i] * Math.pow(2, array.length -1 - i);
        }

        System.out.println(decimal);
        return decimal;
    }

    /**
     * Conversion base10 en binaire
     * @param nombre
     */
    public static String base10aBinaire(int nombre) {

        StringBuilder binaire = new StringBuilder();

        while(nombre != 0) {
            binaire.append(nombre % 2);
            nombre = nombre / 2;
        }
        binaire = binaire.reverse();


        return binaire.toString();
    }
}
