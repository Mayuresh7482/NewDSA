package MyPratice.twoDArray.Transpose;

import java.util.Scanner;

public class BasicTranspose {

    static void printArray(int[][] arr) {
        for (int[] arr1 : arr) {
            // rows
            for (int j = 0; j < arr.length; j++) {
                // cols
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }
    }

    // static int[][] transpose(int[][] arr, int r, int c) {
    //     int[][] ans = new int[c][r];
    //     for (int i = 0; i < c; i++) {
    //         for (int j = 0; j < r; j++) {
    //             ans[i][j] = arr[j][i];
    //         }
    //     }
    //     return ans;
    // }

    static void transposeWithoutNewArray(int r, int c, int[][] arr) {
        for (int i = 0; i < c; i++) {
            //for (int j = 0; j < r; j++)
            for (int j = i; j < r; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter no. rows for Matrix ");
            int rows = sc.nextInt();
            System.out.println("Enter no. columns for Matrix ");
            int cols = sc.nextInt();

            int[][] arr1 = new int[rows][cols];
            System.out.println("Enter " + rows * cols + " elements for Matrix ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    arr1[i][j] = sc.nextInt();
                }
            }

            System.out.println("Matrix  ");
            printArray(arr1);
            System.out.println("Transpose ");
//        int[][] newArr = transpose(arr1, rows, cols);
//        printArray(newArr);
            // without new Array
            transposeWithoutNewArray(rows, cols, arr1);
            printArray(arr1);
        }
    }
}
