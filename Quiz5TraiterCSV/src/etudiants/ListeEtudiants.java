package etudiants;

import fichiers.GestionFichier;

import java.io.File;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * @author Robert Aubé
 * @version 1.0 (Date de création: 2022-05-05)
 */
public class ListeEtudiants {
    LinkedList<Etudiant> linkedlist;

    private static char fSep = File.separatorChar;
    private static String pathIn = System.getProperty("user.dir") + fSep + "etudiantsIn.csv";
    private static String pathOut = System.getProperty("user.dir") + fSep + "etudiantsOut.csv";


    public ListeEtudiants() {
        linkedlist = new LinkedList<Etudiant>();
    }

    public void lireEtudiants() {
        for (String ligne : GestionFichier.lireFichier(pathIn)) {
            add(ligne);
        }
    }

    public void ajouterANote(int noteAAjouter) {
        float note;
        for (Etudiant e : linkedlist) {
            note = e.getNote();
            if (noteAAjouter < 0) {
                note = Etudiant.validerNote(note + noteAAjouter) ? note + noteAAjouter : Etudiant.NOTE_MIN;
            } else {
                note = Etudiant.validerNote(note + noteAAjouter) ? note + noteAAjouter : Etudiant.NOTE_MAX;
            }
            e.setNote(note);
        }
    }

    public void ecrireEtudiants() {
        LinkedList<String> temp = new LinkedList<String>();
        String ligne;
        for (Etudiant e : linkedlist) {
            ligne = e.getNoDA() + ";";
            ligne += e.getNom() + ";";
            ligne += e.getNote();
            temp.add(ligne);
        }
        GestionFichier.ecrireFichier(temp.toArray(new String[temp.size()]), pathOut);
    }

    @Override
    public String toString() {
        return linkedlist.toString();
    }

    public void add(String ligne) {
        String[] str = ligne.split(";");
        Etudiant etudiant = new Etudiant(Integer.parseInt(str[0]), str[1], Float.parseFloat(str[2]));
        linkedlist.add(etudiant);
    }

    public void trier() {
        linkedlist.sort(Comparator.naturalOrder());
    }
}
