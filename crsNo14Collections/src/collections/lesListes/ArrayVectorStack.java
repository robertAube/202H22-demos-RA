package collections.lesListes;

import java.util.*;

public class ArrayVectorStack {
    List<Integer> liste1;
    List<Integer> liste2;
    Stack<Integer> stack;
    Integer[] tableau;

    public ArrayVectorStack() {
        demoStack();
        demoListeTableau();
    }

    private void demoStack() {
        stack = new Stack<Integer>();
        stack.push(1);
        System.out.println("stack.push(1) stack=" + stack);
        stack.push(2);
        System.out.println("stack.push(2) stack=" + stack);
        stack.push(3);
        System.out.println("stack.push(3) stack=" + stack);

        System.out.println("stack.peek() retourne : " + stack.peek() + " stack=" + stack);
        System.out.println("stack.pop() retourne : " + stack.pop() + " stack=" + stack);

        stack.remove(0);
        System.out.println("stack.remove(0) (oui, c'est bizarre : Stack hérite de Vector) stack=" + stack);
    }

    private void demoListeTableau() {
        tableau = new Integer[5];

        liste1 = new ArrayList<Integer>();
        liste1.add(2);
        liste1.add(3);
        liste1.add(4);
        liste1.add(5);
        System.out.println("liste1 rempli avec des add : " + liste1);
        liste1.toArray(tableau);
        System.out.println("tableau rempli avec liste1: " + liste1 + " tableau:" + Arrays.toString(tableau));

        liste2 = new Vector<Integer>(liste1);
        System.out.println("liste2 rempli avec liste1: " + liste1 + " liste2:" + liste2);

        liste1.remove(0);
        System.out.println("on remove(0) à liste1 : " + "liste1=" + liste1);
        liste1.remove(new Integer(4));
        System.out.println("on remove(new Integer(4)) à liste1 : " + "liste1=" + liste1);

        liste1.set(0, 99);
        System.out.println("on set(0, 99) à liste1 : " + "liste1=" + liste1);
    }



//    @Override
//    public String toString() {
//        return "liste1=" + liste1 +", liste2=" + liste2
//                + ", stack=" + stack + ", tableau=" + Arrays.toString(tableau);
//    }


    public static void main(String[] args) {
        new ArrayVectorStack();
    }
}