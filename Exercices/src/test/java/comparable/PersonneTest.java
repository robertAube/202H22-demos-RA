package comparable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PersonneTest {
    private ArrayList<Personne> personnes;
    private Personne personne;

    @BeforeEach
    void setUp() {
        personnes = new ArrayList<>();
    }

    @Test
    void compareTo_return0_When_sameObject() {
        personnes.add(new Personne("DENIS", "Fortin"));
        personnes.add(new Personne("Louise", "Boulanger"));

        for (Personne p : personnes) {
            assertEquals(0, p.compareTo(p));
        }
    }
    @Test
    void compareTo_throwNullPointerException_When_compareToNull() {
        personne = new Personne("Denis", "Fortin");
        assertThrows(NullPointerException.class, () -> {personne.compareTo(null);});
    }

    @Test
    void compareTo_throwClassCastException_When_objectNotPersonne() {
        personne = new Personne("Denis", "Fortin");
        assertThrows(ClassCastException.class, () -> {personne.compareTo("Denis Fortin");});
    }

    @Test
    void compareTo_retourneUneValeurNegative_When_thisPlusPetitQueLArgument() {
        personne = new Personne("Denis", "Fortier");

        //Tous des arguments plus grand que personne :
        personnes.add(new Personne("Zac", "Zola"));
        personnes.add(new Personne("Denis", "Fortin"));
        personnes.add(new Personne("Denis", "FORTIN"));
        personnes.add(new Personne("DENIS", "Fortin"));
        personnes.add(new Personne("Pierre", "Fortin"));

        for (Personne p : personnes) {
            assertTrue(personne.compareTo(p) < 0);
            assertTrue(personne.compareTo(p) != 0);
        }
    }

    @Test
    void compareTo_retourneUneValeurNegative_When_thisPlusGrandQueLArgument() {
        personne = new Personne("Denis", "Fugain");

        //Tous des arguments plus petit que personne :
        personnes.add(new Personne("Adele", "Anctil"));
        personnes.add(new Personne("Denis", "Fortin"));
        personnes.add(new Personne("Denis", "FORTIN"));
        personnes.add(new Personne("DENIS", "Fortin"));
        personnes.add(new Personne("Pierre", "Fortin"));

        for (Personne p : personnes) {
            assertTrue(personne.compareTo(p) > 0);
            assertTrue(personne.compareTo(p) != 0);
        }
    }

    @Test
    void compareTo_retourne0_When_thisEgalLArgument() {
        personne = new Personne("Denis", "Fortin");

        //Tous des arguments plus petit que personne :
        personnes.add(new Personne("Denis", "Fortin"));
        personnes.add(new Personne("Denis", "FORTIN"));
        personnes.add(new Personne("DENIS", "Fortin"));

        for (Personne p : personnes) {
            assertTrue(personne.compareTo(p) == 0);
        }
    }
}