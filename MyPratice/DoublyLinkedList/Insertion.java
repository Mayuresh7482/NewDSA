package MyPratice.DoublyLinkedList;

public class Insertion {
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

    public static Node insertAtHead(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        return newNode;
    }

    public static void insertAtTail(Node head, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        if (head == null) {
            head = newNode;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public static void insertAtPosition(Node head, int data, int position) {
        if (position == 0) {
            head = insertAtHead(head, data);
            return;
        }

        Node temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
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

        a = insertAtHead(a, 5);
        System.out.println("List after inserting at head:");
        display(a);

        insertAtTail(a, 60);
        System.out.println("List after inserting at tail:");
        display(a);

        insertAtPosition(a, 45, 3);
        System.out.println("List after inserting at position 3:");
        display(a);
    }
}
