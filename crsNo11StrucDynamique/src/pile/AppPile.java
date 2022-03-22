package pile;

public class AppPile {
    public AppPile() {
        testPileDynamique();
    }

    private void testPile() {
        int tab[] = {1, 2, 3};
        IPile p = new PileArrayList();

        for (int valeur : tab) {
            p.empiler(valeur);
        }

        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.println(p.depiler() + " = " + tab[i]);
        }
    }


    private void testPileDynamique() {
        int tab[] = {1, 2, 3};
        IPile p = new PileArrayList();

        System.out.println(getPileSize(p));
        for (int valeur : tab) {
            p.empiler(valeur);
        }
        System.out.println(getPileSize(p));

        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.println(p.depiler() + " = " + tab[i]);
        }
        System.out.println(getPileSize(p));
    }

    public static int getPileSize(IPile pile) {
        int nbElement = 0;
        IPile pileTempo = new PileArrayList();
        while (!pile.estVide()) {
            pileTempo.empiler(pile.depiler());
            nbElement++;
        }
        while (!pileTempo.estVide()) {
            pile.empiler(pileTempo.depiler());
        }

        return nbElement;
    }

    public static void main(String[] args) {
        new AppPile();
    }
}
