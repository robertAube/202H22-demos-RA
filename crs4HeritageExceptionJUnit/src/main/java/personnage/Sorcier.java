package personnage;

public class Sorcier extends Personnage {
    private int age;
    public Sorcier(String nom) {
        super(nom); //appel au construteur de ma super-classe
        this.age = 100;
        System.out.println("Je suis un nouveau Sorcier");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void saluer() {
        System.out.println("Salut!!!");
    }

    public void jeterUnSort() {
        System.out.println("Jeter un sort");
    }

}
