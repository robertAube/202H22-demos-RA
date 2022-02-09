package demoInterface;


public class Reel implements Affichable
{
    private float valeur;

    public Reel(float n)
    {
        valeur = n;
    }

    public float getValeur()
    {
        return valeur;
    }

    @Override
    public void afficher() {
        System.out.println("Réel = " + valeur);
    }
}