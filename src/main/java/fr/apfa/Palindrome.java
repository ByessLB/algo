package fr.apfa;

import java.text.Normalizer;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(palindrome("Mon nom."));

    }

    // ✅ okay
    // TODO JavaDoc
    public static boolean palindrome(String word) {
        if (word != null) {

            word = word.toLowerCase();
            String drow = "";

            /*-----------------------------------------*/
            // Permet de retirer les accents / les ponctuations / les espaces
            /*-----------------------------------------*/
            word = Normalizer.normalize(word, Normalizer.Form.NFD);
            word = word.replaceAll("[^\\p{ASCII}]", "");
            word = word.replaceAll("[\\p{Punct}]", "");
            word = word.replaceAll(" ", "");
            /*-----------------------------------------*/

            for (int i = word.length() - 1; i >= 0; i--) {
                drow += word.charAt(i);
            }

            if (word.equals(drow)) {
                return true;
            }
        }
        return false;
    }
}
