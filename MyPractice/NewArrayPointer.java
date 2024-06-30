package MyPractice;

import java.util.Scanner;

public class NewArrayPointer {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortZeroandOnes(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            // Move left index forward if it's pointing to a 0
            while (left < right && arr[left] == 0) {
                left++;
            }
            // Move right index backward if it's pointing to a 1
            while (left < right && arr[right] == 1) {
                right--;
            }
            // Swap elements if left is less than right
            if (left < right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
    }

    static void sortParity(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 == 1) {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.println("Enter the number of elements in the array:");
        int arraySize = sc.nextInt();

        // Create an array based on the user's input
        int[] arr = new int[arraySize];

        // Input each element of the array
        System.out.println("Enter " + arraySize + " elements of the array (0s and 1s):");
        for (int i = 0; i < arraySize; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array:");
        printArray(arr);

        //sortZeroandOnes(arr);
        sortParity(arr);
        System.out.println("Sorted Array:");
        printArray(arr);

        sc.close();
    }
}
