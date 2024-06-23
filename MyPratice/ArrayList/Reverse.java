package MyPratice.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {
    static void reverseList(ArrayList<Integer> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            Integer temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        System.out.println("Original list  " + list);
//        reverseList(list);
        Collections.reverse(list);
        System.out.println("Reversed list  " + list);
    }
}
