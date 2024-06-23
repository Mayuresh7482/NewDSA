package day03;

public class QueueUsingComposition<T> implements Queue<T> {
    private final GenericLinkedList<T> list;

    public QueueUsingComposition() {
        list = new GenericLinkedList<>();
    }

    @Override
    public void enqueue(T item) {
        list.addLast(item);
    }

    @Override
    public T dequeue() {
        return list.removeFirst();
    }

    @Override
    public T peek() {
        return list.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }
}

