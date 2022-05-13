package etudiants;

import java.util.regex.Pattern;

/**
 * @author Robert Aubé
 * @version 1.0 (Date de création: 2022-05-05)
 */
public class Etudiant implements Comparable<Etudiant>{
    public static final int LGR_NODA = 7;
    public static final int NOTE_MIN = 0;
    public static final int NOTE_MAX = 100;


    private int noDA;
    private String nom;
    private float note;

    public Etudiant(int noDA, String nom, float note) {
        setNoDA(noDA);
        setNom(nom);
        setNote(note);
    }

    public int getNoDA() {
        return noDA;
    }

    public void setNoDA(int noDA) {
        if (validerNoDA(noDA)) {
            this.noDA = noDA;
        }
        else
            throw new IllegalArgumentException("DA invalide : " + noDA);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (validerNom(nom)) {
            this.nom = nom.trim();
        }
        else
            throw new IllegalArgumentException("Nom invalide : " + nom);
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        if (validerNote(note)) {
            this.note = note;
        }
        else
            throw new IllegalArgumentException("Note invalide : " + note);
    }

    public static boolean validerNoDA(int pNoDA) {
        return (String.valueOf(pNoDA).length() == LGR_NODA); //moyen comme validation... 0123456 ne marche pas.
    }

    public static boolean validerNom(String nom) {
        String regPattern;
        if (nom == null)
            return false;

        regPattern = "[a-zA-ZàâäçéèêëîïôöùûüÿZÀÂÄÇÉÈÊËÎÏÔÖÙÛÜŸ]"; //Premier caractère est une lettre
        regPattern += "[a-zA-ZàâäçéèêëîïôöùûüÿZÀÂÄÇÉÈÊËÎÏÔÖÙÛÜŸ\\-\\'\\s]{1,}"; //Les suivants sont des caractères ou des caractères de séparation " ", "'", "-", au moins 1 fois
        regPattern += "[a-zA-ZàâäçéèêëîïôöùûüÿZÀÂÄÇÉÈÊËÎÏÔÖÙÛÜŸ]"; //Se termine par un caractère

        return Pattern.matches(regPattern, nom.trim());
    }

    public static boolean validerNote(double note) {
        return (NOTE_MIN <= note && note <= NOTE_MAX);
    }

    @Override
    public String toString() {
        return "\n" +
                "noDA=" + noDA +
                ", nom='" + nom + '\'' +
                ", note=" + note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Etudiant etudiant = (Etudiant) o;

        if (noDA != etudiant.noDA) return false;
        if (Float.compare(etudiant.note, note) != 0) return false;
        return nom != null ? nom.equals(etudiant.nom) : etudiant.nom == null;
    }

    @Override
    public int hashCode() {
        int result = noDA;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (note != +0.0f ? Float.floatToIntBits(note) : 0);
        return result;
    }

    @Override
    public int compareTo(Etudiant etudiant) {
        return Float.compare(note, etudiant.note);
    }
}
