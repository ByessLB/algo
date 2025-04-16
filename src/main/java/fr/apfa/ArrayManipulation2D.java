package fr.apfa;

public class ArrayManipulation2D {
    public static void main(String[] args) throws Exception {
        // Elements pour exercice
        int[][] array2D = { { 4, 6, 5 }, { 7, 11, 34 }, { 28, 6, 2 }, { 1, 2, 3 }, { 4, 3, 10 } };
        int[][] array2D2 = { { 4, 6, 5, 2 }, { 7, 11, 34, 1 }, { 28, 6, 2, 15 }, { 1, 2, 3, 19 } };
        int width = 4;
        int height = 4;
        int diagonalType = 1;

        // Appel des méthodes et utilisation des éléments
        // sumArrays(array2D);
        sommeValeursEnDiagonale(array2D2, width, height, diagonalType);
    }

    /**
     * Somme des valeurs d'un tableau 2D
     * 
     * @param array
     * @return
     */
    public static int sumArrays(int[][] array) {
        // Variable de récupération et d'addition
        int result = 0;

        // Itération pour récupérer les valeurs du tableau tableau
        for (int index = 0; index <= array.length - 1; index++) {
            for (int i = 0; i <= array[index].length - 1; i++) {
                result += array[index][i];
            }
        }

        System.out.println("Somme des valeurs du tableau tableau = " + result);
        return result;
    }

    public static int sommeValeursEnDiagonale(int[][] array, int width, int height, int diagonale) {

        int sum = 0;

        if (diagonale < 1 || diagonale > 2 || array == null || width < array.length || height < array.length) {
            return -1;
        } else if (diagonale == 1) {
            for (int index = 0; index < array.length; index++) {
                for (int i = 0; i <= array[index].length - 1; i++) {
                    if (i == index) {
                        sum += array[index][i];
                    }
                }
            }
        } else if (diagonale == 2) {
            for (int index = array.length; index > 0; index-- ) {
                for (int i = array[index].length; i > 0; i--) {
                    if (i == index) {
                        sum += array[index][i];
                    }
                }
            }
        }

        System.out.println(sum);
        return sum;
    }
}
