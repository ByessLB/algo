package fr.apfa;

import java.util.ArrayList;
import java.util.Collections;

public class Pyramide {
    public static void main(String[] args) {

        pyramideIsocele(4);
    }

    // ✅ well done!
    /**
     * <h3>Pyramide rectangle</h3>
     * 
     * @param n
     * @return array pyramide
     */
    public static void pyramideRectangle(int n) {
        int index = 1;
        char etoile = '*';
        String result = "";
        ArrayList<String> element = new ArrayList<>();

        while (index <= n) {

            result += etoile;
            element.add(result);
            index++;
        }

        for (String elmt : element) {
            System.out.println(elmt);
        }
    }

    // ✅ well done!
    /**
     * <h3>Pyramide Isocèle</h3>
     * 
     * @param n
     */
    public static void pyramideIsocele(int n) {
        int index = 1;
        char etoile = '*';
        String result = "";
        ArrayList<String> element = new ArrayList<>();

        while (index <= n) {
            result += etoile;
            element.add(result);
            index++;
        }

        //
        ArrayList<String> tmpArray = new ArrayList<>(element);
        Collections.reverse(tmpArray);
        if (!tmpArray.isEmpty()) {
            tmpArray.remove(0);
        }
        element.addAll(tmpArray);

        for (String elmt : element) {
            System.out.println(elmt);
        }
    }
}
