package collections.map;

import java.util.*;

public class MapExemple {
    HashMap<String, String> map;
    Set<Map.Entry<String, String>> ens;
    Iterator<Map.Entry<String, String>> iter;

    public MapExemple() {
        map = new HashMap<>();
        ens = map.entrySet();
        remplir();
    }

    private void remplir() {
        map.put("c", "10");
        map.put("f", "20");
        map.put("k", "30");
        map.put("x", "40");
        map.put("p", "50");
        map.put("g", "60");
        map.put("g", "99"); //écrase 60 qui était associé à g
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
        return s;
    }

    /**
     * Pour obtenir facilement les clés d'une Map, on passe par un ensemble
     * @return les clés de l'ensemble
     */
    public Set<String> lesCles() {
        Set<String> cles = map.keySet(); // attention, ici Set
        return cles;
    }

    /**
     * Pour obtenir facilement les valeurs d'une Map, on passe par une
     * collection
     * @return les valeurs de la collection
     */
    public Collection<String> lesValeurs() {
        Collection<String> valeurs = map.values(); // Collection, pas Set
        return valeurs;
    }

    public String trouverValeur(String cle) {
        return map.get(cle);
    }

    public String supprimerParCle(String cle) {
        // supprimer la valeur associé à la clé directement de la map
        // renvoie la valeur associé à la clé ou null si la clé est absente
        return map.remove(cle);
    }

    public void supprimerParValeur(String valeur) {
        // supprimer la valeur, on passe par la collection
        Collection<String> valeurs = map.values();
        valeurs.remove(valeur);
    }

    public static void main(String args[]) {
        MapExemple map1 = new MapExemple();

        // retrouver la valeur associee a la cle "f"
        System.out.println("map initial : " + map1.toString());
        System.out.println("valeur associee a f : " + map1.trouverValeur("f"));

        // ensemble des valeurs
        System.out.println("liste des valeurs initiales : " + map1.lesValeurs());
        map1.supprimerParValeur("20"); // on supprime la valeur 20
        System.out.println("liste des valeurs après supression de 20 : " + map1.lesValeurs() + "\n");

        // ensemble des cles
        System.out.println("liste des cles initiales :  " + map1.lesCles());
        System.out.println("On enlève c. Valeur retournée : " + map1.supprimerParCle("c")); // on supprime la cle "x"
        System.out.println("liste des cles après supression par valeur de c :  " + map1.lesCles() + "\n");

        // modification de la valeur associée a la clé x par l'ajout
        System.out.println("liste des valeurs avant modif de x : " + map1.toString());
        map1.ajouter("x", "75");
        System.out.println("liste des valeurs après modif de x : " + map1 + "\n");

        // on supprime l'element de cle "k"
        System.out.println("map avant suppression k : " + map1);
        map1.supprimerParCle("k");
        System.out.println("liste des cles après suppression : " + map1.lesCles());
        System.out.println("liste des valeurs après suppression : " + map1.lesValeurs());
        System.out.println("liste des clé, valeurs : " + map1);
    }
}
