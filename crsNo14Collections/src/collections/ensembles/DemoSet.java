package collections.ensembles;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {
    Set<Integer> ensemble;

    public DemoSet() {
        ensemble = new HashSet<Integer>();
        boolean enleve;
        Integer cinq;
        int[] tab = {2, 5, 6, 2, 5, 8, 9, 5};

        ajouter(tab);

        System.out.println("ensemble = " + ensemble);

        // On supprime un eventuel objet de valeur Integer(5)
        cinq = new Integer(5);
        enleve = ensemble.remove(cinq);

        if (enleve)
            System.out.println("On a supprimé " + cinq);

        System.out.println("ensemble = " + ensemble);

        // On teste la presence de Integer(5)
        if (!ensemble.contains(cinq))
            System.out.println("On ne trouve pas " + cinq);

        System.out.println("ensemble = " + ensemble);
    }

    public void ajouter(int[] t) {
        // / On ajoute des objets de type Integer
        boolean ajoute = true;
        String strAjoute = "";
        String strDejaPresent = "";

        for (int i = 0; i < t.length; i++) {
            ajoute = ensemble.add(t[i]);

            if (ajoute)
                strAjoute += t[i] + " ";
            else
                strDejaPresent += t[i] + " ";
        }
        System.out.println("Les ajoutés = " + strAjoute);
        System.out.println("Les déjà présents = " + strDejaPresent);
    }

    @Override
    public String toString() { //Pourrait être fait avec un itérateur
        return "DemoSet{" +
                "ensemble=" + ensemble +
                '}';
    }

    public static void main(String args[]) {
        new DemoSet();
    }
}