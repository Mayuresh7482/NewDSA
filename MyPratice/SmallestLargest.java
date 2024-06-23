package MyPratice;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestLargest {

    static int[] smallestlargestNo(int[] a) {
        Arrays.sort(a);
        System.out.println("Sorted Array : " + Arrays.toString(a));

        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.println("Enter the number of elements in the array:");
        int arraySize = sc.nextInt();

        // Create an array based on the user's input
        int[] arr = new int[arraySize];

        // Input each element of the array
        System.out.println("Enter " + arraySize + " elements of the array:");
        for (int i = 0; i < arraySize; i++) {
            arr[i] = sc.nextInt();
        }


        int[] ans = smallestlargestNo(arr);
        System.out.println("Smallest : " + ans[0]);
        System.out.println("Largest : " + ans[arr.length - 1]);
        sc.close();
    }
}
