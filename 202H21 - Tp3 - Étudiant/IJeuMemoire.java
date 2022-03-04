package jeu;

import java.awt.Point;
import java.util.ArrayList;

public interface IJeuMemoire
{

	public static final int NIVEAU_MAX = 6;

	/**
	 * L'intelligence du jeu. Génère un tableau de coordonnées (des objets Point
	 * (x et y)) au hasard. Les points générés doivent être valides dans la
	 * grille de jeu. Le nombre de points générés est en relation avec le niveau
	 * courant du jeu. Il obéit à la règle suivante:
	 * 
	 * Le nombre de points générés = niveau courant du jeu + 2
	 * 
	 * <b>Il est important qu'un même point ne soit pas choisi 2 fois.</b>
	 * 
	 * @return la liste des coordonnées des formes choisies dans la grille.
	 */
	public ArrayList<Point> jouerOrdi();

	/**
	 * Valide si la coordonnée jouée par le joueur humain est valide et dans
	 * l'ordre selon les coordonnées générées par l'ordinateur. Voir la méthode
	 * "jouerOrdi()"
	 * 
	 * @param x coordonnée x dans la grille (x = colonne)
	 * @param y coordonnée x dans la grille (y = ligne)
	 * @return oui ou non si la coordonnée du joueur est la coordonnée jouée par
	 *         l'ordi dans l'ordre respecté
	 */
	public boolean jouerHumain(int x, int y);

	/**
	 * Obtenir sous forme de chaîne sans espace le nom et la couleur de la forme
	 * à l'emplacement désiré dans la grille.
	 * 
	 * @param x coordonnée x de la matrice grille (x = colonne)
	 * @param y coordonnée y de la matrice grille (y = ligne)
	 * @return nom et couleur concaténée en chaîne de caractère
	 */
	public String getNomForme(int x, int y);

	/**
	 * Connaître le niveau du jeu.
	 * 
	 * @return le niveau du jeu
	 */
	public int getNiveau();

	/**
	 * Ajoute 1 au niveau si celui-ci est en-dessous de 6, autrement il demeure à 6.
	 */
	public void setNiveauPlusUn();

}
