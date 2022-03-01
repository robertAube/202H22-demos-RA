package clone;

public class AppCloneContenant {
    Liquide eau = new Liquide("Eau", 1000);

    public AppCloneContenant() {
        clonerContenant();
    }

    private void clonerContenant() {
        ContenantLiquide pipetteDEau = new ContenantLiquide("Pipette", eau, 250, 200);

        System.out.println(pipetteDEau);

        //Coloner la pipette d'eau
        ContenantLiquide pipetteDeLait = null; //remplacer null par la bonne instruction pour cloner.

        //Modifier la pipette d'eau pour avoir une pipette de lait
        pipetteDeLait.getLiquide().setNom("Lait");
        pipetteDeLait.getLiquide().setMasseVolumique_KgParM3(1030);

        System.out.println(pipetteDeLait);
        System.out.println(pipetteDEau);
//Résultat attendu :
//        Pipette - {Eau - {masseVolumique= 1000 Kg/M3}, qteMaxMl=250, qte=200}
//        Pipette - {Lait - {masseVolumique= 1030 Kg/M3}, qteMaxMl=250, qte=200}
//        Pipette - {Eau - {masseVolumique= 1000 Kg/M3}, qteMaxMl=250, qte=200}
    }


    public static void main(String[] args) {
        new AppCloneContenant();
    }
}
