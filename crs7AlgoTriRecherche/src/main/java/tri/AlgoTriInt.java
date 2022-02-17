package tri;

public class AlgoTriInt {
    public static void triSelection(int[] tableau) {
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
    public static int trouverIMin(int[] tableau) {
        int minIndex = trouverIMin(tableau, 0);

        return minIndex;
    }


    /**
     * Trouver l'indice du nombre le plus petit à partir d'un indice.
     * @param tableau
     * @return indice du nombre le plus petit
     */
    public static int trouverIMin(int[] tableau, int iDebut) {
        int minIndex = iDebut;

        for (int i = iDebut + 1; i < tableau.length; i++) {
            if (tableau[i] < tableau[minIndex])
                minIndex = i;
        }

        return minIndex;
    }

    private static void permuter(int[] tableau, int i1, int i2) {
        int temp = tableau[i1];
        tableau[i1] = tableau[i2];
        tableau[i2] = temp;
    }
}
