package day01;

import java.util.Scanner;

public class MenuDrivenProgram {

    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            int[] array = new int[5];
            System.out.println("Enter 5 elements of array: ");
            for (int i = 0; i < 5; i++) {
                array[i] = scanner.nextInt();
            }
            do {
                System.out.println("1. Maximum of array");
                System.out.println("2. Minimum of array");
                System.out.println("3. Sum of array");
                System.out.println("4. Second highest of array");
                System.out.println("5. Delete an element from array");
                System.out.println("Enter your choice: ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Maximum of array is: " + findMax(array));
                        break;
                    case 2:
                        System.out.println("Minimum of array is: " + findMin(array));
                        break;
                    case 3:
                        System.out.println("Sum of array is: " + findSum(array));
                        break;
                    case 4:
                        System.out.println("Second highest of array is: " + findSecondHighest(array));
                        break;
                    case 5:
                        System.out.println("Enter the index of the element to delete: ");
                        int indexToDelete = scanner.nextInt();
                        array = deleteElement(array, indexToDelete);
                        System.out.println("Updated array after deletion:");
                        printArray(array);
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } while (choice != 5);
        }
    }

    static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    static int findSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    static int findSecondHighest(int[] array) {
        int highest = 0;
        int secondHighest = 0;

        for (int num : array) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num < highest) {
                secondHighest = num;
            }
        }

        return secondHighest;
    }

    static int[] deleteElement(int[] array, int indexToDelete) {
        // Check if the index is within the bounds of the array
        if (indexToDelete < 0 || indexToDelete >= array.length) {
            System.out.println("Index out of bounds.");
            return array; // Return the original array if the index is invalid
        }

        // Create a new array excluding the element at the specified index
        int[] newArray = new int[array.length - 1];

        // Copy elements from the old array to the new array, skipping the element at indexToDelete
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == indexToDelete) continue; // Skip the element to delete
            newArray[j++] = array[i];
        }

        return newArray;
    }
}
