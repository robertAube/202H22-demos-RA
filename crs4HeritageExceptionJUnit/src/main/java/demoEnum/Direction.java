package demoEnum;

public enum Direction {
    SUD (180), EST(90), NORD(0), OUEST(270);

    private int degre;

    Direction(int degre) {
        this.degre = degre;
    }

    public int getDegre() {
        return degre;
    }
}
