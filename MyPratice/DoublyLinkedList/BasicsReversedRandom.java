package MyPratice.DoublyLinkedList;

public class BasicsReversedRandom {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }

        static void display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }

    static void displayReversed(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    static void displayRandom(Node random){
        Node temp = random;
        while (temp.prev!= null) {
            temp = temp.prev;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;

        b.next = c;
        b.prev = a;
        c.next = d;
        c.prev = b;
        d.next = e;
        d.prev = c;

        e.prev = d;

        System.out.println("Original List:");
        Node.display(a);
        System.out.println("Reversed List:");
        displayReversed(e);
        System.out.println("Randomized");
        displayRandom(c);

    }
}
