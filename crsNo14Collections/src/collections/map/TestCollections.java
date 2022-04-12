package collections.map;

import java.util.*;

public class TestCollections {
    private String couleurs[] = {"rouge", "blanc", "bleu"};

    /**
     * Créer un ArrayList, y ajouter des objets et les manipuler.
     */
    public TestCollections() {
        ArrayList<String> aListe = new ArrayList<String>();
        LinkedList<String> liste = new LinkedList<String>();

        // Ajouter des oouleurs au tableau et à la liste.
        liste.add("rose");
        aListe.add("jaune");

        //Ajouter des chaînes de couleur au tableau et à la liste
        for (int compteur = 0; compteur < couleurs.length; compteur++) {
            liste.add(couleurs[compteur]);
            aListe.add(couleurs[compteur]);
        }
        // ajouter une couleur à la liste
        liste.add("mauve");

        // Afficher le contenu du tableau
        System.out.println("ArrayListe : ");
        System.out.println(aListe);

        //Afficher la liste
        System.out.println("\n LinkedList : ");
        System.out.println(liste);

        // Retirer tous les objets débutant par B dans le Array et par R dans la liste
        this.retirerLesB(aListe);
        this.retirerLesR(liste);

        // Afficher le contenu du tableau et de la liste
        System.out.println("\n\nArrayList et LinkedList après l'appel de manipuler : ");
        System.out.println(aListe);
        System.out.println(liste);

        System.out.println();
        //Diverses manipulations sur la liste avec la classe Colelctions
        System.out.println("Manipuler la liste avec la classe Collections");
        Collections.sort(liste);
        System.out.println("Tri Liste");
        System.out.println(liste);

        System.out.println();
        System.out.println("Ordre inverse");
        Collections.reverse(liste);
        System.out.println(liste);

        System.out.println();
        System.out.println("Permuter mauve avec blanc");
        Collections.swap(liste, 0, 2);
        System.out.println(liste);

        System.out.println();
        System.out.println("Remplir la liste avec juju");
        Collections.fill(liste, "juju");
        System.out.println(liste);
    }

    /**
     * Retirer les objets dont la couleur commence par la lettre R.
     */
    public void retirerLesR(Collection<String> collection) {
        // Obtenir un itérateur.
        Iterator<String> iterateur = collection.iterator();
        // Boucler tant que la collection comporte des éléments.
        while (iterateur.hasNext()) {
            String s = (String) iterateur.next();
            if (s.charAt(0) == 'r' || s.charAt(0) == 'R')
                iterateur.remove(); // retirer l'objet String
        }
    }

    /**
     * Retirer les objets dont la couleur commence par la lettre B.
     */
    public void retirerLesB(List<String> collection) {
        // Obtenir un itérateur.
        ListIterator<String> iterateur = collection.listIterator();
        // Boucler tant que la collection comporte des éléments.
        while (iterateur.hasNext()) {
            String s = (String) iterateur.next();
            if (s.charAt(0) == 'b' || s.charAt(0) == 'B')
                iterateur.remove(); // retirer l'objet String
        }
    }
    // Exécuter l'application.
    public static void main(String[] args) {
        new TestCollections();
    }
}
