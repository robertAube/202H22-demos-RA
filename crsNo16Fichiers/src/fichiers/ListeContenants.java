package fichiers;

import java.io.Serializable;
import java.util.ArrayList;

public class ListeContenants implements Serializable
{
    private ArrayList<ContenantLiquide> listeContenant;

    public ListeContenants() {
        listeContenant = new ArrayList<>();
        listeContenant.add(new ContenantLiquide("Verre", new Liquide("Eau", 1000), 300, 250));
        listeContenant.add(new ContenantLiquide("Tasse", new Liquide("café", 1010), 350, 200));
    }

    public void clear() {
        listeContenant.clear();
    }

    @Override
    public String toString() {
        return "ListeContenants{" +
                "listeContenant=" + listeContenant +
                '}';
    }
}
