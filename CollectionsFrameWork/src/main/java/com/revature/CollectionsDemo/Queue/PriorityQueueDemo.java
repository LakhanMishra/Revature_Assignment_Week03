package com.revature.CollectionsDemo.Queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(4);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
