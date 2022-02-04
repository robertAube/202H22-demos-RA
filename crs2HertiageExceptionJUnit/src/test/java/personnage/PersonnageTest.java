package personnage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonnageTest {

    @Test
    void ajouterPtsVie() {
        Personnage p = new Personnage("Tommy");

        p.setPointsDeVie(20);
        p.ajouterPtsVie(10);

        assertEquals(30, p.getPointsDeVie());
    }

    @Test
    void setPointsDeVie() {
        Personnage p = new Personnage("Tommy");

        p.setPointsDeVie(20);

        assertEquals(20, p.getPointsDeVie());
    }
}