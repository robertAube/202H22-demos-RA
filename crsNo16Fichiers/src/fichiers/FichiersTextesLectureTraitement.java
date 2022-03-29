package fichiers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FichiersTextesLectureTraitement {
    private static char fSep = File.separatorChar;
    private static String path = System.getProperty("user.dir") + fSep + "fichiers" + fSep;

    public FichiersTextesLectureTraitement() {
        System.out.println("lireFichierNombreString.txt : ");
        lireFichierNombreString(path + "enregistrerChaine.txt");
        System.out.println("enregistrerObjetsToString.txt : ");
        lireFichierObjetString(path + "enregistrerObjetsToString.txt");
    }

    public void lireFichierNombreString(String nomFichier) {
//on a un fichier de nombres présenté comme ceci
// 1 a pour carré 1
// 2 a pour carré 4
//on s’intéresse à la première valeur de la ligne
        int x;
        int somme = 0;
        String ligne;
        StringTokenizer token;
        try {
            BufferedReader entree = new BufferedReader(new FileReader(nomFichier));
            ligne = entree.readLine();
            while (ligne != null) {
                token = new StringTokenizer(ligne, " ");
			//…
                x = Integer.parseInt(token.nextToken());
                somme += x;
                System.out.print(x + " ");
                ligne = entree.readLine();
            }
            entree.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println(somme);
    }

    public void lireFichierObjetString(String nomFichier) {
//ici on lit un tableau d’objet Carré
//on s’intéresse à la donnée représentant la longueur du côté
//les lignes du fichier se présentent ainsi
// carré: Rouge( Surface : 16) ;Dimension : 4 X 4

        Carre carre;
        String ligne;
        StringTokenizer token;
        try {
            BufferedReader entree = new BufferedReader(new FileReader(
                    nomFichier));
            ligne = entree.readLine();
            while (ligne != null) {
                token = new StringTokenizer(ligne, ": ");
                // je veux le 6ième champ
                // idéalement mon fichier est mieux séparé
                token.nextToken();
                token.nextToken();
                token.nextToken();
                token.nextToken();
                token.nextToken();
                int cote = Integer.parseInt(token.nextToken());
                carre = new Carre(cote);
                System.out.println(carre.getNom() + carre.getCote());
                ligne = entree.readLine();
            }
            entree.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        new FichiersTextesLectureTraitement();
    }
}
