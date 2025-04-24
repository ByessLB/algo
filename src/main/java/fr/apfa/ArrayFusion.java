package fr.apfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayFusion {

    public static void main(String[] args) {
        int[] tab1 = { 2, 6, 1, 3, 5, 15 };
        int[] tab2 = { 4, 5, 4, 78, 1, 3, 2, 54 };

        fusionDeTableau(tab1, tab2);
    }

    // TODO : Je pense que l'exercice demandait un algo qui n'utilise pas la
    // fonction sort
    public static ArrayList<Integer> fusionDeTableau(int[] array1, int[] array2) {

        // Initialisation de la liste de réupération
        ArrayList<Integer> list = new ArrayList<>();

        if (array1 != null) {
            // Intégration des valeurs du premier tableau dans la liste
            for (int i = 0; i < array1.length; i++) {
                list.add(array1[i]);
            }
        }

        if (array2 != null) {
            // Intégration des valeurs du second tableau dans la liste
            for (int i = 0; i < array2.length; i++) {
                list.add(array2[i]);
            }
        }

        // Tri de la liste
        Collections.sort(list);

        System.out.println(list);
        return list;
    }
}
