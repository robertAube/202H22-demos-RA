package fichiers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FichiersTextesEcriture {
    private String[] tableauCouleur =
            {"Bleu", "blanc", "vert", "rouge"};
    private Carre[] tableauCarre;
    private static char fSep = File.separatorChar;
    private static String path = System.getProperty("user.dir") + fSep + "fichiers" + fSep;

    public FichiersTextesEcriture() {
        System.out.println("Répertoire courant de l'application java : " + System.getProperty("user.dir"));
   //     path = "";
//      path = "." + fSep;
        init();
        enregistrerTexte(path + "enregistrerTexte.txt");
        enregistrerChaine(path + "enregistrerChaine.txt");
        enregistrerObjetsToString(path + "enregistrerObjetsToString.txt");
    }

    public void init() {
        tableauCarre = new Carre[25];
        tableauCarre[0] = new Carre(4);
        tableauCarre[1] = new Carre(6);
        tableauCarre[2] = new Carre(8);

        tableauCarre[1].setCouleur("Vert");
        tableauCarre[2].setCouleur("Bleu");
    }

    public void enregistrerTexte(String nomFichier) {
        //on enregistre à partir des données d’un tableau qui contient des
        //chaînes
        try {
            //FileWriter est utilisée pour écrire des données orientées caractères dans un fichier
            //PrintWriter est utilisé pour imprimer la représentation formatée des objets
            // dans le flux de sortie de texte.
            PrintWriter sortie = new PrintWriter(new FileWriter(nomFichier)); //ouverture

            //manipulation
            for (int i = 0; i < tableauCouleur.length; i++) {
                sortie.println(tableauCouleur[i]);
                // sans saut de ligne
                // sortie.print(tableauCouleur[i]+"\t");
            }


            sortie.flush(); //S'assure que toutes les données mises en mémoire tampon sont écrites dans le fichier.

            //fermeture
            sortie.close(); //vide le flux et ferme le canal IO
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void enregistrerChaine(String nomFichier) { //on enregistre à partir d’une chaîne de caractères que l’on crée
        int n = 1;

        try {
            PrintWriter sortie = new PrintWriter(new FileWriter(nomFichier));

            while (n <= 10) {
                sortie.println(n + " a pour carre " + n * n);
                // et si on prenait print
                // sortie.print(n + " a pour carre " + n * n);
                n++;
            }

            sortie.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void enregistrerObjetsToString(String nomFichier) {
        //on enregistre des objets Carré à partir d’un tableau de carrés
        Carre temp;
        try {
            PrintWriter sortie = new PrintWriter(new FileWriter(nomFichier));

            for (int i = 0; i < tableauCarre.length; i++) {
                temp = tableauCarre[i];
                if (temp != null) {
                    // ici c'est le toString qui est utilisé
                    sortie.println(temp);
                    // essayons avec juste la couleur
                    // sortie.println(temp.getCouleur());
                }
            }

            sortie.flush();
            sortie.close();
        } catch (IOException e) {
            System.out.println("Erreur de création de fichier");
        }
    }

    public static void main(String[] args) {
        new FichiersTextesEcriture();
    }
}
