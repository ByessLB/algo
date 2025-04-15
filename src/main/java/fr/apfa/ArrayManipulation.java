package fr.apfa;

public class ArrayManipulation {

    public static void main(String[] args) throws Exception {

        // Itération sur un tableau
        double[] arrayDouble = { 12.2, 11.3, 4.4, 2.0 };
        int[] arrayTest = {2, 5, 6, 4, 8, 10, 15, 13, 6, 36};

        // doWhileSequentielle();

        sommeIndexInArray(2, 5);
        sommeIndexInArray(2, 5, arrayTest);
    }

    // Recherche séquentielle

    // Boucle for
    public static void forSequentielle() {
        int[] arrayInt = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        for (int index = 0; index <= arrayInt.length - 1; index++) {
            if (arrayInt[index] == 50) {
                System.out.println("Le milieu : " + arrayInt[index]);
            }
        }
    }

    // Boucle while
    public static void whileSequentielle() {
        int[] arrayInt = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        int index = 0;
        while (index <= arrayInt.length - 1) {
            if (arrayInt[index] == 40) {
                System.out.println(arrayInt[index]);
            }
            index++;
        }
    }

    // Boucle do.. while
    public static void doWhileSequentielle() {
        int[] arrayInt = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        int index = 0;
        do {
            System.out.println(arrayInt[index]);
            index++;
        } while (index <= arrayInt.length - 1);
    }


    // Somme entre 2 index et un tableau s'il existe
    public static void sommeIndexInArray(Object... params) {
        // On vérifie le nombre de paramètres entrées
        if (params.length < 2 || params.length > 3) {
            throw new IllegalArgumentException("Nombre incorrect de paramètres.");
        }

        int i;
        int j;
        int[] arrayClient;

        int [] defaultArray = {2, 5, 7, 3, 18, 22, 12, 56, 9, 1};

        try {
            i = (Integer) params[0];
            j = (Integer) params[1];
            arrayClient = (params.length == 3) ? (int[]) params[2] : defaultArray;
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("Types de paramètres incorrects.");
        }

        if(arrayClient.length == 0) {
            arrayClient = defaultArray;
        }

        if (i < 0 || i >= arrayClient.length) {
            System.out.println("Erreur ! L'indice i est invalide.");
            return;
        }

        if (j < 0 || j >= arrayClient.length) {
            System.out.println("Erreur ! L'indice j est invalide.");
            return;
        }

        int elementI = arrayClient[i];
        int elementJ = arrayClient[j];

        System.out.println("l'élément sélectionné à l'emplacement " + i + ", est : " + elementI);
        System.out.println("l'élément sélectionné à l'emplacement " + j + ", est : " + elementJ);

        // Retour de la somme des éléments des 2 index
        System.out.println("La somme des éléments selectionnés est : " + (elementI + elementJ));
    }

    // Recherce d'indices dans un tableau
    public static void indicesTableau(int[] array) {
        
    }
}
