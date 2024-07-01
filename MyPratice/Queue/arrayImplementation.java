package MyPratice.Queue;

public class arrayImplementation {

    public static class queueArray {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];

        public void add(int value) {
            if (rear == arr.length - 1) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            arr[++rear] = value;
            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int removedValue = arr[front];
            front++;
            size--;
            if (size == 0) { // Reset the queue if it becomes empty
                front = -1;
                rear = -1;
            }
            return removedValue;
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
            } else {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        queueArray q = new queueArray();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();
        System.out.println("Peek first element : "+q.peek());
        System.out.println("Size : "+q.size);

    }
}
