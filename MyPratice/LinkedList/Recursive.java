package MyPratice.LinkedList;

public class Recursive {
    public static void display(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        display(head.next);
    }

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(7);

        a.next = b;
        b.next = c;
        c.next = d;
        display(a);
    }

}
