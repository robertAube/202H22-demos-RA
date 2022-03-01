package pile;

public class PileDynamique implements IPile {
    private NoeudPile sommet;

    public PileDynamique() {
        this.sommet = null;
    }

    @Override
    public void empiler(int valeur) {
        NoeudPile noeud = new NoeudPile(valeur, sommet);
        sommet = noeud;
    }

    @Override
    public int depiler() {
        int valeur = sommet.getData();
        sommet = sommet.getPrecedent();
        return valeur;
    }

    @Override
    public boolean estVide() {
        return this.sommet == null;
    }
}
