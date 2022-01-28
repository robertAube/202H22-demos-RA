package forme;

public class AppForme {
    public AppForme() {
        int a = 2;
        Carre c = new Carre();
        Carre c2 = new Carre(2);
        Carre c3 = new Carre(3);
        Carre c4 = new Carre(2);

        System.out.println(c);
        System.out.println(c2.equals(""));
        System.out.println(c2.equals(c3));
        System.out.println(c2.equals(c4));
    }

    public static void main(String[] args) {
        new AppForme();
    }
}
