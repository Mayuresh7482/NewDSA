package MyPratice.TwoDArray;

import java.util.Scanner;

public class GenerateSpiral {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) { // rows
            for (int j = 0; j < arr[i].length; j++) { // cols
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] SpiralOrder(int n) {
        int[][] arr = new int[n][n];
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int current = 1;
        while (current <= n * n) {
            // Traverse top row from left to right
            for (int j = leftCol; j <= rightCol && current <= n * n; j++) {
                arr[topRow][j] = current;
                current++;
            }
            topRow++;
            // Traverse right column from top to bottom
            for (int i = topRow; i <= bottomRow && current <= n * n; i++) {
                arr[i][rightCol] = current;
                current++;
            }
            rightCol--;
            // Traverse bottom row from right to left
            for (int j = rightCol; j >= leftCol && current <= n * n; j--) {
                arr[bottomRow][j] = current;
                current++;
            }
            bottomRow--;
            // Traverse left column from bottom to top
            for (int i = bottomRow; i >= topRow && current <= n * n; i--) {
                arr[i][leftCol] = current;
                current++;
            }
            leftCol++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows for Matrix:");
        int rows = sc.nextInt();

        System.out.println("Spiral Generated Matrix:");
        int[][] spiral = SpiralOrder(rows);
        printArray(spiral);
    }
}
