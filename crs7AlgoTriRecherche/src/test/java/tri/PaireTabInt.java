package tri;

import java.util.Arrays;

public class PaireTabInt {
    private int [] tab1;
    private int [] tab2;

    public PaireTabInt(int[] tab1, int[] tab2) {
        this.tab1 = tab1;
        this.tab2 = tab2;
    }

    public int[] getTab1() {
        return tab1;
    }

    public int[] getTab2() {
        return tab2;
    }

    public boolean memeLongueur() {
        return (tab1.length == tab2.length);
    }

    public boolean memeTableau() {
        return (tab1 == tab2);
    }

    public boolean sontDesTableauxEgaux() {
        boolean estPareil = true;

        if (!memeTableau()) {
            if (memeLongueur()) {
                for (int i = 0; i < tab1.length && estPareil; i++) {
                    if (tab1[i] != tab2[i]) {
                        estPareil = false;
                    }
                }
            }
        }

        return estPareil;
    }

    @Override
    public String toString() {
        return "(" +
                Arrays.toString(tab1) +
                ", " + Arrays.toString(tab2) +
                ")";
    }
}
