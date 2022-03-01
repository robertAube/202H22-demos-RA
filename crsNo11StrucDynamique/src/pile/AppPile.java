package pile;

public class AppPile {
    public AppPile() {
        testPileDynamique();
    }

    private void testPile() {
        int tab[] = {1, 2, 3};
        IPile p = new PileArrayList();

        for (int valeur: tab) {
            p.empiler(valeur);
        }

        for (int i = tab.length -1 ; i >= 0; i--) {
            System.out.println(p.depiler() + " = " + tab[i]);
        }
    }


    private void testPileDynamique() {
        int tab[] = {1, 2, 3};
        IPile p = new PileDynamique();

        for (int valeur: tab) {
            p.empiler(valeur);
        }

        for (int i = tab.length -1 ; i >= 0; i--) {
            System.out.println(p.depiler() + " = " + tab[i]);
        }
    }

    public static void main(String[] args) {
        new AppPile();
    }
}
