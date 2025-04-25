package fr.apfa;

public class LuhnAlgorithm {

    // Le cahier des charges demandait un entier long en entrée
    // Eviter les noms de variables style tmp
    // ✅ checked

    /**
     * Algorithme de Luhn
     * On souhaite retrouver la somme de chaque chiffre donné sachant que,
     * on partant de droite, il faudra multiplié par 2 tout les chiffres
     * en seconde position
     * On devra retrouver "True" si le résultat est un multiple de 10
     * 
     * @param cb
     * @return boolean
     */
    public static boolean algorithmeLuhn(String cb) {

        cb = cb.replaceAll(" ", "");
        int total = 0;
        int tmp = 1;

        for (int i = cb.length() - 1; i >= 0; i--) {
            if (tmp % 2 == 0) {
                int sum = 0;
                int number = (Character.getNumericValue(cb.charAt(i))) * 2;
                while (number > 9) {
                    int digit = number % 10;
                    sum += digit;
                    number /= 10;
                }
                total += sum + number;
            } else {
                total += Character.getNumericValue(cb.charAt(i));
            }

            tmp++;
        }

        if (total % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
