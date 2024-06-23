package MyPratice.recursion;

import java.util.Scanner;

public class Power {
    // more efficient
    static int power(int p, int q){
        if(q==0) {
            return 1;
        }
        int smallPower = power(p,q/2);
        if(q%2==0) {
            // even
            return smallPower * smallPower;
        }
        // odd
        else{
            return p*smallPower * smallPower;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base number : ");
        int p = sc.nextInt();
        System.out.println("Enter the Power number : ");
        int q = sc.nextInt();
        System.out.println("Base "+ p + " power "+q+" is "+power(p,q));
    }
}
