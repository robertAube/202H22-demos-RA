package fichiers;

import javax.swing.*;
import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Texte {
    private String[] tableauCouleur =
            {"Bleu", "blanc", "vert", "rouge"};
    private Carre[] tableauCarre;

    public Texte() {
        tableauCarre = new Carre[25];
        tableauCarre[0] = new Carre(4);
        tableauCarre[1] = new Carre(6);
        tableauCarre[2] = new Carre(8);

        tableauCarre[1].setCouleur("Vert");
        tableauCarre[2].setCouleur("Bleu");
    }

    /**
     * Présente comment écrire des chaînes de caractères dans un fichier une à
     * côté de l'autre ou séparées par sur des sauts de ligne différente.
     *
     * @param nomFichier un File le fichier dans lequel on va écrire
     */
    public void enregistrerTexte(File nomFichier) {
        try {
            FileWriter fichier = new FileWriter(nomFichier);
            PrintWriter sortie = new PrintWriter(fichier);

            sortie.println("La liste de couleurs est : ");

            for (int i = 0; i < tableauCouleur.length; i++) {
                sortie.println(tableauCouleur[i]);
                // sortie.print(tableauCouleur[i] + "\t");
            }

            sortie.flush();
            sortie.close();
        } catch (IOException e) {
            // Pour les besoins on affiche le message d'erreur mais ce n'est pas
            // une bonne pratique
            System.out.println(e);
        }
    }

    /**
     * Présente aussi comment écrire des chaînes de caractères dans un fichier
     *
     * @param nomFichier un File le fichier dans lequel on va écrire
     */
    public void enregistrerChaine(File nomFichier) {
        int n = 1;

        try {
            // On peut construire successivement l'objet sans variable
            // intermédiaire
            PrintWriter sortie = new PrintWriter(new FileWriter(nomFichier));

            while (n <= 10) {
                sortie.println(n + " a pour carre " + n * n);
                // et si on prenait print
                // sortie.print(n + " a pour carre " + n * n);
                n++;
            }

            sortie.flush();
            sortie.close();
        } catch (IOException e) {
            // Pour les besoins on affiche le message d'erreur mais ce n'est pas
            // une bonne pratique
            System.out.println(e);
        }
    }

    /**
     * Présente comment écrire des objets sous formes de chaînes de caractères,
     * mais il est plus difficile de les relire.
     *
     * @param nomFichier un File le fichier dans lequel on va écrire
     */
    public void enregistrerObjetsToString(File nomFichier) {
        Carre temp = null;

        try {
            // On peut construire successivement l'objet sans variable
            // intermédiaire
            PrintWriter sortie = new PrintWriter(new FileWriter(nomFichier));

            for (int i = 0; i < tableauCarre.length; i++) {
                temp = tableauCarre[i];

                if (temp != null) {
                    // ici c'est le toString qui est utilisé
                    sortie.println(tableauCarre[i]);
                    // essayons avec juste la couleur
                    // sortie.println(temp.getCouleur());
                }
            }

            sortie.flush();
            sortie.close();
        } catch (IOException e) {
            // Pour les besoins on affiche le message d'erreur mais ce n'est pas
            // une bonne pratique
            System.out.println("Erreur de création de fichier");
        }
    }

    /**
     * Lire un fichier ligne par ligne de caractères
     *
     * @param nomFichier un File le fichier dans lequel on va lire
     */
    public void lireFichierString(File nomFichier) {
        BufferedReader entree = null;
        String ligne = null;

        try {
            entree = new BufferedReader(new FileReader(nomFichier));
            System.out.println("\nLe fichier " + nomFichier);
            // Lire une première ligne
            ligne = entree.readLine();

            // Si ok lire les autres
            while (ligne != null) {
                // System.out.println("[" + ligne.trim().toLowerCase() + "]");
                System.out.println(ligne);
                ligne = entree.readLine();
            }

            entree.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Lire un fichier ligne par ligne de caractères et diviser la ligne lue en
     * éléments grace à un séparateur connu.
     *
     * @param nomFichier un File le fichier dans lequel on va lire
     */
    public void lireFichierNombreString(File nomFichier) {
        int x = 0;
        int somme = 0;
        String ligne = null;
        StringTokenizer token = null;
        BufferedReader entree = null;

        try {
            entree = new BufferedReader(new FileReader(nomFichier));

            ligne = entree.readLine();

            while (ligne != null) {
                // Découper la ligne lue en morceaux selon un séparateur
                token = new StringTokenizer(ligne, "a pour carre");

                // Il faut bien connaître la structure du fichier
                // token.nextToken();
                // token.nextToken();
                // token.nextToken();
                token.nextToken();

                // On vient de trouver le carré
                x = Integer.parseInt(token.nextToken());
                somme += x;
                System.out.print(x + " ");
                ligne = entree.readLine();
            }

            entree.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("la somme finale des carrés est : " + somme);
    }

    /**
     * Lire un fichier ligne par ligne de caractères et diviser la ligne lue en
     * éléments grace à plusieurs séparateurs connus.
     *
     * @param nomFichier un File le fichier dans lequel on va lire
     */
    public void lireFichierObjetString(File nomFichier) {
        Carre carre;
        String ligne;
        StringTokenizer token;
        BufferedReader entree = null;

        try {
            entree = new BufferedReader(
                    new FileReader(nomFichier));
            ligne = entree.readLine();
            while (ligne != null) {
                // les séparateurs sont les 2 points et l'espace
                token = new StringTokenizer(ligne, ": ");
                int n = token.countTokens();
                System.out.println("Nombre de tokens: " + n);

                //Se rendre à l'avant-dernier
                for (int i = 0; i < n - 1; i++) {
                    System.out.println(token.nextToken());
                }

                // Ou encore au 6e, idéalement mon fichier est mieux séparé
//				System.out.println(token.nextToken());
//				System.out.println(token.nextToken());
//				System.out.println(token.nextToken());
//				System.out.println(token.nextToken());
//				System.out.println(token.nextToken());

                int cote = Integer.parseInt(token.nextToken());
                System.out.println("cote " + cote);

                carre = new Carre(cote);
                System.out.println(carre + "\n");

                ligne = entree.readLine();
            }

            entree.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    /**
     * Lire un fichier d'objet.
     *
     * @param nomFichier un File le fichier dans lequel on va lire.
     * @param tabCarre   un tableau d'objet à écrire
     */
    public void enregistrerObjetCarre(File nomFichier, Carre[] tabCarre) {
        ObjectOutputStream fichObject = null;

        try {
            fichObject = new ObjectOutputStream(
                    new BufferedOutputStream(new FileOutputStream(nomFichier)));

            for (Carre c : tabCarre) {
                fichObject.writeObject(c);
            }

            fichObject.flush();
            fichObject.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    /**
     * Lire un fichier d'objet.
     *
     * @param nomFichier un File le fichier dans lequel on va lire.
     * @return une liste des objets lus.
     */
    public List<Carre> lireObjetCarre(File nomFichier) {
        List<Carre> listeCarre = new LinkedList<>();
        Object o = null;
        ObjectInputStream fichObject = null;

        try {
            fichObject = new ObjectInputStream(
                    new BufferedInputStream(new FileInputStream(nomFichier)));

            while ((o = fichObject.readObject()) != null) {
                listeCarre.add((Carre) o);
                System.out.println(o);
            }
            fichObject.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return listeCarre;
    }

    /**
     * Présente comment écrire des octets (octet binaire, 8 bits) dans un
     * fichier.
     *
     * @param nomFichier un File le fichier dans lequel on va écrire
     */
    public void enregistrerBinaireOctet(File nomFichier) {
        FileOutputStream out = null;

        try {
            out = new FileOutputStream(nomFichier);

            for (int i = 0; i < tableauCouleur.length; i++) {
                // Ici chaque String est transformée en tableau d'octet
                // (char --> byte)
                out.write(tableauCouleur[i].getBytes());

            }

            out.flush();
            out.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Présente comment lire un fichier octet par octet et à l'aide d'un tableau
     * d'octets en une lecture.
     *
     * @param nomFichier un File le fichier dans lequel on va lire
     */
    public void lireBinaireOctet(File nomFichier) {
        FileInputStream in = null;
        long longueur = 0;
        byte[] tableau = null;
        int c = 0;
        int nbrOctet = 0;

        try {
            in = new FileInputStream(nomFichier);

            nbrOctet = in.available();
            System.out.println("Données disponibles " + nbrOctet);

            longueur = nomFichier.length();
            System.out.println("longueur fichier " + longueur);
            tableau = new byte[(int) longueur];

            // Lecture byte à byte
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }

            System.out.println("\nOn retourne au début et on lit de nouveau.");
            // Revient de x octets vers le début.
            in.skip(-nbrOctet);

            // On lit de nouveau avec un tableau de byte cette fois
            in.read(tableau, 0, tableau.length);

            for (byte b : tableau) {
                System.out.print((char) b);
            }

            System.out.println();

            in.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Lecture structuré sous la forme de types primaires
     *
     * @param nomFichier un File le fichier dans lequel on va lire
     */
    public void lireBinaireData(File nomFichier) {
        DataInputStream in = null;

        try {
            in = new DataInputStream(new FileInputStream(nomFichier));

            // readUTF pour des String
            System.out.println(in.readInt());
            for (int i = 0; i < tableauCouleur.length; i++) {
                System.out.println(in.readUTF());
            }

            in.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Lecture structuré sous la forme de types primaires
     *
     * @param nomFichier un File le fichier dans lequel on va lire
     */
    public void ecrireBinaireData(File nomFichier) {
        DataOutputStream in = null;

        try {
            in = new DataOutputStream(
                    new BufferedOutputStream(new FileOutputStream(nomFichier)));

            // readUTF pour des String
            in.writeInt(tableauCouleur.length);
            for (int i = 0; i < tableauCouleur.length; i++) {
                in.writeUTF(tableauCouleur[i]);
            }

            in.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Obtenir le nom du fichier de l'utilisateur à partir d'une boîte de
     * dialogue.
     *
     * @return un File, le fichier sélectionné ou null
     */
    public File obtenirNomFichier(String option) {
        File f = null;
        JFileChooser chooser = new JFileChooser(".");

        if (chooser.showDialog(null, option) == JFileChooser.APPROVE_OPTION)
            f = chooser.getSelectedFile();

        return f;
    }

    public static void main(String args[]) {

        Texte texte = new Texte();
//		texte.enregistrerTexte(new File("couleurs.txt"));
//		texte.enregistrerChaine(new File("carre"));
//		texte.enregistrerObjetsToString(new File("forme"));
//		texte.lireFichierString(new File("Fichier.java"));
//		texte.lireFichierString(new File("couleurs.txt"));
//		texte.lireFichierString(new File("carre"));
//		texte.lireFichierString(new File("forme"));

//		System.out.println("\nLire Fichier Nombre");
//		texte.lireFichierNombreString(new File("carre"));
//		System.out.println("\n");
//		texte.lireFichierObjetString(new File("forme"));
//
//		texte.enregistrerBinaireOctet(new File("couleurBinaire"));
//		texte.lireBinaireOctet(new File("couleurBinaire"));
//
//		System.out.println("\nEcrire des objets carrés dans un fichier.");
//		texte.enregistrerObjetCarre(new File("objets_carre"),
//				texte.tableauCarre);
//		System.out.println("\nLire des objets carrés à partir d'un fichier.");
//		System.out.println(texte.lireObjetCarre(new File("objets_carre")));
//
//		try
//		{
//			System.out.println("\nl'objet File...");
//			File monFichier = new File("juju");
//			System.out.println(monFichier.exists());
//			monFichier.createNewFile();
//			System.out.println(monFichier.exists());
//			System.out.println(monFichier.isDirectory());
//			System.out.println(monFichier.getName());
//			// fichier déjà créé
//			monFichier = new File("carre");
//			//Pourquoi 189 et pas 169 ?
//			System.out.println(monFichier.length());
//		}
//		catch (IOException e)
//		{
//			System.out.println(e);
//		}
//
//		texte.ecrireBinaireData(new File("couleur.bin"));
//		texte.lireBinaireData(new File("couleur.bin"));
//
        System.out.println("\nJFileChooser...");
        System.out.println(texte.obtenirNomFichier("Lire"));
        System.out.println(texte.obtenirNomFichier("Écrire"));

    }
}
