package MyPratice;

import java.util.Scanner;

public class SecondHighest {

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int findSecondMax(int[] arr) {
        int max = findMax(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }

        }
        int secondMax = findMax(arr);
        return secondMax;
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
        System.out.println("The second highest element is: " + findSecondMax(arr));
        sc.close();
    }
}
