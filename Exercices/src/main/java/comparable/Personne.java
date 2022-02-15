package comparable;

import java.util.Locale;

/**
 * Illustration de compareTo
 *
 * @author Robert Aubé
 */
public class Personne implements Comparable<Personne> { //<>
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


//    @Override
//    public int compareTo(Object o) {
//        int iCompare = 0;
//        String sCourant = this.nom + this.prenom;
//        String sParam = ((Personne)o).nom + ((Personne)o).prenom;
//
//        iCompare = sCourant.compareToIgnoreCase(sParam);
//        return iCompare;
//    }


    @Override
    public int compareTo(Personne personne) {
        int iCompare = 0;
        String sCourant = this.nom + this.prenom;
        String sParam =  personne.nom + personne.prenom;

        iCompare = sCourant.compareToIgnoreCase(sParam);
        return iCompare;
    }


    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
//    @Override
//    public int compareTo(Object o) {
//        String sCourant = this.nom + this.prenom;
//        String sParam = ((Personne)o).nom + ((Personne)o).prenom;
//
//        int iCompare = 0;
//
//        if (sCourant.length() < sParam.length())
//            iCompare = -1;
//        else if (sCourant.length() > sCourant.length())
//                    iCompare = 1;
//
//        return iCompare;
//    }


}
