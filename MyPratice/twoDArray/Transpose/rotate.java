package MyPratice.twoDArray.Transpose;

import java.util.Scanner;

public class rotate {

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) { // rows
            for (int j = 0; j < arr.length; j++) { // cols
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

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

    static void rotate(int[][] arr, int r) {
        //Transpose

        transposeWithoutNewArray(r, r, arr);

        // reverse each row of transpose matrix

        for (int i = 0; i < r; i++) {
            reverseArray(arr[i]);
        }
    }

    static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        //  for (int i = 0, j = arr.length - 1; i < j; i++, j--)
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        rotate(arr1, rows);
        System.out.println("Rotated Matrix ");

        printArray(arr1);
    }
}
