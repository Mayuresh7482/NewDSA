package MyPratice.arrayList;

import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();

        // add new element

        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        //  get an element at index i

        System.out.println(l1.get(0));

        // print via for loop

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }
        System.out.println();

        // printing array list directly
        System.out.println("Directly :  " + l1);

        // adding element at some index i // [5 6 100 7 8]

        l1.add(2, 100);
        System.out.println("New element add " + l1);

        // modify element at index i
        l1.set(2, 10);
        System.out.println("New element set " + l1);

        // remove element at index i
        l1.remove(2);
        System.out.println("New element remove " + l1);

        //
        l1.remove(Integer.valueOf(8));
        System.out.println("New element remove using Integer.valueOf " + l1);
        System.out.println("if not exist l1.remove(Integer.valueOf(10)) then it will return boolean  " + l1.remove(Integer.valueOf(10)));

        // checking if an element exists
        boolean b = l1.contains(Integer.valueOf(6));
        System.out.println("using boolean l1.contains(Integer.valueOf(6)) " + b);

        ArrayList l = new ArrayList();
        l.add("String");
        l.add(1);
        l.add(true);
        System.out.println("Without using Wapper class " + l);

    }
}
