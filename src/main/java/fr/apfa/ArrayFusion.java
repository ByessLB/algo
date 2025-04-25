package fr.apfa;

import java.util.Arrays;

public class ArrayFusion {

    public static int[] fusionDeTableau(int[] firstArray, int[] secondArray) {
        // Trier les 2 tableaux
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        int[] finalArray = new int[firstArray.length + secondArray.length];
        int firstIndex = 0, secondIndex = 0, finalIndex = 0;

        // Fusionner les deux tableaux triés
        while (firstIndex < firstArray.length && secondIndex < secondArray.length) {
            if (firstArray[firstIndex] < secondArray[secondIndex]) {
                finalArray[finalIndex++] = firstArray[firstIndex++];
            } else {
                finalArray[finalIndex++] = secondArray[secondIndex++];
            }
        }

        // Ajouter les éléments restants de array1, s'il y en a
        while (firstIndex < firstArray.length) {
            finalArray[finalIndex++] = firstArray[firstIndex++];
        }

        // Ajouter les éléments restants de array2, s'il y en a
        while (secondIndex < secondArray.length) {
            finalArray[finalIndex++] = secondArray[secondIndex++];
        }

        // Afficher le tableau final
        for (int index = 0; index < finalArray.length; index++) {
            System.out.println(finalArray[index]);
        }

        return finalArray;
    }
}
