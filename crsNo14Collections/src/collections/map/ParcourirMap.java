package collections.map;

import java.util.*;
import java.util.stream.Collectors;

public class ParcourirMap {
    private Map<String, String> map = new HashMap<String, String>();
    private String[] mots = {"descriptif", "respectueux", "agressif", "millitaire", "cyrano"};


    public ParcourirMap() {
        renseigner();
        System.out.println("-parcourirMap_mapForEach :");
        parcourirMap_mapForEach();
        System.out.println("\n-parcourirMap_entrySetIterator() :");
        parcourirMap_entrySetIterator();
        System.out.println("\n-parcourirMap_foreach() :");
        parcourirMap_foreach();
        System.out.println("\n-parcourirMap_keySet() :");
        parcourirMap_keySet();
    }

    private void parcourirMap_mapForEach() {
        map.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });
    }

    private void parcourirMap_entrySetIterator() {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry) it.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    private void parcourirMap_foreach() {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    private void parcourirMap_keySet() {
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }

    private void renseigner() {
        for (int i = 0; i < mots.length; i++) {
            map.put(shuffle(mots[i]), mots[i]);
        }
    }

    String shuffle(String text) {

        List<Character> lCharacters = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            lCharacters.add(text.charAt(i));
        }
        Collections.shuffle(lCharacters);

        // convert in string
        String string = lCharacters.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        return string;
    }

    public static void main(String[] args) {
        new ParcourirMap();
    }
}

/**
 * -parcourirMap_mapForEach :
 * tereceuusxp -> respectueux
 * leimirlait -> millitaire
 * isafesgr -> agressif
 * feidicprst -> descriptif
 * ycoarn -> cyrano
 *
 * -parcourirMap_entrySetIterator() :
 * tereceuusxp -> respectueux
 * leimirlait -> millitaire
 * isafesgr -> agressif
 * feidicprst -> descriptif
 * ycoarn -> cyrano
 *
 * -parcourirMap_foreach() :
 * tereceuusxp -> respectueux
 * leimirlait -> millitaire
 * isafesgr -> agressif
 * feidicprst -> descriptif
 * ycoarn -> cyrano
 *
 * -parcourirMap_keySet() :
 * tereceuusxp -> respectueux
 * leimirlait -> millitaire
 * isafesgr -> agressif
 * feidicprst -> descriptif
 * ycoarn -> cyrano
 */
