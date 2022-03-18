package collections.lesListes;

import java.util.*;

public class DemoListes2 {

    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();
        list.add("Bernadine ");
        list.add(" Elisabeth");
        list.add("Gene ");
        list.add("Elisabeth  ");
        list.add("Clara  ");
        System.out.println("ArrayList=" + list);

        // nettoyer la liste des espaces
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            it.set(it.next().trim()); //pour set ça prend ListIterator
        }
        System.out.println("ArrayList=" + list);

        System.out.println("list.get(2): " + list.get(2));
        System.out.println("list.get(0): " + list.get(0));

        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.addFirst("Bernadine");
        linkedList.addFirst("Elisabeth");
        linkedList.addFirst("Gene");
        linkedList.addFirst("Elisabeth");
        linkedList.addFirst("Clara");

        System.out.println("linkedList=" + linkedList);

        linkedList.removeFirst();
        System.out.println("linkedList.removeFirst() - linkedList =" + linkedList);
        linkedList.removeLast();
        System.out.println("linkedList.removeLast() - linkedList =" + linkedList);
    }
}
