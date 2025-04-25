package fr.apfa;

public class GloutonAlgorithm {

    /**
     * Algorithme Glouton
     * On souhaite récupérer dans un tableau le nombre de chaque pièces utilisées selon
     * la somme donné dans avec un résultat optimal.
     * @param somme
     * @return int[]
     */
    public static int[] gloutonAlgorithm(double somme) {

        int[] pieces = {200, 100, 50, 20, 10, 5, 2, 1};
        int[] nombrePiecesUtilisees = new int[8];

        if(somme != 0) {
            int newSomme = (int) (somme * 100);

            for (int index = 0; index < pieces.length; index++) {
                while ((newSomme - pieces[index]) >= 0) {
                    newSomme = newSomme - pieces[index];
                    nombrePiecesUtilisees[index]++;
                }
            }

            return nombrePiecesUtilisees;
        } else {
            return nombrePiecesUtilisees;
        }
    }
}
