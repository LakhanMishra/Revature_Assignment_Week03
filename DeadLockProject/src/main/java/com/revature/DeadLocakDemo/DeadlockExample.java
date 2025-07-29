package com.revature.DeadLocakDemo;

public class DeadlockExample {
    public static void main(String[] args) {
        SharedResource resource1 = new SharedResource();
        SharedResource resource2 = new SharedResource();

        TaskOne t1 = new TaskOne(resource1, resource2);
        TaskTwo t2 = new TaskTwo(resource1, resource2);

        t1.start();
        t2.start();
    }
}
