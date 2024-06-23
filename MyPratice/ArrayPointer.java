package MyPratice;

import java.util.Scanner;

public class ArrayPointer {

     static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void  swap(int[] arr, int i, int j){
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;

    }

    static void sortZeroandOnes(int[] arr) {
         int n=arr.length;
         int zero=0;
         for(int i=0;i<n;i++){
             if(arr[i]==0){
                 zero++;
             }
         }
         for(int i=0;i<n;i++){
             if(i<zero){
                 arr[i]=0;
             }
             else {
                 arr[i]=1;
             }
         }
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

        System.out.println();
        System.out.println("Orignal Array : ");

        printArray(arr);
        System.out.println("\nSorted Array : ");
        sortZeroandOnes(arr);
        printArray(arr);
    }
}
