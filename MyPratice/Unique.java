package MyPratice;

import java.util.Scanner;

public class Unique {

    static int unique(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    a[i] = -1;
                    a[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                ans = a[i];
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

        System.out.println("The unique element is: " + unique(arr));
        sc.close();
    }
}
