package MyPratice.Queue;

public class CircularQueue {

    public static class CircularQueueArray {
        int[] arr;
        int front;
        int rear;
        int size;

        // Constructor
        public CircularQueueArray(int capacity) {
            arr = new int[capacity];
            front = -1;
            rear = -1;
            size = 0;
        }

        public void add(int data) {
            if (size == arr.length) {
                System.out.println("Queue is full");
                return;
            }
            if (size == 0) {
                front = rear = 0;
                arr[rear] = data;
            } else {
                rear = (rear + 1) % arr.length;
                arr[rear] = data;
            }
            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int temp = arr[front];
            front = (front + 1) % arr.length;
            size--;
            if (size == 0) { // Reset the queue if it becomes empty
                front = -1;
                rear = -1;
            }
            return temp;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            int i = front;
            for (int count = 0; count < size; count++) {
                System.out.print(arr[i] + " ");
                i = (i + 1) % arr.length;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularQueueArray cq = new CircularQueueArray(5);
        cq.display();
        try {
            cq.add(1);
            cq.add(2);
            cq.add(3);
            cq.add(4);
            cq.add(5);
            cq.display();
            cq.remove();
            cq.display();
            System.out.println("Peek: " + cq.peek());
            cq.display();
            cq.add(6);
            cq.display();
            cq.remove();
            cq.display();
            cq.add(7);
            cq.display();
            for (int i = 0; i < cq.arr.length; i++) {
                System.out.print(cq.arr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
