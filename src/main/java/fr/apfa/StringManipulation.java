package fr.apfa;

import java.util.ArrayList;

public class StringManipulation {

    public static void main(String[] args) {
        // decompteVoyelle("AnacondA");
        // countUpperCase("Je Suis une Fougère!");
        // mirror("erèguoF enu siuS eJ");
        camelCase("Je suis une fougère");
        // localisationStringOnString("Mon nom est Personne.", "Personne");
    }

    // ✅ okay
    /**
     * <h3>Décompte voyelle</h3>
     * 
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
        voyelle.add('à');
        voyelle.add('é');
        voyelle.add('è');
        voyelle.add('ù');
        voyelle.add('ê');
        voyelle.add('â');
        voyelle.add('ë');
        voyelle.add('î');
        voyelle.add('ï');
        voyelle.add('ö');
        voyelle.add('ù');

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

    // ✅ Nickel
    /**
     * Décompte des majuscules dans une String
     * 
     * @param chaine
     * @return int retourne le nombre de majuscule
     */
    public static int countUpperCase(String chaine) {
        int count = 0;
        for (int index = 0; index < chaine.length(); index++) {
            if (Character.isUpperCase(chaine.charAt(index))) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    /**
     * Passer une String minuscule en Majuscule
     * 
     * @param chaine
     * @return String majuscule
     */
    public static String lowerToUpper(String chaine) {
        return chaine.toUpperCase();
    }

    // ✅ okay
    /**
     * Miroir d'une String
     * 
     * @param chaine
     * @return String mirror
     */
    public static String mirror(String chaine) {
        String[] tmpArray = chaine.split("");
        String mirror = "";
        for (int i = tmpArray.length - 1; i >= 0; i--) {
            mirror += tmpArray[i];
        }

        System.out.println(mirror);
        return mirror;
    }

    /**
     * CamelCase
     * 
     * @param chaine
     * @return String Retourne une chaine en camelCase
     */
    public static String camelCase(String chaine) {
        if (chaine == null || chaine.isEmpty()) {
            return chaine;
        }

        String[] tmpArray = chaine.split(" ");
        StringBuilder camelCaseString = new StringBuilder();

        for (int index = 0; index < tmpArray.length; index++) {
            if (index == 0) {
                camelCaseString.append(tmpArray[index].toLowerCase());
            } else {
                camelCaseString.append(tmpArray[index].substring(0, 1).toUpperCase())
                        .append(tmpArray[index].substring(1).toLowerCase());
            }
        }

        System.out.println(camelCaseString.toString());
        return camelCaseString.toString();
    }

    // Il serait intéressant de faire la recherche sans utiliser la méthode
    // "contains" de java

    /**
     * Localisation d'une sous-chaîne de caractères
     * 
     * @param chaine
     * @param sousChaine
     * @return Array valeur du premier index de la sous chaine localisé ainsi de du
     *         dernier index
     */
    public static Integer[] localisationStringOnString(String chaine, String sousChaine) {
        int firstIndexOfChaine = 0;
        int lastIndexOfChaine = 0;
        if (chaine.contains(sousChaine)) {
            firstIndexOfChaine = chaine.indexOf(sousChaine);
            lastIndexOfChaine = chaine.indexOf(sousChaine) + sousChaine.length() - 1;
        } else {
            firstIndexOfChaine = -1;
            lastIndexOfChaine = -1;
        }

        System.out.println("Données d'entrée :");
        System.out.println("- chaîne de référence : " + chaine);
        System.out.println("- chaîne à localiser : " + sousChaine);
        System.out.println("données de sortie :");
        System.out.println("- premier index : " + firstIndexOfChaine);
        System.out.println("- dernier index : " + lastIndexOfChaine);

        return new Integer[] { firstIndexOfChaine, lastIndexOfChaine };
    }
}
