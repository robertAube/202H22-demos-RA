package etudiants;

/**
 * @author Robert Aubé
 * @version 1.0 (Date de création: 2022-05-05)
 */
public class ListeEtudiantTest {
    private ListeEtudiants listeEtudiants;
    public ListeEtudiantTest() {
        listeEtudiants = new ListeEtudiants();

        listeEtudiants.lireEtudiants();
        listeEtudiants.trier();
        System.out.println(listeEtudiants.toString());
        listeEtudiants.ajouterANote(10);
        listeEtudiants.ecrireEtudiants();
    }

    public static void main(String[] args) {
        new ListeEtudiantTest();
    }
}
