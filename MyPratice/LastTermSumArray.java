package MyPratice;

import java.util.Scanner;


public class LastTermSumArray {

    static int[] makePrefixSumArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }

    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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
        // Print the original array
        System.out.println("Original array:");
        PrintArray(arr);

        // Calculate the prefix sum array
        int[] prefixSumArray = makePrefixSumArray(arr);

        // Print the prefix sum array
        System.out.println("Prefix sum array:");
        PrintArray(prefixSumArray);

       
    }


}
