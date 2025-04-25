package fr.apfa;

public class BinaryConversion {

    public static void main(String[] args) {
        base10("00000001");
        base10("100");
        base10("101011");
        base10("111111111");

        // base10aBinaire(43);
    }

    // ✅ Bon algo mais il est important de respecter les rôles de chacun : la
    // fonction sert à calculer le décimal, c'est au main d'afficher le résultat
    /**
     * Conversion binaire vers base10
     * 
     * @param string
     * @return int
     */
    public static Integer base10(String string) {
        int decimal = 0;
        int intTmp = 0;

        for (int i = string.length() - 1; i >= 0; i--) {
            int tmp = Character.getNumericValue(string.charAt(i));
            decimal += tmp * Math.pow(2, intTmp);
            intTmp++;
        }

        return decimal;
    }

    // ✅ Nickel

    /**
     * Conversion base10 en binaire
     * 
     * @param nombre en base 10
     * @return nombre en binaire
     */
    public static String base10aBinaire(int nombre) {

        StringBuilder binaire = new StringBuilder();

        while (nombre != 0) {
            binaire.append(nombre % 2);
            nombre = nombre / 2;
        }
        binaire = binaire.reverse();

        return binaire.toString();
    }
}
