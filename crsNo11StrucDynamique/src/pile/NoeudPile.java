package pile;

public class NoeudPile {
    private int data;
    private NoeudPile precedent;

    public NoeudPile(int data, NoeudPile precedent) {
        this.data = data;
        this.precedent = precedent;
    }

    public int getData() {
        return data;
    }

    public NoeudPile getPrecedent() {
        return precedent;
    }
}
