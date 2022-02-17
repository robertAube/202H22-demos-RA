package tri;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AlgoTriIntTest {
    private ArrayList<PaireTabInt> pairsDeTab;

    @BeforeEach
    private void setUp() {
        PaireTabInt paireTab;

        pairsDeTab = new ArrayList<>();

        paireTab = new PaireTabInt(new int[]{}, new int[]{});
        pairsDeTab.add(paireTab);
        paireTab = new PaireTabInt(new int[]{1}, new int[]{1});
        pairsDeTab.add(paireTab);
        paireTab = new PaireTabInt(new int[]{1, 2}, new int[]{1, 2});
        pairsDeTab.add(paireTab);
        paireTab = new PaireTabInt(new int[]{2, 1}, new int[]{1, 2});
        pairsDeTab.add(paireTab);
        paireTab = new PaireTabInt(new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1});
        pairsDeTab.add(paireTab);
        paireTab = new PaireTabInt(new int[]{4, 3, 2, 1}, new int[]{1, 2, 3, 4});
        pairsDeTab.add(paireTab);
        paireTab = new PaireTabInt(new int[]{1, 3, 2, 1}, new int[]{1, 1, 2, 3});
        pairsDeTab.add(paireTab);
        paireTab = new PaireTabInt(new int[]{1, 12, 4, 5, 21, 8, 111}, new int[]{1, 4, 5, 8, 12, 21, 111});
        pairsDeTab.add(paireTab);
        paireTab = new PaireTabInt(new int[]{111, 12, 4, 5, 21, 8, 1}, new int[]{1, 4, 5, 8, 12, 21, 111});
        pairsDeTab.add(paireTab);
    }

    @Test
    void triSelection() {
        int tabPourTest[];
        int tabApresTri[];
        int tabAttendu[];

        PaireTabInt pairePourTest;

        for (PaireTabInt pTab : pairsDeTab) {
            tabPourTest = pTab.getTab1();
            tabAttendu = pTab.getTab2();

            System.out.print(Arrays.toString(tabPourTest) + " -> ");

            AlgoTriInt.triSelection(tabPourTest);
            //ici tabPourTest est trié. On l'affecte à une nouvelle variable pour bien indiquer qu'il devrait maitenant être trié.
            tabApresTri = tabPourTest;

            pairePourTest = new PaireTabInt(tabAttendu, tabApresTri);

            System.out.println(pairePourTest + " (tabAttendu, tabApresTri)");

            assertTrue(pairePourTest.memeLongueur());
            assertTrue(pairePourTest.sontDesTableauxEgaux());
        }
    }
}