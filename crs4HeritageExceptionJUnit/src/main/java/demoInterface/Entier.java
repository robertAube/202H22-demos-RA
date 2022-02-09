package demoInterface;

import java.io.Serializable;

public class Entier implements Affichable, Serializable
{
    private int valeur;

    public Entier(int n)
    {
        valeur = n;
    }

    public int getValeur()
    {
        return valeur;
    }

    @Override
    public void afficher() {
        System.out.println("Entier = " + valeur);
    }
}