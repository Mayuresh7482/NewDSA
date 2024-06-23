package MyPratice;

import java.util.Scanner;

public class pratice {

    public static void main(String[] args) {
        // Ask the user for the size of the array
        try (Scanner scanner = new Scanner(System.in)) {
            // Ask the user for the size of the array
            System.out.println("Enter the number of elements in the array:");
            int arraySize = scanner.nextInt();

            // Create an array based on the user's input
            int[] array = new int[arraySize];

            // Input each element of the array
            System.out.println("Enter " + arraySize + " elements of the array:");
            for (int i = 0; i < arraySize; i++) {
                array[i] = scanner.nextInt();
            }
            int choice;
            do {
                System.out.println("1.Maximum of array");
                System.out.println("2.Minimum of array");
                System.out.println("3.Sum of array");
                System.out.println("4.second highest of array");
                System.out.println("5.Exit");
                System.out.println("Enter your choice ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("1.Maximum of array is " + max(array));
                        break;
                    case 2:
                        System.out.println("2.Minimum of array is " + min(array));
                        break;
                    case 3:
                        System.out.println("3.Sum of array is " + sum(array));
                        break;
                    case 4:
                        System.out.println("4.second highest of array is " + secondHighest(array));
                        break;
                    case 5:
                        System.out.println("5.Exiting");
                        break;
                    default:
                        System.out.println("invalid choice try again ...");

                }
            } while (choice != 5);
        }
    }

    static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;

    }

    static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    static int secondHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        // Iterate over each element in the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] > highest) {
                secondHighest = highest;
                highest = array[i];
            }
            // If the current element is not the highest but is greater than the second highest,
            // and it's not equal to the highest (to handle duplicates), update the second highest
            else if (array[i] > secondHighest && array[i] != highest) {
                secondHighest = array[i];
            }
        }

        // After checking all elements, if the second highest value is still the initial minimum value,
        // it means either the array was empty or all elements were identical, neither of which is valid
        // for finding a second highest value. In such cases, throw an exception.
        if (secondHighest == Integer.MIN_VALUE) {
            throw new RuntimeException("Array must have at least two distinct elements");
        }

        // Return the second highest value found in the array
        return secondHighest;
    }

    static int[] insertElement(int[] array, int position, int element) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[position] = element;
        return newArray;
    }

    static int[] deleteElement(int[] array, int position) {
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, position);
        System.arraycopy(array, position + 1, newArray, position, array.length - position - 1);
        return newArray;
    }

}
