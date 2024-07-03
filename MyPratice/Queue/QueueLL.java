package MyPratice.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLL {
    public static void main(String[] args) {
        Queue<Integer> cq = new LinkedList<>();
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.add(5);
        while (!cq.isEmpty()) {
            System.out.println(cq.peek());
            cq.poll();
        }

    }
}
