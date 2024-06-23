package MyPratice;

import java.util.ArrayList;

class Stack<T> {

    ArrayList<T> A;
    int size;
    int top = -1;

    Stack(int size) {
        this.size = size;
        this.A = new ArrayList<>(size);
    }

    void push(T x) {
        if (top == size - 1) {
            System.out.println("MyPratice.Stack is full");
        } else {
            top++;
            A.add(x);
        }
    }

    void pop(T x) {
        if (top == -1) {
            System.out.println("MyPratice.Stack is empty");
        } else {
            top--;
            A.remove(x);

        }
    }

    void display() {

        for (T a : A) {
            System.out.print(a + " ");
        }
        System.out.println();
    }


}

public class GenericPratice {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.print("Array List After Push : ");
        s.display();
        s.pop(1);
        System.out.print("Array List After Pop : ");
        s.display();


    }
}
