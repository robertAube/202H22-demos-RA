package fichiers;

import java.io.*;
import java.util.LinkedList;

/**
 * @author Robert Aubé
 * @version 1.0 (Date de création: 2022-05-05)
 */
public class GestionFichier {

    public static String [] lireFichier(String nomFichier) {
        String ligne;
        LinkedList<String> temp = new LinkedList<String>();

        try {
            BufferedReader entree = new BufferedReader(new FileReader(nomFichier));
            ligne = entree.readLine();
            while (ligne != null) {
                temp.add(ligne);
                ligne = entree.readLine();
            }
            entree.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return (temp.toArray(new String[temp.size()]));
    }

    public static void ecrireFichier(String[] lines, String nomFichier) {
        try {
            PrintWriter sortie = new PrintWriter(new FileWriter(nomFichier));

            for (String ligne : lines) {
                sortie.println(ligne);
            }
            sortie.close();
        } catch (IOException e) {
            System.out.println("Erreur de création de fichier");
        }
    }
}
