package MyPratice.recursion;

import java.util.Scanner;
public class Factorial {
    static int factorial(int n){
        if(n==1) {
            return 1;
        }

        // three lines same work
//        int smallans= factorial(n-1);
//        int ans = n* smallans;
//        return ans;

        // one line same work
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" is "+factorial(n));

    }
}


