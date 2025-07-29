package com.revature.multiThreadingExample.ThreadClass;

public class ThreadDemo extends Thread{
    public void  run() {
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName());
    }
}

class ThreadMain  {
    public static void main(String[] args) {
        ThreadDemo t2 = new ThreadDemo();

        t2.start();

        t2.setName("A");

        Thread t1 = Thread.currentThread();

        System.out.println(t1.getName());
    }
}
