package com.revature.DeadLocakDemo;

public class TaskOne extends Thread{
    final SharedResource resource1;
    final SharedResource resource2;

    TaskOne(SharedResource r1, SharedResource r2) {
        this.resource1 = r1;
        this.resource2 = r2;
    }

    public void run() {
        synchronized (resource1) {
            System.out.println("Thread-1 locked resource1");

            try { Thread.sleep(100); } catch (InterruptedException _) {}

            synchronized (resource2) {
                System.out.println("Thread-1 locked resource2");
                resource1.use();
                resource2.use();
            }
        }
    }
}
