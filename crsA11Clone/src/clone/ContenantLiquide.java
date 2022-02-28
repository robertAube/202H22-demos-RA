package clone;

public class ContenantLiquide {
    private String nom; //PISSETTE, BECHER, ERLENMEYER, EPROUVETTE, COMPTE GOUTTE, PIPETTE (verrerie en chimie)
    private Liquide liquide;
    private int qteMaxMl;
    private int qte;

    public ContenantLiquide(String nom, Liquide liquide, int qteMaxMl, int qte) {
        this.nom = nom;
        this.liquide = liquide;
        this.qteMaxMl = qteMaxMl;
        this.qte = qte;
    }

    public Liquide getLiquide() {
        return liquide;
    }

    public void setLiquide(Liquide liquide) {
        this.liquide = liquide;
    }

    @Override
    public String toString() {
        return nom + " - {" +
                liquide +
                ", qteMaxMl=" + qteMaxMl +
                ", qte=" + qte +
                '}';
    }
}
