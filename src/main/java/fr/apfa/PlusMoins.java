package fr.apfa;

import java.util.Random;
import java.util.Scanner;

public class PlusMoins {

    public static void main(String[] args) {
        plusMoins();
    }

    public static void plusMoins() {
        // Instanciation d'un objet de la classe Random
        Random r = new Random();
        // Génération d'un nombre >= 0 et <= 100
        int n = r.nextInt(100);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tentez de trouver notre nombre et gagnez un lot !!!");

        int nombreEssai = 5;

        for (int index = 0; index <= nombreEssai; index++) {
            if (index == nombreEssai) {
                System.out.println("Désolé, nombre d'essai expiré. A la prochaine fois !!");
            } else {
                System.out.println("entrez un nombre : ");
                int essai = scanner.nextInt();
                if (essai < n) {
                    System.out.println("C'est plus !");
                } else if (essai > n) {
                    System.out.println("C'est moins !!");
                } else {
                    System.out.println("VICTOIIIRE !!!");
                    break;
                }
            }
        }
        scanner.close();
    }
}
