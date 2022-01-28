package personnage;

public class Guerrier extends Personnage {


    public Guerrier(String nom)  {
        super(nom);
        System.out.println("Je suis un nouveau Guerrier");
    }

    @Override
    public String toString() {
        return "toString de Guerrier - " +
                super.toString();
    }
}
