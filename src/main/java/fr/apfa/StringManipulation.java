package fr.apfa;

import java.util.ArrayList;

public class StringManipulation {

    public static void main(String[] args) {
        decompteVoyelle("AnacondA");
    }

/**
 * <h3>Décompte voyelle </h3>
 * @param chaine
 * @return int nombre de voyelle de la chaine
 */
    public static int decompteVoyelle(String chaine) {
        ArrayList<Character> voyelle = new ArrayList<>();
        voyelle.add('a');
        voyelle.add('e');
        voyelle.add('i');
        voyelle.add('o');
        voyelle.add('u');
        voyelle.add('y');

        chaine = chaine.toLowerCase();
        int count = 0;


        for (int index = 0; index < chaine.length(); index++) {
            if (voyelle.contains(chaine.charAt(index))) {
                count++;
            }
        }

        System.out.println(count);
        return count;
    }
}
