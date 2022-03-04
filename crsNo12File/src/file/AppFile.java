package file;

public class AppFile {
    private IFile file;

    public AppFile() {
        file = null;
        essayerFile(3);
    }

    private void essayerFile(int nbFois) {

        for (int j = 0; j < nbFois; j++) {
            // file vide
            enfiler(5);
            defiler(5);
            // file vide
            enfiler(2);
            defiler(2);
            // file vide
            enfiler(3);
            defiler(1);
            enfiler(2);
            defiler(4);
            // file vide
        }
    }

    public void enfiler(int nbFois) {
        for (int i = 0; i < nbFois; i++) {
            file.enfiler(new Integer(i));
            System.out.println("Enfiler " + i + " : " + file);
        }
    }

    public void defiler(int nbFois) {
        Object data;

        for (int i = 0; i < nbFois; i++) {
            data = file.defiler();
            System.out.println("Defiler " + data + " : " + file);
        }
    }

    public static void main(String[] args) {
        new AppFile();
    }
}
