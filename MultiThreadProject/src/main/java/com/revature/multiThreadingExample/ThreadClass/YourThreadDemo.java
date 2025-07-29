package com.revature.multiThreadingExample.ThreadClass;

class YourThreadDemo extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i=0;i<10;i++) {
            System.out.println(i+" - "+t.getName());
        }
    }
}

class E {
    public static void main(String[] args) {
        YourThread x = new YourThread();

        x.setName("mohan");

        x.start();

        Thread t = Thread.currentThread();

        for(int i=0;i<10;i++) {
            System.out.println(i+" - "+t.getName());
        }
    }
}