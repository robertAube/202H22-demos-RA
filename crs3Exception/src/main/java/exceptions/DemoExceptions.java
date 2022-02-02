package exceptions;

import Utilitaire.Util;

/**
 * Diagramme partiel de la hiérarchie des Exception en Java:
 * Object
 * ├── Throwable
 *    └── Exception
 * │##     ├── RuntimeException (N'ont pas besoin d'être dans des blocs try/catch)
 * │       │   ├── ArithmeticException
 * │       │   ├── IllegalArgumentException
 * │       │   │   └── NumberFormatException
 * │       │   ├── NullPointerException
 * │       │   └── IndexOutOfBoundsException
 * │       │       └── ArrayIndexOutOfBoundsException
 * │       └── IOException
 * │           └── FileNotFoundException
 * └── Error
 * Les exceptions héritant de la classe RuntimeException n'ont pas besoin d'être détectées impérativement par des blocs try/catch.
 */

public class DemoExceptions {

    public DemoExceptions() {
     //   System.out.println(lireEntierAvecCatch("Donner un nombre entier : "));

        demoException1();
    }

    private int lireEntierAvecCatch(String s) {
        boolean estInvalide = true;
        int valeurLu = 0;
        do {
            try {
                valeurLu = Util.lireInt(s);
                estInvalide = false;
            } catch (NumberFormatException e) {
                System.out.println("Format de nombre incorrect : veuillez recomencer!");
            }
        }
        while (estInvalide);
        return valeurLu;
    }

    private void demoException1() {
        try {
            lanceUneException(new Exception("Exception 1"));
        }
        catch (Throwable e)
        {
            System.out.println(e.getMessage());
        }
    }

    private void lanceUneException(Throwable exceptionALancer) throws Throwable {
//        try {
//        throw exceptionALancer;}
//        catch (Throwable e) {
//
//        }

        throw exceptionALancer;
    }

    public static void main(String[] args) {
        new DemoExceptions();
    }
}
