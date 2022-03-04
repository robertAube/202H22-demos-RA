package file;

public class File implements IFile{
    private Noeud debut;
    private Noeud fin;

    public File() {
        debut = null;
        fin = null;
    }

    /**
     * Mettre un élément à la fin de la file
     *
     * @param data à mettre à la fin de la file
     */
    @Override
    public void enfiler(Object data) {
        Noeud newNode = new Noeud(data, null);

        if (debut == null) {
            debut = newNode;
        }
        else {
            fin.setSuivant(newNode);
        }

        fin = newNode;
    }

    /**
     * Prendre l'élément au début de la file
     *
     * @return l'élément défilé
     * @throws RuntimeException si on défile lorsque la file est vide
     */
    @Override
    public Object defiler() {
        Object retour;
        if (estVide())
            throw new RuntimeException("La pile est vide");
        retour = debut.getData();
        debut = debut.getSuivant();
        if (debut == null)
            fin = null;

        return retour;
    }

    /**
     * Retourne vrai si la file est vide.
     *
     * @return vrai si la file est vide.
     */
    @Override
    public boolean estVide() {
        return debut == null;
    }
}
