package MyPratice;

import java.util.Arrays;

public class ArrayCopy {

    // Modifies the elements of the array in-place since arrays are passed by reference.
    static void change_array(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = 0;
        }
    }

    // Attempts to change the value of the passed integer variable to 0.
    // However, this does not affect the original variable because primitives are passed by value,
    // meaning a copy of the variable's value is passed, not the variable itself.
    static void change(int n) {
        n = 0;
    }

    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int x = 3;

        System.out.println("Before " + x); // Original value of x
        change(x); // Passes a copy of x's value, so x remains unchanged.
        System.out.println("After " + x); // x is still 3 because the change method didn't alter the original x.

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Before array modification: ");
        PrintArray(arr);
        // Prints each element of arr before modification.

        int[] arr2 = arr;
        System.out.println("Copied array arr2 : ");
        PrintArray(arr2);
        // Prints each element of arr before modification.
        System.out.println("Original array : ");
        PrintArray(arr); // Prints each element of arr before modification.
        arr2[0] = 0;
        arr2[1] = 0;
        // arr2 = arr.clone(); // Deep copy
        arr2 = Arrays.copyOf(arr, arr.length); // Deep Copy

        change_array(arr); // Passes a reference to arr, allowing modifications to its elements.
        System.out.println("After Cloning arr2 : ");
        PrintArray(arr2);// Prints each modified element of arr.

    }
}
