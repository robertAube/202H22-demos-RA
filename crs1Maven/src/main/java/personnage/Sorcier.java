package personnage;

public class Sorcier extends Personnage {
    private int age;
    public Sorcier(String nom) {
        super(nom); //appel au construteur de ma super-classe
        this.age = 100;
    }

    public void jeterUnSort() {
        System.out.println("Jeter un sort");
    }

}
