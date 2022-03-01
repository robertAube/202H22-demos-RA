package pile;

import java.util.ArrayList;

public class PileArrayList implements IPile {
    private int sommet = -1;
    private ArrayList<Integer> pile = new ArrayList<Integer>();
    @Override
    public void empiler(int valeur) {
        pile.add(valeur);
        sommet++;
    }

    @Override
    public int depiler() {
        int valeurDepile;
        if (estVide()) {
            throw new ArrayIndexOutOfBoundsException("Pile est vide");
        }
        valeurDepile = pile.remove(sommet--);

        return valeurDepile;
    }

    @Override
    public boolean estVide() {
        return sommet == -1;
    }
}
