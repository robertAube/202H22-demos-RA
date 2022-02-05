package personnage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonnageTest {

    @Test
    void pointDeVieValide_lance_une_exception_si_pointDEVIE_est_invalide() {
        assertThrows(IllegalArgumentException.class, () -> System.out.println("Test qui ne marche pas : il n'y a pas d'exception lancée")); //Test qui ne marche pas : aucune exception n'est lancé par le code
    }

    @Test
    void pointDeVieValide_lance_une_exception_si_pointDEVIE_est_invalide2() {
        assertThrows(IllegalArgumentException.class, () -> { //Test qui ne marche pas : ArithmeticException est lancé, mais on affirme que c'est une IllegalArgumentException qui doit être attrappé
            System.out.println("division par 0");
            int a = 2/0;
        });
    }

    @Test
    void pointDeVieValide_lance_une_exception_si_pointDEVIE_est_invalide3() {
        assertThrows(IllegalArgumentException.class, () -> {
            Personnage.estPointDeVieValide(-1); //bon test qui passe: estPointDeVieValide doit lancer une exception si pointDeVieValide est négatif
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Personnage.estPointDeVieValide(101); //bon test qui passe: estPointDeVieValide doit lancer une exception si pointDeVieValide > 100
        });
    }

    @Test
    void ajouterPtsVie() {
        Personnage p = new Guerrier("Tommy");

        p.setPointsDeVie(20);
        p.ajouterPtsVie(10);

        assertEquals(30, p.getPointsDeVie());
    }

    @Test
    void setPointsDeVie() {
        Personnage p = new Guerrier("Tommy");

        p.setPointsDeVie(20);

        assertEquals(20, p.getPointsDeVie());
    }
}