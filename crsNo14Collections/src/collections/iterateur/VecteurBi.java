package collections.iterateur;

import java.util.ArrayList;
import java.util.ListIterator;

public class VecteurBi {
    ArrayList<Integer> vecteur;

    public VecteurBi() {
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
        ListIterator<Integer> iterateur = vecteur.listIterator();

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

    //////////////////////
    public void addAfter(Integer elementInt, Integer elementToAdd) {
        ListIterator<Integer> iter = vecteur.listIterator();

        System.out.println("Ajoute après : " + elementInt + " la valeur " + elementToAdd);
        while (iter.hasNext()) {
            Integer i = iter.next();
            if (i.equals(elementInt))
                iter.add(elementToAdd);
        }
    }

    public void allerRetour() {
        ListIterator<Integer> iter = vecteur.listIterator();

        while (iter.hasNext()) {
            Integer i = iter.next();
            System.out.print(i + " ");
        }

        System.out.print("<-> ");
        while (iter.hasPrevious()) {
            Integer i = iter.previous();
            System.out.print(i + " ");
        }
    }

    public void remplacer(Integer oldValue, Integer newValue) {
        ListIterator<Integer> iter = vecteur.listIterator();

        System.out.println("Remplacer " + oldValue + " par " + newValue);
        while (iter.hasNext()) {
            Integer i = iter.next();
            if (i.equals(oldValue))
                iter.set(newValue);
        }
    }

    public static void main(String[] args) {
        VecteurBi vecteur = new VecteurBi();

        peupler(vecteur);
        System.out.println(vecteur);
        vecteur.supprime(100);
        System.out.println(vecteur);
        System.out.println("Il y a " + vecteur.nbEgale(20) + " valeur 20.");

        vecteur.addAfter(20, 19);
        System.out.println(vecteur);
        vecteur.remplacer(30, 99);
        System.out.println(vecteur);
        vecteur.allerRetour();
    }

    private static void peupler(VecteurBi vecteur) {
        vecteur.add(10);
        vecteur.add(20);
        vecteur.add(100);
        vecteur.add(20);
        vecteur.add(30);
    }
}
/*
affiche:
vecteur=[10, 20, 100, 20, 30]}
Supprime : 100
vecteur=[10, 20, 20, 30]}
Il y a 2 valeur 20.
Ajoute après : 20 la valeur 19
vecteur=[10, 20, 19, 20, 19, 30]}
Remplacer 30 par 99
vecteur=[10, 20, 19, 20, 19, 99]}
10 20 19 20 19 99 <-> 99 19 20 19 20 10
*/
