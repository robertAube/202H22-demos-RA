package array;

import java.util.Arrays;
import java.util.Comparator;

public class TrierMotsPhrase {
    private String phrase;
    private String [] mots;
    public TrierMotsPhrase(String phrase) {
        this.phrase = phrase;

        mots = this.phrase.split(" ");

        afficherMots();

        Arrays.sort(mots, Comparator.reverseOrder());

        afficherMots();
    }

    private void afficherMots() {
        System.out.println(Arrays.toString(mots));
    }

    public static void main(String[] args) {
        new TrierMotsPhrase("Le petit chat est blanc");
    }
}
