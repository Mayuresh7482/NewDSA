package day03;

public class GenericLinkedList<T> {
    private Node head;
    private Node tail;
    private int size;

    public GenericLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addLast(T data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public T removeFirst() {
        if (head == null) {
            return null;
        }
        T data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return data;
    }

    public T getFirst() {
        return (head != null) ? head.data : null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }
}
