package exceptions;


/**
 * Diagramme partiel de la hiérarchie des Exception en Java:
 * Object
 * └── Throwable
 *     ├── Exception
 *     │   ├── RuntimeException (N'ont pas besoin d'être dans des blocs try/catch)
 *     │   │   ├── ArithmeticException
 *     │   │   ├── IllegalArgumentException
 *     │   │   ├── NullPointerException
 *     │   │   └── IndexOutOfBoundsException
 *     │   │       └── ArrayIndexOutOfBoundsException
 *     │   └── IOException
 *     │       └── FileNotFoundException
 *     └── Error
 */
public class Exception {

    public Exception() {
        lancerMonException();
    }


    private void lancerMonException() {
        throw new MonException ();
    }

    private void testException6() {
        try {
            testException2();
            System.out.println("Tout va bien!!!!"); // ne sera pas affiché
            testException1();

        }catch (ArithmeticException e){
            System.out.println("TestException2 a lancé une exception : " + e.getMessage());
        }
        System.out.println("Je sors de testException6()");
    }

    private void testException5() {
        try {
            testException1();
        }catch (ArithmeticException e){
            System.out.println("Il y a eu un problème de division : " + e.getMessage());
        }
    }

    private void testException1() {
        float f;
        f = 10 / 0;
        System.out.println(f);
    }

    private void testException2() {
        throw new ArithmeticException("J'ai lancé moi même une exception!!!!");
    }


    private void testException3() {
        float f;

        try {
            f = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Il a eu une erreur : " + e.getMessage());
        }

//        System.out.println(f);
    }

    private void testException4() {
        try {
            throw new ArithmeticException("J'ai lancé moi même une exception!!!!");
        }
        catch (ArithmeticException exception) {
            System.out.println("Mon exception : " + exception.getMessage());
        }
    }


    public static void main(String[] args) {
        new Exception();
    }
}
