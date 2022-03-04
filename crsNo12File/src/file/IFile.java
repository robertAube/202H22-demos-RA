package file;

public interface IFile {
    /**
     * Mettre un élément à la fin de la file
     * @param element à mettre à la fin de la file
     */
    public void enfiler(Object element);

    /**
     * Prendre l'élément au début de la file
     * @return l'élément défilé
     * @throws RuntimeException si on défile lorsque la file est vide
     */
    public Object defiler();

    /**
     * Retourne vrai si la file est vide.
     * @return vrai si la file est vide.
     */
    public boolean estVide();
}
