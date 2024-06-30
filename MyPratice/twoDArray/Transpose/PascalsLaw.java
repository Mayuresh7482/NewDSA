package MyPratice.twoDArray.Transpose;

import java.util.Scanner;

public class PascalsLaw {

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

    static int[][] pascals(int n) {
        int[][] ans = new int[n][];
        for (int i = 0; i < n; i++) {
            // ith row has i+1 columns
            ans[i] = new int[i + 1];
            // first and last element of row and column is 1
            ans[i][0] = ans[i][i] = 1;
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter no. for Matrix ");
            int n = sc.nextInt();
            int[][] ans = pascals(n);
            printArray(ans);
        }

    }
}
