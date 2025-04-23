package fr.apfa;

public class ArrayManipulation2D {
    public static void main(String[] args) throws Exception {
        // Elements pour exercice
        int[][] array2D = { { 4, 6, 5 }, { 7, 11, 34 }, { 28, 6, 2 }, { 1, 2, 3 }, { 4, 3, 10 } };
        int[][] array2D2 = { { 4, 6, 5, 2 }, { 7, 11, 34, 1 }, { 28, 6, 2, 15 }, { 1, 2, 3, 19 } };
        int width = 3;
        int height = 5;
        int diagonalType = 2;

        // Appel des méthodes et utilisation des éléments
        System.out.println("Somme des valeurs du tableau tableau = " + sumArrays(array2D));
        // sommeValeursEnDiagonale(array2D, width, height, diagonalType);
    }

    // Remarque : il est plus logique de faire l'affichage dans le main
    // ✅ Okay
    /**
     * Somme des valeurs d'un tableau 2D
     * 
     * @param array
     * @return int
     */
    public static int sumArrays(int[][] array) {
        // Variable de récupération et d'addition
        int result = 0;

        // Itération pour récupérer les valeurs du tableau tableau
        for (int indexRow = 0; indexRow < array.length; indexRow++) {
            for (int indexColumn = 0; indexColumn < array[indexRow].length; indexColumn++) {
                result += array[indexRow][indexColumn];
            }
        }

        // System.out.println("Somme des valeurs du tableau tableau = " + result);
        return result;
    }

    // Il serait plus logique de faire un if / else pour initialiser columnIndex et
    // diagonalStep
    // ✅ Okay
    /**
     * Somme des valeurs d'un tableau2D sur une diagonale
     * 
     * @param array
     * @param width     int
     * @param height    int
     * @param diagonale int
     * @return int
     */
    public static int sommeValeursEnDiagonale(int[][] array, int width, int height, int diagonale) {

        int sum = 0;
        int columnIndex = 0;
        int diagonalStep = 1;

        if (array == null || width != height || width != array.length || diagonale < 1 || diagonale > 2) {
            return -1;
        } else if (diagonale == 2) {
            columnIndex = array[0].length - 1;
            diagonalStep = -1;
        }

        for (int index = 0; index < array.length; index++) {
            sum += array[index][columnIndex];
            columnIndex += diagonalStep;
        }

        System.out.println(sum);
        return sum;
    }
}
