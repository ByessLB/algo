package fr.apfa;

public class Iteration {
    public static void main(String[] args) throws Exception {

        // abonneesYoutubeAvecWhile();
        // abonneesYoutubeAvecFor();
        // sommeEntiers(14);
        // fizzBuzz(18);
        // factorielle(5);
    }

    // TODO ajouter les commentaires en javadoc /** */
    // tu peux également retourner le résultat afin de pouvoir mettre en place des tests unitaires et prendre le mois et les abonnées en paramètres
    // Abonné.e.s Youtube avec while
    public static void abonneesYoutubeAvecWhile() {
        int mois = 24;
        int index = 1;
        double abonnées = 2500;

        System.out.println("Abonné.e.s Youtube : " + abonnées);

        while (index <= mois) {
            int total = (int) Math.ceil(abonnées *= 1.05);
            System.out.println("Abonné.e.s Youtube : " + total);
            index++;
        }
    }

    // TODO ajouter les commentaires en javadoc /** */
    // Abonné.e.s Youtube avec for
    public static void abonneesYoutubeAvecFor() {
        int mois = 24;
        double abonnées = 2500;

        System.out.println("Abonné.e.s Youtube : " + abonnées);

        for (int index = 1; index <= mois; index++) {
            int total = (int) Math.ceil(abonnées *= 1.05);
            System.out.println("Abonné.e.s Youtube : " + total);
        }
    }

    //✅ nice!
    // Somme des entiers de 0 à n
    public static int sommeEntiers(int n) {
        int somme = 0;
        for (int index = 0; index <= n; index++) {
            somme += index;
        }
        // System.out.println("Somme des entiers de 0 à " + n + " : " + somme);
        return somme;
    }

    // ✅checked!
    // FizzBuzz
    public static void fizzBuzz(int n) {
        for (int index = 0; index <= n; index++) {
            if (index % 3 == 0 && index % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (index % 3 == 0) {
                System.out.println("Fizz");
            } else if (index % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(index);
            }
        }
    }

    // ✅ okay
    // Factorielle
    public static int factorielle(int n) {
        int factorielle = 1;
        for (int index = 1; index <= n; index++) {
            factorielle *= index;
        }
        System.out.println("Factorielle de " + n + " : " + factorielle);
        return factorielle;
    }
}
