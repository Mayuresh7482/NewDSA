package MyPratice;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {

    static void swapfunc(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void ReverseArray(int[] arr) {
        int j = arr.length - 1, i = 0;
        while (i < j) {
            swapfunc(arr, i, j);
            i++;
            j--;
        }

        System.out.println("Reversed Array : " + Arrays.toString(arr));
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
        ReverseArray(arr);
        sc.close();
    }
}
