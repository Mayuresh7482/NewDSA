package MyPratice.DoublyLinkedList;

public class Palindrome {
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

    public static boolean isPalindrome(Node head) {
        if (head == null) return true;

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        while (head != tail && head.prev != tail) {
            if (head.data != tail.data) {
                return false;
            }
            head = head.next;
            tail = tail.prev;
        }

        return true;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(1);

        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;

        System.out.println("Is palindrome? " + isPalindrome(a));
    }
}

