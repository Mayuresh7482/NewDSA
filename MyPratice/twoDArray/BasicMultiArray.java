package MyPratice.twoDArray;

import java.util.Scanner;

public class BasicMultiArray {

    static void printArray(int[][] arr) {
        for (int[] arr1 : arr) {
            // rows
            for (int j = 0; j < arr1.length; j++) {
                // cols
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter no. rows ");
            int rows = sc.nextInt();
            System.out.println("Enter no. columns ");
            int cols = sc.nextInt();

            int[][] arr = new int[rows][cols];
            System.out.println("Enter " + rows * cols + " elements ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = sc.nextInt();
                }

            }
            printArray(arr);
        }

    }
}
