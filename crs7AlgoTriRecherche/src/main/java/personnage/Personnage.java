package personnage;

//Une classe abstraite ne peut pas être instancier
public abstract class Personnage implements Comparable<Personnage> {
    private String nom;
    private int pointsDeVie;

    public Personnage(String nom) {
        this.nom = nom;
        this.pointsDeVie = 100;
    }

    public void ajouterPtsVie(int nbPts) {
        setPointsDeVie(getPointsDeVie() + nbPts);
    }

    public abstract void saluer() ;

    public static boolean estPointDeVieValide(int pointsDeVie) {
        if (!(0 <= pointsDeVie && pointsDeVie <= 100))
            throw new IllegalArgumentException("Point de vie invalide " + pointsDeVie);
        return true;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "nom='" + nom + '\'' +
                ", pointsDeVie=" + pointsDeVie +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        if (estPointDeVieValide(pointsDeVie))
            this.pointsDeVie = pointsDeVie;
    }

    @Override
    public int compareTo(Personnage personnage) {
        return this.nom.compareToIgnoreCase(personnage.getNom());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Personnage that = (Personnage) o;

        return nom != null ? nom.equalsIgnoreCase(that.nom) : that.nom == null;
    }

    @Override
    public int hashCode() {
        return nom != null ? nom.hashCode() : 0;
    }
}
