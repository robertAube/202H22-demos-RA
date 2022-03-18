package collections.lesListes;

import java.util.*;

public class ExListe {
    ArrayList<Integer> vecteur;
    List<Integer> liste;

    public ExListe() {
        vecteur = new ArrayList<Integer>();
        liste = new LinkedList<Integer>();

        liste.add(3);

        vecteur.add(1);
        vecteur.add(3);
        vecteur.add(10);
        vecteur.add(5);
        vecteur.add(2);

        liste = new LinkedList<Integer>(vecteur);
    }
}
