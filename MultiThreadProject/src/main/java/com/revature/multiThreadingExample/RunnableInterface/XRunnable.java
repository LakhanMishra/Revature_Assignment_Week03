package com.revature.multiThreadingExample.RunnableInterface;

class XRunnable implements Runnable {
    public void run() {

        Thread t = Thread.currentThread();

        for(int i=0;i<10;i++) {
            System.out.println(i+" - "+t.getName());
        }
    }
}

class F {
    public static void main(String[] args) {
        XRunnable r = new XRunnable();

        Thread t = new Thread(r);
        t.setName("Tinku");
        t.start();

        Thread t1 = new Thread(r);
        t1.setName("Pinku");
        t1.start();

        Thread t2 = new Thread(r);
        t2.setName("Rinku");
        t2.start();

        Thread y = Thread.currentThread();

        for(int i=0;i<10;i++) {
            System.out.println(i+" - "+y.getName());
        }
    }
}