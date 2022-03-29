package fichiers;

import java.io.*;

public class SauverObjets {
    private static char fSep = File.separatorChar;
    private static String path = System.getProperty("user.dir") + fSep + "fichiers" + fSep;

    private ListeContenants listeContenants;

    public SauverObjets() {
        listeContenants = new ListeContenants();

        System.out.println(listeContenants);
        enregistrerObjets(listeContenants, path + "enregistrerObjets.bin");

        listeContenants.clear();
        System.out.println(listeContenants);

        listeContenants = (ListeContenants) lireObjet(path + "enregistrerObjets.bin");
        System.out.println(listeContenants);
    }

    public void enregistrerObjets(Object o, String fileName) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(o);

            objectOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public Object lireObjet(String fileName) {
        Object objet = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            objet = objectInputStream.readObject();

            fileInputStream.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return objet;
    }

    public static void main(String[] args) {
        new SauverObjets();
    }
}
