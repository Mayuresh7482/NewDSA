package MyPratice.LinkedList;

public class Reverse {
    public static void displayReverse(Node head) {
        if (head == null) {
            return;
        }
        displayReverse(head.next); // Reverse List
        System.out.print(head.data + " ");
    }

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
        System.out.println("Linked list is : ");
        display(a);
        System.out.println();
        System.out.println("Reversed Linked list is : ");
        displayReverse(a);
    }
}
