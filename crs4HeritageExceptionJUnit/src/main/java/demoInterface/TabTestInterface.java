package demoInterface;

public class TabTestInterface {
    public static void main(String[] args) {
        Affichable[] tab = new Affichable[3];

        tab[0] = new Entier(25);
        tab[1] = new Reel (1.25f);
        tab[2] = new Entier(42);

        for (int i = 0; i < tab.length; i++)
            tab[i].afficher();
    }
}
