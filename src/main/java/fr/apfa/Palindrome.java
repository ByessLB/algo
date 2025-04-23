package fr.apfa;

import java.text.Normalizer;

public class Palindrome {

    public static void main(String[] args) {

        palindrome("KaéùYäk ?!czonvr-v.");
    }

    public static boolean palindrome(String word) {
        if (word != null) {

            word = word.toLowerCase();

            /*-----------------------------------------*/
            // Permet de retirer les accents
            /*-----------------------------------------*/
            word = Normalizer.normalize(word, Normalizer.Form.NFD);
            word = word.replaceAll("[^\\p{ASCII}]", "");
            /*-----------------------------------------*/
            // Retire les ponctuation
            word = word.replaceAll("[\\p{Punct}]", "");

            System.out.println(word);

            String[] tmpArray = word.split("");
            StringBuilder drow = new StringBuilder();

            for (int i = tmpArray.length - 1; i >= 0; i--) {
                drow.append(tmpArray[i]);
            }

            if (word.equals(drow)) {
                return true;
            }
        }
        return false;
    }
}
