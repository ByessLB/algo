package fr.apfa;

public class GloutonAlgorithm {

    // TODO Au lieu de faire une boucle pour trouver combien de pièces pour chaque
    // élément du tableau, on peut faire une division

    /**
     * Algorithme Glouton
     * On souhaite récupérer dans un tableau le nombre de chaque pièces utilisées
     * selon
     * la somme donné dans avec un résultat optimal.
     * 
     * @param somme
     * @return int[]
     */
    public static int[] gloutonAlgorithm(double somme) {

        int[] pieces = { 200, 100, 50, 20, 10, 5, 2, 1 };
        int[] nombrePiecesUtilisees = new int[8];

        if (somme != 0) {
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

    public static int[] rendreMonnaie(int montant) {
        int[] pieces = { 200, 100, 50, 20, 10, 5, 2, 1 }; // valeurs en centimes
        int[] resultats = new int[pieces.length]; // nombre de pièces pour chaque valeur

        for (int i = 0; i < pieces.length; i++) {
            resultats[i] = montant / pieces[i]; // combien de pièces de ce type
            montant = montant % pieces[i]; // reste à rendre
        }

        return resultats;
    }
}
