package MyPratice.recursion;

import java.util.Scanner;

public class basic {

    static void printIncreasing(int n){
        if
        (n==1){
            System.out.println(n);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }

    static void printDecreasing(int n){

        // Base condition
        if(n==1) {
            System.out.println(n);
            return;
        }

        // self work
        System.out.println(n);

        // small work sub problem
        printDecreasing(n-1);
    }










    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number : ");
//        int n = sc.nextInt();

//        printIncreasing(n);

//        printDecreasing(n);








    }
}
