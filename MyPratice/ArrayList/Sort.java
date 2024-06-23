package MyPratice.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(40);
        list.add(30);
        list.add(30);
        System.out.println("Before Sorting  " + list);
        Collections.sort(list);
        System.out.println("Sorted List in Ascending Order default  " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted List in Descending Order default  " + list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("Mayuresh");
        list1.add("How");
        list1.add("Are");
        list1.add("are");
        list1.add("you");
        System.out.println("Original list " + list1);
        Collections.sort(list1);
        System.out.println("Sorted List in Ascending Order default  " + list1);
    }
}
