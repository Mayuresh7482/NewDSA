package MyPratice.LinkedList;

public class LinkedListInsert {
    public static class LinkedListNode {
        Node head = null;
        Node tail = null;
        int size = 0;

        static class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
            }
        }

        void insertAtEnd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void insertAtHead(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAt(int index, int data) {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            if (index == 0) {
                insertAtHead(data);
                return;
            }
            if (index == size) {
                insertAtEnd(data);
                return;
            }
            Node temp = new Node(data);
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            temp.next = prev.next;
            prev.next = temp;
            size++;
        }

        int getAt(int index) {
            if (index < 0 || index >= size) {
                System.out.println("Wrong index");
                return -1;
            }
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAt(int index) {
            if (index < 0 || index >= size) {
                System.out.println("Wrong index");
                return;
            }
            if (index == 0) {
                head = head.next;
                if (head == null) {
                    tail = null;
                }
            } else {
                Node prev = head;
                for (int i = 0; i < index - 1; i++) {
                    prev = prev.next;
                }
                prev.next = prev.next.next;
                if (index == size - 1) {
                    tail = prev;
                }
            }
            size--;
        }

        void display(Node node) {
            if (node == null) {
                return;
            }
            System.out.print(node.data + " -> ");
            display(node.next);
        }

        void display() {
            display(head);
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkedListNode list = new LinkedListNode();
        list.insertAtHead(7);
        list.insertAtEnd(4);
        list.insertAtHead(7);
        list.insertAtEnd(9);
        list.insertAtHead(12);
        list.insertAtEnd(58);
        list.display();
        list.insertAt(2, 10);
        list.display();
        System.out.println("list.getAt(2): " + list.getAt(2));
        System.out.println("list.head.data: " + list.head.data);
        System.out.println("list.tail.data: " + list.tail.data);
        System.out.println("list.size: " + list.size);
        list.deleteAt(2);
        list.display();
    }
}
