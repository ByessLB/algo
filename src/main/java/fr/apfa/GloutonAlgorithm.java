package fr.apfa;

public class GloutonAlgorithm {

    public static void main(String[] args) {


    }


    public static int[] gloutonAlgorithm(double somme) {

        int[] pieces = {200, 100, 50, 20, 10, 5, 2, 1};
        int[] nombrePiecesUtilisees = new int[8];

        if(somme != 0) {
            int newSomme = (int) (somme * 100);

            for (int i = 0; i < pieces.length; i++) {
                while ((newSomme - pieces[i]) >= 0) {
                    newSomme = newSomme - pieces[i];
                    nombrePiecesUtilisees[i]++;
                }
            }

            return nombrePiecesUtilisees;
        } else {
            return nombrePiecesUtilisees;
        }
    }
}
