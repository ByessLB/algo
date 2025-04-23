package fr.apfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        // minMax(5, 9, 1);
        tauxParticipationEmployeur(scanner);

        scanner.close();
    }

    // Méthode

    // Vérification de la majorité
    public static boolean isAdult(int birthYear) {
        // trouver l'année actuelle
        int currentYear = java.util.Calendar.getInstance().get(Calendar.YEAR);
        // trouver l'année de la majorité
        int majorityYear = currentYear - 18;

        // Vérification de la validité de l'année de naissance
        if (birthYear < 0) {
            System.out.println("L'année de naissance ne peut pas être négative.");
            return false;
        } else if (birthYear > currentYear) {
            System.out.println("L'année de naissance ne peut pas être supérieure à l'année actuelle.");
            return false;
        }

        // Vérification si l'utilisateur est majeur
        return birthYear <= majorityYear;
    }

    // Touver max / min
    public static String minMax(int a, int b, int c) {
        int max;
        int min;

        // // Trouver le max
        // int max = Math.max(a, Math.max(b, c));
        // System.out.println("max : " + max);
        // // Trouver le min
        // int min = Math.min(a, Math.min(b, c));
        // System.out.println("min : " + min);

        if(a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }

        if(a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else {
            min = c;
        }

    int[] array = {min, max};
    return Arrays.toString(array);
    }

    // ✅ okay
    // Vérification si la lettre est une voyelle ou une consonne
    public static void voyelleConsonne(char a) {
        // Liste des voyelles
        ArrayList<Character> voyelles = new ArrayList<>();
        voyelles.add('a');
        voyelles.add('e');
        voyelles.add('i');
        voyelles.add('o');
        voyelles.add('u');
        voyelles.add('y');

        // Comparaison
        if (voyelles.contains(Character.toLowerCase(a))) {
            System.out.println("the char is : 'v'\n");
        } else {
            System.out.println("the char is : 'c'\n");
        }
    }

    // ✅
    // Vérification bancaire
    public static void vérificationBancaire() {
        Scanner scanner = new Scanner(System.in);
        int solde = 1000;
        System.out.println("Bonjour ! Votre solde actuelle est de : " + solde + " euros.");
        System.out.println("Entrer le montant à retirer : ");
        int retrait = scanner.nextInt();
        if (retrait > solde) {
            System.out.println("Vous ne pouvez pas retirer cette somme, votre solde est de " + solde + " euros.");
        } else {
            solde -= retrait;
            System.out.println("Transaction réussie !");
            System.out.println("Votre nouveau solde est de " + solde + " euros.");
        }
        scanner.close();
    }

    /**
     * Taux de participation de l'employeur
     */
    public static void tauxParticipationEmployeur(Scanner scanner) {
        boolean continuer = true;

        do {
            // départ de la saisie
            System.out.println("--- Saisie d'information sur l'employé ---");
            System.out.println("Etat matrimonial (C pour célibataire, A pour autre situation) : ");
            char matrimonial = 'X'; // Valeur par défaut

            // Récupération et gestion de l'état matrimonial
            String matrimonialInput = scanner.nextLine().toUpperCase();
            if (!matrimonialInput.isEmpty()) {
                matrimonial = matrimonialInput.charAt(0);
            } else {
                System.out.println("Erreur : état matrimonial non valide.");
            }
            if (matrimonial == 'N') {
                System.out.println("Merci d'avoir utilisé notre service !");
                continuer = false;
            }

            if (matrimonial != 'C' && matrimonial != 'A') {
                System.out.println("Erreur : état matrimonial non valide.");
            }

            // Récupération donnée enfants
            System.out.println("Nombre d'enfants (ou entrez N pour quitter) : ");
            String caractèreEnfants = scanner.nextLine().toUpperCase();
            if (caractèreEnfants.equals("N")) {
                System.out.println("Merci d'avoir utilisé notre service !");
                continuer = false;
            }
            int enfants = 0;
            try {
                enfants = Integer.parseInt(caractèreEnfants);
                if (enfants < 0) {
                    System.out.println("Erreur : nombre d'enfants non valide.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erreur : nombre d'enfants non valide.");
            }

            // Récupération du salaire
            System.out.println("Salaire mensuel (ou entrez N pour quitter) : ");
            String salaireInput = scanner.nextLine().toUpperCase();
            if (salaireInput.equals("N")) {
                System.out.println("Merci d'avoir utilisé notre service !");
                continuer = false;
            }

            double salaire = 0;
            try {
                salaire = Double.parseDouble(salaireInput);
                if (salaire < 0) {
                    System.out.println("Erreur : salaire non valide.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erreur : salaire non valide.");
            }

            // Initialisation du taux
            double taux = 0.0; // Taux de base


            // Gestion du taux selon état matrimonial
            if (matrimonial == 'C') {
                taux += 0.2;
            } else if (matrimonial == 'A') {
                taux += 0.25;
            }

            // Gestion du taux selon le nombre d'enfants
            if (enfants > 0) {
                taux += 0.15 * enfants;
            }

            // Gestion du taux selon le salaire
            if (salaire <= 1800) {
                taux += 0.1;
            }

            // Gestion du maximum du taux
            if (taux >= 0.5) {
                System.out.printf("Le taux de participation de l'employeur est de : %.2f%%\n", 0.5 * 100);
            } else {
                System.out.printf("Le taux de participation de l'employeur est trop faible : %.2f%%\n", taux * 100);
            }

            // Gestion de fin de programme
            System.out.println("Souhaitez-vous effectuer le calcul pour un autre employé ? (O/N) : ");
            char charReponse = scanner.next().charAt(0);
            char reponse = Character.toUpperCase(charReponse);
            if (reponse == 'O') {
            } else if (reponse == 'N') {
                System.out.println("Merci d'avoir utilisé notre service !");
                continuer = false;
            } else {
                System.out.println("Erreur : réponse non valide.");
                continuer = false;
            }
        } while (continuer);
    }
}
