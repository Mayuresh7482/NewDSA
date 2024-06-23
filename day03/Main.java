package day03;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queueInheritance = new QueueUsingInheritance<>();
        queueInheritance.enqueue(1);
        queueInheritance.enqueue(2);
        queueInheritance.enqueue(3);
        System.out.println(queueInheritance.dequeue()); // Output: 1
        System.out.println(queueInheritance.peek()); // Output: 2
        System.out.println(queueInheritance.size()); // Output: 2

        Queue<Integer> queueComposition = new QueueUsingComposition<>();
        queueComposition.enqueue(1);
        queueComposition.enqueue(2);
        queueComposition.enqueue(3);
        System.out.println(queueComposition.dequeue()); // Output: 1
        System.out.println(queueComposition.peek()); // Output: 2
        System.out.println(queueComposition.size()); // Output: 2
    }
}
