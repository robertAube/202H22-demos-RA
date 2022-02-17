package personnage;

public class Guerrier extends Personnage {
    public Guerrier(String nom)  {
        super(nom);
        System.out.println("Je suis un nouveau Guerrier");
    }

    @Override
    public void saluer() {
        System.out.println("hug!");
    }

    @Override
    public String toString() {
        return "Guerrier - " +
                super.toString();
    }
}
