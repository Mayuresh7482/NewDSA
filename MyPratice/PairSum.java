package MyPratice;

import java.util.Scanner;

public class PairSum {

    static int Pair(int[] a, int target) {
        int n = a.length;
        int ans = 0;
        for (int i = 0; i < n; i++) { // First number 
            for (int j = i + 1; j < n; j++) { // Next number
                if (a[i] + a[j] == target) {
                    System.out.println("[ " + a[i] + " , " + a[j] + " ]");
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.println("Enter the number of elements in the array:");
        int arraySize = sc.nextInt();

        // Create an array based on the user's input
        int[] arr = new int[arraySize];

        // Input each element of the array
        System.out.println("Enter " + arraySize + " elements of the array:");
        for (int i = 0; i < arraySize; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Target Value : ");
        int target = sc.nextInt();
        System.out.println("Number of Pairs with sum " + target + " is " + Pair(arr, target));
        sc.close();
    }
}
