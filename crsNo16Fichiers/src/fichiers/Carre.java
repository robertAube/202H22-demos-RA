package fichiers;

import java.io.Serializable;

public class Carre implements Serializable {
    private static final long serialVersionUID = -4493607023711764713L;

    private static final String COULEUR_R = "Rouge";

    private String couleur;
    private String nom;
    private int cote;

    public Carre(int c) {
        if (validerCarre(c)) {
            couleur = COULEUR_R;
            nom = "carré";
            cote = c;
        }
    }

    private boolean validerCarre(int c) {
        return c >= 1 && c <= 20;
    }

    public int getCote() {
        return cote;
    }

    public String getNom() {
        return nom;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCote(int c) {
        if (validerCarre(c)) {
            cote = c;
        }
    }

    public void setCouleur(String couleur) {
        if (couleur.equals("Rouge") || couleur.equals("Vert")
                || couleur.equals("Bleu") || couleur.equals("Jaune"))
            this.couleur = couleur;
    }

    public long surface() {
        return cote * cote;
    }

    @Override
    public String toString() {
        return "Carre{" +
                "couleur='" + couleur + '\'' +
                ", nom='" + nom + '\'' +
                ", cote=" + cote +
                '}';
    }
}
