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

    @Override
    public String toString() {
        return "ExListe{" +
                "vecteur=" + vecteur +
                ", liste=" + liste +
                '}';
    }

    public static void main(String[] args) {
        ExListe exemple = new ExListe();

        System.out.println(exemple);
    }
}
