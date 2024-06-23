package MyPratice.twoDArray;

import java.util.Scanner;

public class SumMutli {

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) { // rows
            for (int j = 0; j < arr[i].length; j++) { // cols
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void sum(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Invalid Input");
            return;
        }
        int[][] sum = new int[r1][c1];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Sum of Matrix 1  and  Matrix 2 ");
        printArray(sum);
    }

    static void mutli(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Invalid Input");
            return;
        }

        int[][] mult = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mult[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        System.out.println("Multiplication of Matrix 1  and  Matrix 2 ");
        printArray(mult);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. rows for First Matrix ");
        int rows1 = sc.nextInt();
        System.out.println("Enter no. columns for First Matrix ");
        int cols1 = sc.nextInt();

        int[][] arr1 = new int[rows1][cols1];
        System.out.println("Enter " + rows1 * cols1 + " elements for Matrix 1 ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter no. rows for Second Matrix ");
        int rows2 = sc.nextInt();
        System.out.println("Enter no. columns for Second Matrix ");
        int cols2 = sc.nextInt();
        int[][] arr2 = new int[rows2][cols2];

        System.out.println("Enter " + rows2 * cols2 + " elements for Matrix 2 ");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1 ");
        printArray(arr1);
        System.out.println("Matrix 2 ");
        printArray(arr2);

        // Call the sum method
//        sum(arr1, rows1, cols1, arr2, rows2, cols2);

        // call the mutli method
        mutli(arr1, rows1, cols1, arr2, rows2, cols2);
    }
}
