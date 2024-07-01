package Assignment_25;

class CircularDoublyLinkedList {
    class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
            this.next = this.prev = this;
        }
    }

    Node head = null;

    public void delete(int element) {
        if (head == null) return;

        Node current = head;

        do {
            if (current.data == element) {
                if (current == head) {
                    if (head.next == head) { // only one node
                        head = null;
                        return;
                    } else {
                        head = head.next;
                    }
                }
                current.prev.next = current.next;
                current.next.prev = current.prev;
                return;
            }
            current = current.next;
        } while (current != head);
    }

    public void deleteAll(int element) {
        if (head == null) return;

        Node current = head;

        do {
            if (current.data == element) {
                if (current == head) {
                    if (head.next == head) { // only one node
                        head = null;
                        return;
                    } else {
                        head = head.next;
                    }
                }
                current.prev.next = current.next;
                current.next.prev = current.prev;
                if (current.next == head) {
                    break; // break the loop to avoid infinite loop
                }
                current = current.next;
            } else {
                current = current.next;
            }
        } while (current != head);

        // Additional check in case the head node was the only occurrence
        if (head != null && head.data == element) {
            delete(element);
        }
    }

    // Utility function to add node for testing
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node tail = head.prev;
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    // Utility function to display the list
    public void display() {
        if (head == null) return;

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);

        System.out.println("List before deletion:");
        list.display();

        list.delete(2);

        System.out.println("List after deletion:");
        list.display();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);

        System.out.println("List before deletion:");
        list.display();

        list.deleteAll(2);

        System.out.println("List after deletion:");
        list.display();
    }
}
