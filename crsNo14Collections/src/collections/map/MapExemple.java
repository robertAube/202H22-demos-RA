package collections.map;

import java.util.*;

public class MapExemple {
    HashMap<String, String> map;
    Set<Map.Entry<String, String>> ens;
    Iterator<Map.Entry<String, String>> iter;

    public MapExemple() {
        map = new HashMap<String, String>();
        ens = map.entrySet();
        peupler();
    }

    private void peupler() {
        map.put("c", "10");
        map.put("f", "20");
        map.put("k", "30");
        map.put("x", "40");
        map.put("p", "50");
        map.put("g", "60");
    }

    public void ajouter(String cle, String val) {
        map.put(cle, val);
    }

    public String toString() {
        String s = "";
        iter = ens.iterator();

        while (iter.hasNext()) {
            s += (iter.next() + " ");
        }

        s += "\n";

        return s;
    }

    /**
     * Pour obtenir facilement les clés d'une Map, on passe par un ensemble
     *
     * @return les clés de l'ensemble
     */
    public Set<String> lesCles() {
        Set<String> cles = map.keySet(); // attention, ici Set
        return cles;
    }

    /**
     * Pour obtenir facilement les valeurs d'une Map, on passe par une
     * collection
     *
     * @return les valeurs de la collection
     */
    public Collection<String> lesValeurs() {
        Collection<String> valeurs = map.values(); // Collection, pas Set
        return valeurs;
    }

    public String trouverValeur(String cle) {
        return map.get(cle);
    }

    public String supprimerCle(String cle) {
        // supprimer la valeur associé à la clé directement de la map
        // renvoie la valeur associé à la clé ou null si la clé est absente
        return map.remove(cle);
    }

    public void supprimerValeur(String valeur) {
        // supprimer la valeur on passe par la collection
        Collection<String> valeurs = map.values();
        valeurs.remove(valeur);
    }

    public static void main(String args[]) {
        MapExemple map1 = new MapExemple();
        System.out.println("map initial =" + map1);

        // retrouver la valeur associee a la cle "f"

        System.out.println("valeur associee a f : " + map1.trouverValeur("f"));

        // ensemble des valeurs
        System.out.println("liste des valeurs initiales :" + map1.lesValeurs());
        map1.supprimerValeur("60"); // on supprime la valeur 60
        System.out.println("liste des valeurs apres sup : " + map1.lesValeurs());

        System.out.println();
        // ensemble des cles
        System.out.println("liste des cles initiales :    " + map1.lesCles());
        System.out.println(map1.supprimerCle("z")); // on supprime la cle "p"
        System.out.println("liste des cles apres sup :    " + map1.lesCles());

        // modification de la valeur associée a la clé x
        // par l'ajout
        System.out.println("liste des valeurs avant modif de x : " + map1);
        map1.ajouter("x", "75");
        System.out.println("liste des valeurs apres modif de x : " + map1);

        // suppression de valeurs et clés

        System.out.println("map avant sup element  20 :   " + map1);
        map1.supprimerValeur("20");
        System.out.println("map avant apres element  20 :   " + map1);

        // on supprime l'element de cle "k"

        System.out.println("map avant suppression k :        " + map1);
        map1.supprimerCle("k");
        System.out.println("liste des cles apres suppression : " + map1.lesCles());
        System.out.println("liste des valeurs apres supp: " + map1.lesValeurs());
    }
}
