package tri;

import personnage.Personnage;

public class AlgoTriObjet {
    public static void triSelection(Comparable[] tableau) {
        int minIndex;
        for (int i = 0; i < tableau.length - 1; i++) {
            minIndex = trouverIMin(tableau, i);
            permuter(tableau, i, minIndex);
        }
    }

    /**
     * Trouver l'indice du nombre le plus petit
     * @param tableau
     * @return indice du nombre le plus petit
     */
    public static int trouverIMin(Comparable[] tableau) {
        int minIndex = trouverIMin(tableau, 0);

        return minIndex;
    }


    /**
     * Trouver l'indice du nombre le plus petit à partir d'un indice.
     * @param tableau
     * @return indice du nombre le plus petit
     */
    public static int trouverIMin(Comparable[] tableau, int iDebut) {
        int minIndex = iDebut;

        for (int i = iDebut + 1; i < tableau.length; i++) {
            if (tableau[i].compareTo(tableau[minIndex]) < 0)
                minIndex = i;
        }

        return minIndex;
    }

    private static void permuter(Comparable[] tableau, int i1, int i2) {
        Comparable temp = tableau[i1];
        tableau[i1] = tableau[i2];
        tableau[i2] = temp;
    }
}
