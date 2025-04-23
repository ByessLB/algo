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
    // tu peux également retourner le résultat afin de pouvoir mettre en place des
    // tests unitaires et prendre le mois et les abonnées en paramètres

    // TODO JAMAIS d'accent sur les noms de variables

    /**
     * Abonné.e.s Youtube avec while
     * 
     * @return int total
     */
    public static int abonneesYoutubeAvecWhile() {
        int mois = 24;
        double abonnées = 2500;
        int index = 1;
        int total = 0;

        System.out.println("Abonné.e.s Youtube : " + abonnées);

        while (index <= mois) {
            total = (int) Math.ceil(abonnées *= 1.05);
            System.out.println("Abonné.e.s Youtube : " + total);
            index++;
        }
        return total;
    }

    /**
     * Abonné.e.s Youtube avec for
     */
    public static void abonneesYoutubeAvecFor() {
        int mois = 24;
        double abonnées = 2500;

        System.out.println("Abonné.e.s Youtube : " + abonnées);

        for (int index = 1; index <= mois; index++) {
            int total = (int) Math.ceil(abonnées *= 1.05);
            System.out.println("Abonné.e.s Youtube : " + total);
        }
    }

    // ✅ nice!
    /**
     * Somme des entiers de 0 à n
     * 
     * @param n
     * @return
     */
    public static int sommeEntiers(int n) {
        int somme = 0;
        for (int index = 0; index <= n; index++) {
            somme += index;
        }
        // System.out.println("Somme des entiers de 0 à " + n + " : " + somme);
        return somme;
    }

    // ✅checked!
    /**
     * <h3>FizzBuzz</h3>
     * 
     * @param n valeur maximale à atteindre
     * @return la chaine fizzbuzz
     */
    public static String fizzBuzz(int n) {
        StringBuilder result = new StringBuilder();
        for (int index = 1; index <= n; index++) {
            if (index % 3 == 0 && index % 5 == 0) {
                result.append("FizzBuzz");
            } else if (index % 3 == 0) {
                result.append("Fizz");
            } else if (index % 5 == 0) {
                result.append("Buzz");
            } else {
                result.append(index);
            }
            result.append("\n");
        }

        return result.toString();
    }

    // ✅ okay
    /**
     * <h3>Factorielle</h3>
     * 
     * @param n
     * @return produit des nombres entiers strictement positifs inférieurs ou égaux
     *         à <strong>n</strong>.
     */
    public static int factorielle(int n) {
        int factorielle = 1;
        for (int index = 1; index <= n; index++) {
            factorielle *= index;
        }
        System.out.println("Factorielle de " + n + " : " + factorielle);
        return factorielle;
    }
}
