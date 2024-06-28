package MyPratice;

import java.util.Scanner;

public class Maths {

    int a, b;

    Maths(int x, int y) {
        a = x;
        b = y;
    }

    public static void main(String[] args) {
        int x, y;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter two numbers: ");
            System.out.println("Enter first number: ");
            
            x = scanner.nextInt();
            System.out.println("Enter Second number : ");
            y = scanner.nextInt();
            Maths m = new Maths(x, y);
            
            System.out.println("Addition is " + m.add());
            System.out.println("Subtraction is " + m.sub());
            System.out.println("Multiplication is " + m.mul());
            System.out.println("Division is " + m.div());
            System.out.println("Modulus is " + m.mod());
        }
    }

    public int add() {
        return a + b;
    }

    public int sub() {
        return a - b;
    }

    public int mul() {
        return a * b;
    }

    public int div() {
        return a / b;
    }

    public int mod() {
        return a % b;
    }

}
