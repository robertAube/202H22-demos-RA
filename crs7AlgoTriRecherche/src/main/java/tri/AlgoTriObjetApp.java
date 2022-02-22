package tri;

import personnage.Guerrier;
import personnage.Personnage;
import personnage.Sorcier;

import java.util.Arrays;

public class AlgoTriObjetApp {
    public AlgoTriObjetApp() {
        //       testerGetMinIndice();
        testerTriSelection();
        testerTriSelectionClasseEnveloppeInteger();
    }

    private void testerGetMinIndice() {
        int[] tab = {1, 12, 4, 5, 93, 21, 8, 11};
        int[] tab2 = {12, 4, 5, 93, 21, 8, 1};

        System.out.println("tableau : ");
        System.out.println(Arrays.toString(tab));
        System.out.println("Le minimum est " + AlgoTriInt.trouverIMin(tab));

        System.out.println("tableau : ");
        System.out.println(Arrays.toString(tab2));
        System.out.println("Le minimum est " + AlgoTriInt.trouverIMin(tab2));

    }

    private void testerTriSelection() {
        Personnage[] tab = {new Guerrier("César"), new Guerrier("Zidane"), new Sorcier("Harry")};


        System.out.println("Avant le tri par insertion");
        System.out.println(Arrays.toString(tab));

        //trie un tableau en utilisant le tri par sélection
        AlgoTriObjet.triSelection(tab);

        System.out.println("Apres le tri par insertion");
        System.out.println(Arrays.toString(tab));
    }

    private void testerTriSelectionClasseEnveloppeInteger() {
        Integer[] tab = {new Integer(1), new Integer(12), new Integer(4), new Integer(5), new Integer(93), new Integer(21)};


        System.out.println("Avant le tri par insertion");
        System.out.println(Arrays.toString(tab));

        //trie un tableau en utilisant le tri par insertion
        AlgoTriObjet.triSelection(tab);

        System.out.println("Apres le tri par insertion");
        System.out.println(Arrays.toString(tab));
    }

    public static void main(String[] args) {
        new AlgoTriObjetApp();
    }
}
