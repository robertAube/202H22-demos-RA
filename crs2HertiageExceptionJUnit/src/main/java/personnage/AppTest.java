package personnage;

public class AppTest {

    public AppTest() {
        Sorcier s1 = new Sorcier("Harry");
        Guerrier g1 = new Guerrier("De Gaulle");
        Sorcier s2;

        Personnage p1;

        System.out.println(s1);
        System.out.println(g1);

        s2 = s1;
        System.out.println(s2);

        p1 = g1;
//        ((Sorcier)p1).jeterUnSort(); comme p1 est un guerrier, je ne peux pas jeter un sort sinon Exception
        System.out.println(p1);
        p1 = s1;
        System.out.println(p1);

        ((Sorcier)p1).jeterUnSort();
    }

    public static void main(String[] args) {
        new AppTest();
    }
}
