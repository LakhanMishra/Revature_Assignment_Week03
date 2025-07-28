package com.revature.CollectionsDemo.Queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(4);
        System.out.println(deque);
        System.out.println(deque.element() + "-" + deque.element());
        System.out.println(deque);
    }
}
