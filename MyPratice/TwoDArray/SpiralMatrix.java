package MyPratice.TwoDArray;

import java.util.Scanner;

public class SpiralMatrix {

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) { // rows
            for (int j = 0; j < arr[i].length; j++) { // cols
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void SpiralOrder(int[][] arr, int r, int c) {
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalElements = 0;
        while (totalElements < r * c) {
            // Traverse top row from left to right
            for (int j = leftCol; j <= rightCol && totalElements < r * c; j++) {
                System.out.print(arr[topRow][j] + " ");
                totalElements++;
            }
            topRow++;
            // Traverse right column from top to bottom
            for (int i = topRow; i <= bottomRow && totalElements < r * c; i++) {
                System.out.print(arr[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;
            // Traverse bottom row from right to left
            for (int j = rightCol; j >= leftCol && totalElements < r * c; j--) {
                System.out.print(arr[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;
            // Traverse left column from bottom to top
            for (int i = bottomRow; i >= topRow && totalElements < r * c; i--) {
                System.out.print(arr[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows for Matrix:");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns for Matrix:");
        int cols = sc.nextInt();

        int[][] arr1 = new int[rows][cols];
        System.out.println("Enter " + rows * cols + " elements for Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");
        printArray(arr1);

        System.out.println("Spiral Matrix:");
        SpiralOrder(arr1, rows, cols);
    }
}
