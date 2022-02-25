package Pile;

public class AppPile {
    public AppPile() {
        testPile();
    }

    private void testPile() {
        int tab[] = {1, 2, 3};
        Pile p = new Pile();



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
