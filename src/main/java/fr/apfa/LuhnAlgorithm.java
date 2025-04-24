package fr.apfa;

public class LuhnAlgorithm {

    public static void main(String[] args) {




    }

    public static boolean algorithmeLuhn(String cb) {

        cb = cb.replaceAll(" ","");
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
