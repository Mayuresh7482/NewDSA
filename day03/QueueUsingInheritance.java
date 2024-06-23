package day03;

public class QueueUsingInheritance<T> extends GenericLinkedList<T> implements Queue<T> {

    @Override
    public void enqueue(T item) {
        addLast(item);
    }

    @Override
    public T dequeue() {
        return removeFirst();
    }

    @Override
    public T peek() {
        return getFirst();
    }
}
