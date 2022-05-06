package array;

import java.util.Arrays;

public class UtilisationDeTableaux {
    private int valeursInt[] = {10, 2, 35, 40, 55, 6};
    private int rempliDInt[];
    private int copieValeursInt[] = {10, 2, 35, 40, 55, 6};

    private void afficherTableau(int[] tab) {
        String str = "";
        for (int element : tab) //for each…{
            str += element + ", ";
        System.out.print("[" + (tab.length == 0 ? "" : str.substring(0, str.length() - 2)) + "]");
    }

    public UtilisationDeTableaux() {
        remplirTableau();



        System.out.print("\n\nvaleursInt : ");
        System.out.println(Arrays.toString(rempliDInt));
        Arrays.sort(valeursInt); // trier valeurs
        System.out.print("\nArrays.sort(valeursInt) : ");
        System.out.println(Arrays.toString(rempliDInt));

        // Trouver la valeur dans le tableau valeursInt.
        System.out.println("\n\nLa position de 55 est " +
                Arrays.binarySearch(valeursInt, 55));
        System.out.println("La position de 355 est " +
                Arrays.binarySearch(valeursInt, 355));

        //Vérifier l'égalité
        System.out.print("\nArrays.equals(valeursInt, copieValeursInt) = ");
        System.out.println(Arrays.equals(valeursInt, copieValeursInt));
        System.out.print("Arrays.equals(valeursInt, rempliDInt) = ");
        System.out.println(Arrays.equals(valeursInt, rempliDInt));
    }

    private void remplirTableau() {
        rempliDInt = new int[10];

        System.out.println("remplirTableau()");
        System.out.println("Tableau avant Arrays.fill" + Arrays.toString(rempliDInt));
        Arrays.fill(rempliDInt, 7); // remplir avec des 7
        System.out.print("\nArrays.fill(rempliDInt, 7) : ");
        System.out.println(Arrays.toString(rempliDInt));
    }

    public static void main(String[] args) {
        new UtilisationDeTableaux();
    }
}

