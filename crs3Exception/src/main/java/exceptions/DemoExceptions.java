package exceptions;

import Utilitaire.Util;

/**
 * La hiérarchie partielle des Exception en Java:
 * Object
 * └── Throwable
 *     ├── Exception
 *     │   ├── RuntimeException (N'ont pas besoin d'être dans des blocs try/catch)
 *     │   │   ├── ArithmeticException
 *     │   │   ├── IllegalArgumentException
 *     │   │   │   └── NumberFormatException
 *     │   │   ├── NullPointerException
 *     │   │   └── IndexOutOfBoundsException
 *     │   │       └── ArrayIndexOutOfBoundsException
 *     │   └── IOException
 *     │       └── FileNotFoundException
 *     └── Error
 *
 * Les exceptions héritant de la classe RuntimeException n'ont pas besoin d'être détectées impérativement par des blocs try/catch.
 */

public class DemoExceptions {

    public DemoExceptions() {
     //   System.out.println(lireEntierAvecCatch("Donner un nombre entier : "));

     //   demoException1();
//        demoExceptionPlusieursCatch();
 //       demoClauseFinally1();
        try {
            demoClauseFinally2();
            System.out.println("J'ai passé demoClauseFinally2()");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Fin de DemoExceptions()");
    }

    private void demoClauseFinally2() throws Exception {
        try {
            lanceUneException(new Exception("Je suis une Exception"));
        }
        finally {
            System.out.println("Se fait toujours!!!! Mais vraiment toujours!!!!!");
        }
        System.out.println("Je me suis rendu à la fin de la fonction");
    }

    private void demoClauseFinally1() {
        try {
            throw (new RuntimeException("Je suis une RuntimeException"));
//            System.out.println("Je me suis rendu après le try!!!!");
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Se fait toujours!!!! Mais vraiment toujours!!!!!");
        }
        System.out.println("Je me suis rendu à la fin de la fonction");
    }

    private void demoExceptionPlusieursCatch() {
        try {
          //  lanceUneException(new RuntimeException("Je suis une RuntimeException"));
            lanceUneException(new Exception("Je suis une Exception"));
            System.out.println("Je me suis rendu après le try!!!!");
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) { // obligatoire parce que lanceUneException lance pottentiellement une Exception
            System.out.println(e.getMessage());
        }
        System.out.println("Je me suis rendu à la fin de la fonction");
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

    private void lanceUneException(Exception exceptionALancer) throws Exception {
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
