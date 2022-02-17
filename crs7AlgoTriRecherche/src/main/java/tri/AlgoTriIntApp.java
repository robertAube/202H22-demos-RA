package tri;

import java.util.Arrays;

public class AlgoTriIntApp {
    public AlgoTriIntApp() {
 //       testerGetMinIndice();
        testerTriSelection();
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
        int[] tab = {1, 12, 4, 5, 93, 21, 8, 11};


        System.out.println("Avant le tri par insertion");
        System.out.println(Arrays.toString(tab));

        //trie un tableau en utilisant le tri par sélection
        AlgoTriInt.triSelection(tab);

        System.out.println("Apres le tri par insertion");
        System.out.println(Arrays.toString(tab));
    }

    public static void main(String[] args) {
        new AlgoTriIntApp();
    }
}
