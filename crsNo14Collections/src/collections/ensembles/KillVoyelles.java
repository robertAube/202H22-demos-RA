package collections.ensembles;

import java.util.HashSet;
import java.util.Set;

public class KillVoyelles {
    Set<Character> lettres;
    Set<Character> voyelles;

    public KillVoyelles(String phrase) {
        initSets(phrase, "aàeéèêëiouùy");
    }

    public Set<Character> getLettres() {
        return lettres;
    }

    public void initSets(String phrase, String voy) {
        lettres = new HashSet<Character>();
        voyelles = new HashSet<Character>();
        for (int i = 0; i < phrase.length(); i++)
            lettres.add(phrase.charAt(i));

        for (int i = 0; i < voy.length(); i++)
            voyelles.add(voy.charAt(i));
    }

    public void effaceVoyelles() {
        lettres.removeAll(voyelles);
    }

    public static void main(String args[]) {
        String phrase = "mais ou est donc car ni or";

        KillVoyelles voyelle = new KillVoyelles(phrase);
        System.out.println("lettres presentes : " + voyelle.getLettres());
        voyelle.effaceVoyelles();
        System.out.println("lettres sans les voyelles : " + voyelle.getLettres());
    }
}

