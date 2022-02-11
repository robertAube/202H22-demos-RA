package comparable;

/**
 * Illustration de compareTo
 *
 * @author Robert Aubé
 */
public class Personne  {
    private String prenom, nom;

    public Personne(String prenom, String nom) throws NullPointerException {
        if (validerNom(prenom, nom)) {
            this.prenom = prenom;
            this.nom = nom;
        } else
            throw new NullPointerException("Le nom et le prénom doit contenir des caractères");
    }

    private boolean validerNom(String prenom, String nom) {
        return (prenom != null && nom != null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Personne personne = (Personne) o;

        if (prenom != null ? !prenom.equals(personne.prenom) : personne.prenom != null) return false;
        return nom != null ? nom.equals(personne.nom) : personne.nom == null;
    }

    public String toString() {
        return prenom + " " + nom;
    }

}
