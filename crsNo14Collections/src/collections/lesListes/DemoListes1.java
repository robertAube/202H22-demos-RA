package collections.lesListes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoListes1 {
    List<Integer> liste;
    ArrayList<Integer> vecteur;

    public DemoListes1() {
        liste = new LinkedList<Integer>();
        vecteur = new ArrayList<Integer>();
        testListe();
    }

    public void testListe() {
        peupler(liste, 0);
        peupler(vecteur, 2);
        System.out.println(this);

        liste = new LinkedList<Integer>(vecteur);
        System.out.println("On a pris les éléments du vecteur et on a fait une LinkedList : " + liste);

        LinkedList linkedList = (LinkedList) liste;  //on doit caster liste pour avoir les services de LinkedList
        System.out.println("On a getLast() dans la LinkedList : " + linkedList.getLast());

        linkedList.removeLast();
        System.out.println("On a removeLast() dans la LinkedList : " + liste);

        linkedList.addFirst(5);
        System.out.println("On a addFirst(5) dans la LinkedList : " + liste);

        linkedList.clear();
        System.out.println("On a clear() la LinkedList : " + liste);
    }

    private void peupler(List<Integer> liste, int valueToAdd) {
        liste.add(10 + valueToAdd);
        liste.add(20 + valueToAdd);
        liste.add(30 + valueToAdd);
    }

    @Override
    public String toString() {
        return "ListeLink{liste=" + liste + ", vecteur=" + vecteur + '}';
    }

    public static void main(String[] args) {
        new DemoListes1();
    }
}
