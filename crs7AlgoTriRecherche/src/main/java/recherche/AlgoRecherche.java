package recherche;

public class AlgoRecherche {

    /**
     * Permet de faire une recherche séquentielle dans un tableau d'entiers
     *
     * @param tab       un tableau d'entiers
     * @param valToFind l'entier recherché dans le tableau
     * @return indice de l'entier trouvé dans le tableau
     * ou -1 si l'entier n'est pas trouvé
     */
    public static int rechercheDichotomique(int[] tab, int valToFind) {
        int idxRetour = -1;
        int iInf = 0;
        int iSup = tab.length - 1;
        int iMilieu = 0;

        while ((iInf <= iSup) && (idxRetour == -1)) {
            iMilieu = (iInf + iSup) / 2;

            System.out.println(iInf + " " + iSup + " " + iMilieu);

            // On a dépassé la valeur
            if (tab[iMilieu] > valToFind) {
                iSup = iMilieu - 1;
            } else {
                // Il y a encore des valeurs plus grandes
                if (tab[iMilieu] < valToFind) {
                    iInf = iMilieu + 1;
                }
                // On a trouvé
                else {
                    idxRetour = iMilieu;
                    System.out.println(idxRetour);
                }
            }
        }

        System.out.println(iInf + " " + iSup + " " + iMilieu);

        return idxRetour;
    }


    /**
     * Permet de faire une recherche séquentielle dans un tableau d'entiers
     *
     * @param tab       un tableau d'entiers
     * @param valToFind l'entier recherché dans le tableau
     * @return indice de l'entier trouvé dans le tableau
     * ou -1 si l'entier n'est pas trouvé
     */
    public static int rechercheSequentielle(int[] tab, int valToFind) {
        int idxRetour = -1;
        for (int i = 0; i < tab.length && idxRetour == -1; i++) {
            if (tab[i] == valToFind) {
                idxRetour = i;
            }
        }

        return idxRetour;
    }

    /**
     * Permet de faire une recherche séquentielle dans un tableau d'entiers
     *
     * @param tab       un tableau d'entiers
     * @param valToFind l'entier recherché dans le tableau
     * @return indice de l'entier trouvé dans le tableau
     * ou -1 si l'entier n'est pas trouvé
     */
    public static int rechercheSequentielleDsTabTrie(int[] tab, int valToFind) {
        int idxRetour = -1;
        boolean valToFindEstDepasse = false;
        for (int i = 0; i < tab.length && idxRetour == -1 && !valToFindEstDepasse; i++) {
            if (tab[i] == valToFind) {
                idxRetour = i;
            } else if (tab[i] > valToFind) {
                valToFindEstDepasse = true;
            }
        }

        return idxRetour;
    }
}
