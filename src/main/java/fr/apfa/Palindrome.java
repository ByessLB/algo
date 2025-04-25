package fr.apfa;

import java.text.Normalizer;

public class Palindrome {

    // ✅ okay
    /**
     * Palindrome
     * @param word
     * @return Retourne un booléen le palindrome est réussi
     */
    public static boolean palindrome(String word) {
        if (word == null) {
            return false;
        }

        word = word.toLowerCase();

        // Normaliser et nettoyer la chaîne
        word = Normalizer.normalize(word, Normalizer.Form.NFD);
        word = word.replaceAll("[^\\p{ASCII}]", "");
        word = word.replaceAll("[\\p{Punct}]", "");
        word = word.replaceAll("\\s+", "");

        int left = 0;
        int right = word.length() - 1;

        // Comparer les caractères de chaque extrémité vers le centre
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
