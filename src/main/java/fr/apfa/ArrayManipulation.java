package fr.apfa;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {

    public static void main(String[] args) throws Exception {

        // Itération sur un tableau
        double[] arrayDouble = { 12.2, 11.3, 4.4, 2.0 };
        int[] arrayTest = { 2, 5, 6, 4, 8, 10, 15, 13, 6, 36 };

        int[] array = { 2, 5, 6, 4, 8, 10, 15, 13, 6, 36 };
        int[] array2 = { -1, 6, 125, 18, 4, 6, 78, 98, 164, 34, 2, 88, 4 };
        int[] array3 = { -125, 102, 48, 37, -12, 98, 222, 65, 11, 0, 2 };
        int[] arrayNull = {};
        int[] arrayNegative = { -2, -5, -6, -4, -8, -10, -15, -13, -6, -36 };

        // doWhileSequentielle();

        // sommeIndexInArray(2, 5);
        // sommeIndexInArray(2, 5, arrayTest);

        // indicesTableau(arrayTest);

        // swap(3, 9, arrayTest);

        // calculMoyenne(arrayNegative);

        // manipulationTableauParSaisie();

        invert(array);
    }

    // Recherche séquentielle

    // Boucle for
    public static void forSequentielle() {
        int[] arrayInt = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        // TODO pour la condition d'arrêt tu peux plutôt adopter l'approche suivante :
        // index < arrayInt.length (ça permet de simplifier l'opération)
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
        // TODO pour la condition d'arrêt tu peux plutôt adopter l'approche suivante :
        // index < arrayInt.length (ça permet de simplifier l'opération)
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

    // TODO plutôt adopter la déclaration de fonction suivante :
    // public static int sommeIndexInArray(int[] array, int indexStart, int
    // indexEnd)
    // Exemple de fonctionnement : soit le tableau [ 2, 5, 4, 6, 10]
    // Avec indexStart = 1 et indexENd = 4
    // on doit avoir 5 + 4 + 6
    // il est conseillé d'utiliser une boucle

    // Somme entre 2 index et un tableau s'il existe
    public static void sommeIndexInArray(Object... params) {
        // On vérifie le nombre de paramètres entrées
        if (params.length < 2 || params.length > 3) {
            throw new IllegalArgumentException("Nombre incorrect de paramètres.");
        }

        // Initialisation de variables
        int i;
        int j;
        int[] arrayClient;

        int[] defaultArray = { 2, 5, 7, 3, 18, 22, 12, 56, 9, 1 };

        // Intégration des params dans les variables. Vérification d'exception
        try {
            i = (Integer) params[0];
            j = (Integer) params[1];
            // Intégration du tableau en param dans une variable si valide, sinon
            // intégration du tableau par defaut
            arrayClient = (params.length == 3) ? (int[]) params[2] : defaultArray;
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("Types de paramètres incorrects.");
        }

        // Intégration du tableau par defaut dans la variable dédié si le tableau en
        // param est vide
        if (arrayClient.length == 0) {
            arrayClient = defaultArray;
        }

        // On vérifie si le premier param est propre à un indice du tableau entré en
        // param
        if (i < 0 || i >= arrayClient.length) {
            System.out.println("Erreur ! L'indice i est invalide.");
            return;
        }

        // On vérifie si le second param est propre à un indice du tableau entré en
        // param
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
    public static int[] indicesTableau(int[] array) {
        // Vérification du tableau > 2 indices
        if (array.length < 2) {
            System.out.println("Il est impossible de retourner de valeurs");
        }

        // Initialisation de valeur
        int maxVal = array[0];
        int minVal = array[0];
        int[] arrayResult = new int[2];

        // Retour des valeurs du tableau fourni
        System.out.println("valeur du tableau : ");
        for (int nombre : array) {
            System.out.println(nombre);
        }

        // Intégration des valeurs MAX/MIN dans des variables
        for (int index = 0; index < array.length; index++) {
            if (array[index] > maxVal) {
                maxVal = array[index];
            }
            if (array[index] < minVal) {
                minVal = array[index];
            }
        }

        // Intégration des valeurs MAX/MIN dans un tableau
        for (int index = 0; index < array.length; index++) {
            if (array[index] == minVal) {
                arrayResult[0] = index;
            }
            if (array[index] == maxVal) {
                arrayResult[1] = index;
            }
        }

        // Sorti du tableau MIN/MAX
        System.out.println("Les indices des min et max valeurs sont : " + Arrays.toString(arrayResult));
        return arrayResult;
    }

    // Echange de valeurs
    public static boolean swap(int paramA, int paramB, int[] array) {
        // Vérification du tableau > à 2 indices pour opérer un échange
        if (array.length < 2) {
            return false;
        }

        // Intialisation de valeur en boolean
        // TODO existe-t-il une solution non basée sur l'utilisation de ces variables
        // boolA et boolB ?
        boolean boolA = false;
        boolean boolB = false;

        // En boucle pour identifier si les indices mis en param sont identifiable dans
        // le tableau
        for (int index = 0; index <= array.length - 1; index++) {
            if (index == paramA) {
                boolA = true;
            }
            if (index == paramB) {
                boolB = true;
            }
        }

        // On vérifie si on retrouve bien les indices
        if (boolA && boolB) {
            return true;
        }
        return false;
    }

    // Calcul de moyenne
    public static Integer calculMoyenne(int[] array) {
        try {
            // Initialisation variable
            int result = 0;

            // On vérifie si le tableau n'est pas vide
            if (array.length != 0) {
                // On cumule les valeurs du tableau dans notre variable
                for (int index = 0; index <= array.length - 1; index++) {
                    result += array[index];
                }
            }

            // On fait la somme de notre résultat en fonction du nombre de valeurs de notre
            // tableau
            double moyenne = result / array.length;
            // (int) permet, à juste titre, de transformer le résulat double en int
            // c'est ce que nous appelons un opérateur de CAST
            return (int) moyenne;
        } catch (ArithmeticException e) {
            System.out.println("Non divisible par 0.");
            return 0;
        }
    }

    // Manipulation de tableau d'entiers et saisie utilisateur
    public static void manipulationTableauParSaisie() {
        // Intégration du scanner
        Scanner scanner = new Scanner(System.in);

        // Message affiché en console
        System.out.println("Veuillez choisir un nombre de valeurs à saisir : ");

        // Attente de la saisie utilisateur
        int arraySize = scanner.nextInt();

        // Déclaration du tableau de taille "arraySize"
        int[] arrayToProcess = new int[arraySize];

        System.out.println("-----");

        // Récupération et installation de valeurs dans le tableau
        int index = 0;
        do {
            index++;
            System.out.println("Vueillez saisir le nombre " + index);
            int valeur = scanner.nextInt();
            arrayToProcess[index - 1] = valeur;
        } while (index <= arrayToProcess.length - 1);

        System.out.println("Tableau de valeur : " + Arrays.toString(arrayToProcess));
        System.out.println("-----");

        // programme calcul moyenne && min/max
        int maxVal = arrayToProcess[0];
        int minVal = arrayToProcess[0];
        int result = 0;

        for (index = 0; index <= arrayToProcess.length - 1; index++) {
            result += arrayToProcess[index];
            if (arrayToProcess[index] > maxVal) {
                maxVal = arrayToProcess[index];
            }
            if (arrayToProcess[index] < minVal) {
                minVal = arrayToProcess[index];
            }
        }

        double moyenne = result / arrayToProcess.length;
        System.out.println("Moyenne = " + (int) moyenne);
        System.out.println("Minimum = " + minVal);
        System.out.println("Maximum = " + maxVal);

        scanner.close();
    }

    // ✅ well done!
    public static int[] invert(int[] array) {
        int[] invertArray = new int[array.length];

        for (int index = 0; index <= array.length; index++) {
            invertArray[index] = array[array.length - 1 - index];
        }

        return invertArray;
    }

}
