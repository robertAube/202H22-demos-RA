package recursivite;

public class Recursivite {
    public Recursivite() {
        //  compterCharTest();
        fiboTest();
    }

    private void fiboTest() {
        for (int i = 0; i < 7; i++) {
            System.out.println("fibo(" + i + ") = " + fibo(i));
        }
    }

    private int fibo(int i) {
        int r;
        if (i <= 1) {
            r = i;
        } else
            r = fibo(i - 1) + fibo(i - 2);
        return (r);
    }

    private void compterCharTest() {
        System.out.println(compterChar("Bonjour le monde", 'e'));
        System.out.println(compterChar("Bonjour le monde", 'O'));
        System.out.println(compterChar("Bonjour le monde", 'o'));
        System.out.println(compterChar("Bonjour le monde", 'B'));
        System.out.println(compterChar("", 'a'));
    }

    private int compterChar(String str, char car) {
        int nbCar = 0;
        if (str.isEmpty())
            nbCar = 0;
        else {
            if (str.charAt(0) == car) {
                nbCar = 1 + compterChar(str.substring(1), car);
            } else
                nbCar = 0 + compterChar(str.substring(1), car);
        }

        return nbCar;
    }

    public static void main(String[] args) {
        new Recursivite();
    }
}
