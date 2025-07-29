package com.revature.multiThreadingExample.ThreadClass;

class AThread extends Thread {
    public void run() {
        Thread y = Thread.currentThread();

        for(int i=0;i<10;i++) {
            System.out.println(y.getName());
        }
    }
}

class L {
    public static void main(String[] args) throws InterruptedException {
        AThread x = new AThread();

        x.setName("Golu");

        x.start();

        Thread y = Thread.currentThread();

        for(int i=0;i<10;i++) {
            System.out.println(y.getName());
            Thread.sleep(2000);
        }
    }
}