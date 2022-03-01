package clone;

public class ContenantLiquide {
    private String nom; //BECHER, ERLENMEYER, EPROUVETTE, COMPTE GOUTTE, PIPETTE... (verrerie en chimie)
    private Liquide liquide;
    private int capaciteMl; //capacité du contenant en millilitre
    private int qte; //quantité de liquide dans le contenant

    public ContenantLiquide(String nom, Liquide liquide, int capaciteMl, int qte) {
        this.nom = nom;
        this.liquide = liquide;
        this.capaciteMl = capaciteMl;
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
                ", capacité=" + capaciteMl +
                ", qte=" + qte +
                '}';
    }
}
