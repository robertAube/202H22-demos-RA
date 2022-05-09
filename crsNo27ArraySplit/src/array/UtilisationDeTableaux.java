package array;

import java.util.Arrays;

public class UtilisationDeTableaux {

    public UtilisationDeTableaux() {
        remplirTableau();
        trierTableau();
        trouverValeurTableau();
        verifierEgalite();
    }

    private void remplirTableau() {
        int valeursInt[] = new int[10];

        System.out.println("\n## remplirTableau() ###########");
        System.out.println("Tableau avant Arrays.fill : " + Arrays.toString(valeursInt));
        Arrays.fill(valeursInt, 7); // remplir avec des 7
        System.out.println("Arrays.fill(rempliDInt, 7) :" + Arrays.toString(valeursInt));
    }

    private void trierTableau() {
        int valeursInt[] = {10, 2, 35, 40, 55, 6};

        System.out.println("\n## trierTableau() ###########");
        System.out.print("valeursInt : ");
        System.out.println(Arrays.toString(valeursInt));
        Arrays.sort(valeursInt); // trier valeurs
        System.out.print("Arrays.sort(valeursInt) : ");
        System.out.println(Arrays.toString(valeursInt));
    }

    private void trouverValeurTableau() {
        int valeursInt[] = {10, 2, 35, 40, 55, 6, 1};

        System.out.println("\n## trouverValeurTableau() ###########");
        System.out.println(Arrays.toString(valeursInt));
        System.out.println("La position de 55 est " +
                //retourne l'index de l'élément recherché ou une valeur négative si ne trouve pas
                Arrays.binarySearch(valeursInt, 55));
        System.out.println("La position de 355 est " +
                Arrays.binarySearch(valeursInt, 355));
        Arrays.sort(valeursInt); // trier valeurs
        System.out.println(Arrays.toString(valeursInt));
        System.out.println("La position de 55 est " +
                Arrays.binarySearch(valeursInt, 55));
        System.out.println("La position de 355 est " +
                Arrays.binarySearch(valeursInt, 355));
    }

    //Vérifier l'égalité et copy
    private void verifierEgalite() {
        int valeursInt[] = {10, 2, 35, 40, 55, 6};
        //Copie les éléments dans un nouveau tableau. (Notez qu'on réfère au même objet si c'est un tableau d'objets)
        int valeursIntCopy[] = Arrays.copyOf(valeursInt, valeursInt.length);

        System.out.println("\n## verifierEgalite() ###########");

        System.out.println("valeursInt[] = " + Arrays.toString(valeursInt));
        System.out.println("valeursIntClone[] = " + Arrays.toString(valeursIntCopy));
        System.out.print("Arrays.equals(valeursInt, valeursIntClone) = ");
        System.out.println(Arrays.equals(valeursInt, valeursIntCopy));

        valeursIntCopy[2] = 13;
        System.out.println("valeursInt[] = " + Arrays.toString(valeursInt));
        System.out.println("valeursIntClone[] = " + Arrays.toString(valeursIntCopy));
        System.out.print("Arrays.equals(valeursInt, valeursIntClone) = ");
        System.out.println(Arrays.equals(valeursInt, valeursIntCopy));
    }

    public static void main(String[] args) {
        new UtilisationDeTableaux();
    }
}

