package chapter14.collections.queueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        queue.add("d");
        queue.offer("e");
        System.out.println(queue);

        System.out.println(queue.remove());
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        //poll() does not throw exception;

    }
}
