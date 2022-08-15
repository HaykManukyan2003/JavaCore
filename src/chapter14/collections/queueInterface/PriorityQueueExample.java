package chapter14.collections.queueInterface;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(99);
        priorityQueue.add(6);
        priorityQueue.add(7);
        priorityQueue.add(10);
        priorityQueue.add(8);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());

        Queue<Integer> queue = new LinkedList<>();
    }
}
