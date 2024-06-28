package MyPratice;

import java.util.Scanner;

public class FirstRepeatingNumber {

    static int firstNumber(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("At index " + arr[j]);
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
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
            System.out.println("The first repeating number is: " + firstNumber(arr));
        }
    }
}
