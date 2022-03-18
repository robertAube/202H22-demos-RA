package collections.iterateur;

import java.util.*;

public class VecteurUni {
    ArrayList<Integer> vecteur;

    public VecteurUni() {
        vecteur = new ArrayList<Integer>();
    }

    public void add(int i) {
        vecteur.add(i);
    }

    public int nbEgale(int i) {
        int nb = 0;
        for (int element : vecteur) {
            if (element == i)
                nb++;
        }
        return nb;
    }

    public void supprime(Integer elementInt) {
        Iterator<Integer> iterateur = vecteur.iterator();

        System.out.println("Supprime : " + elementInt);
        while (iterateur.hasNext()) {
            Integer i = iterateur.next();
            if (i.equals(elementInt))
                iterateur.remove();
        }
    }

    @Override
    public String toString() {
        return "vecteur=" + vecteur;
    }

    public static void main(String[] args) {
        VecteurUni vecteur = new VecteurUni();

        peupler(vecteur);
        System.out.println(vecteur);
        vecteur.supprime(new Integer(100));
        System.out.println(vecteur);
        System.out.println("Il y a " + vecteur.nbEgale(20) + " valeur 20.");
    }

    private static void peupler(VecteurUni vecteur) {
        vecteur.add(10);
        vecteur.add(20);
        vecteur.add(100);
        vecteur.add(20);
        vecteur.add(30);
    }
}
/*
affiche:
vecteur=[10, 20, 100, 20, 30]
Supprime : 100
vecteur=[10, 20, 20, 30]
Il y a 2 valeur 20.
*/
