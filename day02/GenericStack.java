package day02;

public class GenericStack<T> {

    private T[] stack;
    private int size;

    // Constructor
    @SuppressWarnings("unchecked")
    public GenericStack() {
        stack = (T[]) new Object[10];
        size = 0;
    }

    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Pushed : ");
        stack.display();
        System.out.println(stack.pop());
        System.out.println("Popped : ");
        stack.display();
        System.out.println("Peeked : ");
        System.out.println(stack.peek());

        stack.display();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Return the number of items in the stack
    public int size() {
        return size;
    }

    // Resize the array
    private void resize(int capacity) {
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[capacity];
        if (size >= 0) System.arraycopy(stack, 0, newArray, 0, size);
        stack = newArray;
    }

    // Push an item onto the stack
    public void push(T item) {
        if (size == stack.length) {
            resize(2 * stack.length);
        }
        stack[size++] = item;
    }

    // Pop an item from the stack
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow");
        }
        T item = stack[--size];
        stack[size] = null;  // Avoid loitering
        if (size > 0 && size == stack.length / 4) {
            resize(stack.length / 2);
        }
        return item;
    }

    // Peek the top item of the stack
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow");
        }
        return stack[size - 1];
    }

    void display() {
        for (T a : stack) {
            if (a != null) {
                System.out.print(a + " ");
            }
        }
        System.out.println();
    }
}
