package fichiers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FichiersTextesLecture {
    private static char fSep = File.separatorChar;
    private static String path = System.getProperty("user.dir") + fSep + "fichiers" + fSep;

    public FichiersTextesLecture() {
        System.out.println("enregistrerTexte.txt : ");
        lireFichierString(path + "enregistrerTexte.txt");
        System.out.println("enregistrerChaine.txt : ");
        lireFichierString(path + "enregistrerChaine.txt");
        System.out.println("enregistrerObjetsToString.txt : ");
        lireFichierString(path + "enregistrerObjetsToString.txt");
    }

    public void lireFichierString(String nomFichier) {
        String ligne;

        try {
            BufferedReader entree = new BufferedReader(new FileReader(nomFichier));
            ligne = entree.readLine();
            while (ligne != null) {
                System.out.println(ligne);
                ligne = entree.readLine();
            }

            entree.close();
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new FichiersTextesLecture();
    }
}
