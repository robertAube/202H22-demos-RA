package recursivite;

public class Recursivite {

    public Recursivite() {
        //  compterCharTest();
        // fiboTest();
        // suiteTest();
        trouverValTest();
    }


    // recherche dichotomique **************************************************************
    private void trouverValTest() {
        int tab[] = {1, 3, 4, 7, 8, 9, 10};
        System.out.println(trouverVal(tab, 1) == 0);
        System.out.println(trouverVal(tab, 2) == -1);
        System.out.println(trouverVal(tab, 10) == 6);

        System.out.println(trouverVal(tab, 1));
    }

    /**
     * 7. Une fonction récursive qui retournera l'indice où se trouve un <b>entier recherché</b>
     * dans un tableau de N entiers triés en ordre croissant.
     * Utilisez la recherche dichotomique.
     *
     * @param tab          le tableau de recherche
     * @param valRecherche l'entier à trouver
     * @return l'indice de l'entier trouvé.
     */
    public static int trouverVal(int[] tab, int valRecherche) {
        int iTrouve = 0;
        iTrouve = rechercheDichotomique(tab, valRecherche, 0, tab.length - 1);
        return iTrouve;
    }
    /**
     * La fonction récursive de la précédente. Utilise la recherche dichotomique.
     *
     * @param tab un tableau d'entiers triés
     * @param valRecherche   l'entier à trouver
     * @param iDeb l'indice de début de l'intervale de recherche
     * @param iFin l'indice de fin de l'intervale de recherche
     * @return l'indice de l'entier trouvé ou -1 si pas trouvé
     */

    public static int rechercheDichotomique(int[] tab, int valRecherche, int iDeb, int iFin) {
        int iTrouve;
        int iMilieu;

        if (iDeb <= iFin) {
            iMilieu = (iDeb + iFin) / 2;
            if (valRecherche == tab[iMilieu]) {
                iTrouve = iMilieu;
            } else if (valRecherche < tab[iMilieu]) {
                iTrouve = rechercheDichotomique(tab, valRecherche, iDeb, iMilieu - 1);
            } else {
                iTrouve = rechercheDichotomique(tab, valRecherche, iMilieu + 1, iFin);
            }
        } else {
            iTrouve = -1;
        }

        return iTrouve;
    }


    private void suiteTest() {
        suite(3);
    }

    // suite 1, 2, 3, ……….N,……….3, 2, 1 **************************************************************

    /**
     * 8. Écrivez un algorithme et une fonction récursive qui écrira la suite:
     * 1 2 3 ... N ... 3 2 1
     *
     * @param n l'entier déterminant la suite à écrire
     */
    public static void suite(int n) {
        if (n >= 1) {
            suiteRec(1, n);
        }
    }

    private static void suiteRec(int i, int n) {
        if (i < n) {
            System.out.print(i + " ");
            suiteRec(i + 1, n);
        }
        System.out.print(i + " ");
    }


    private void fiboTest() {
        for (int i = 0; i < 7; i++) {
            System.out.println("fibo(" + i + ") = " + fibo(i));
        }
    }

    private int fibo(int i) {
        int r;
        if (i <= 1) {
            r = i;
        } else
            r = fibo(i - 1) + fibo(i - 2);
        return (r);
    }

    private void compterCharTest() {
        System.out.println(compterChar("Bonjour le monde", 'e'));
        System.out.println(compterChar("Bonjour le monde", 'O'));
        System.out.println(compterChar("Bonjour le monde", 'o'));
        System.out.println(compterChar("Bonjour le monde", 'B'));
        System.out.println(compterChar("", 'a'));
    }

    private int compterChar(String str, char car) {
        int nbCar = 0;
        if (str.isEmpty())
            nbCar = 0;
        else {
            if (str.charAt(0) == car) {
                nbCar = 1 + compterChar(str.substring(1), car);
            } else
                nbCar = 0 + compterChar(str.substring(1), car);
        }

        return nbCar;
    }

    public static void main(String[] args) {
        new Recursivite();
    }
}
