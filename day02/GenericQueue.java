package day02;


public class GenericQueue<T> {
    private final T[] queue;
    private int front;
    private int rear;
    private int size;
    private final int capacity;

    // Constructor
    public GenericQueue(int capacity) {
        this.capacity = capacity;
        queue = (T[]) new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public static void main(String[] args) {
        GenericQueue<Integer> queue = new GenericQueue<>(5);
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue.dequeue()); // Output: 1
        System.out.println(queue.peek());    // Output: 2
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Return the number of items in the queue
    public int size() {
        return size;
    }

    // Enqueue an item to the queue
    public void enqueue(T item) {
        if (isFull()) {
            throw new RuntimeException("day03.Queue overflow");
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
    }

    // Dequeue an item from the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("day03.Queue underflow");
        }
        T item = queue[front];
        queue[front] = null;  // Avoid loitering
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    // Peek the front item of the queue
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("day03.Queue underflow");
        }
        return queue[front];
    }
}
