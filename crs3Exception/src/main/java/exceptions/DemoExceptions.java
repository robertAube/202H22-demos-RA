package exceptions;

import Utilitaire.Util;

/**
 * Diagramme partiel de la hiérarchie des Exception en Java:
 * Object
 * ├── Throwable
 * │   └── Exception
 * │       ├── RuntimeException (N'ont pas besoin d'être dans des blocs try/catch)
 * │       │   ├── ArithmeticException
 * │       │   ├── IllegalArgumentException
 * │       │   │   └── NumberFormatException
 * │       │   ├── NullPointerException
 * │       │   └── IndexOutOfBoundsException
 * │       │       └── ArrayIndexOutOfBoundsException
 * │       └── IOException
 * │           └── FileNotFoundException
 * └── Error
 *     Les exceptions héritant de la classe RuntimeException n'ont pas besoin d'être détectées impérativement par des blocs try/catch.
 */

public class DemoExceptions {
    public DemoExceptions() {
        Util.lireInt("Test");
        demoException1();
    }

    private void demoException1() {
    }

    private void lanceUneException()  {
    }

    public static void main(String[] args) {
        new DemoExceptions();
    }
}
