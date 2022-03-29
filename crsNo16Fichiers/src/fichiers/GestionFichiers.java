package fichiers;

import java.io.File;
import java.io.IOException;

public class GestionFichiers {
    private static char fSep = File.separatorChar;
    private static String path = System.getProperty("user.dir") + fSep + "fichiers" + fSep;

    public GestionFichiers() {
        String myFileName = path + "Denis.txt";
        new File(myFileName); //crée un fichier vide
        testerGestionFichier(myFileName);
    }

    private void testerGestionFichier(String fileName) {
        try {
            File file = new File(fileName);
            file.createNewFile();

            System.out.println("file.exists() : " + file.exists());
            System.out.println("file.isDirectory() : " + file.isDirectory());
            System.out.println("file.getName() : " + file.getName());
            System.out.println("file.length() : " + file.length() + " octets");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new GestionFichiers();
    }
}

/*
file.exists() : true
file.isDirectory() : false
file.getName() : Denis.txt
file.length() : 0 octets
*/
