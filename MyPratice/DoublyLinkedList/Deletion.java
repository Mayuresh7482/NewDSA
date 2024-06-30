package MyPractice.DoublyLinkedList;

public class Deletion {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node deleteHead(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        head = head.next;
        head.prev = null;
        return head;
    }

    public static Node deleteTail(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
        return head;
    }

    public static Node deleteAtPosition(Node head, int position) {
        if (head == null || position < 0) {
            return head;
        }
        if (position == 0) {
            return deleteHead(head);
        }
        Node temp = head;
        for (int i = 0; temp != null && i < position; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            return head;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;

        System.out.println("Original List:");
        display(a);

        a = deleteHead(a);
        System.out.println("After deleting head:");
        display(a);

        a = deleteTail(a);
        System.out.println("After deleting tail:");
        display(a);

        a = deleteAtPosition(a, 1);
        System.out.println("After deleting at position 1:");
        display(a);
    }
}
