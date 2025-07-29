package com.revature.multiThreadingExample.ThreadClass;

class YourThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        System.out.println(t.getName());
    }
}

class D {
    public static void main(String[] args) {
        YourThread x = new YourThread();

        x.setName("Golu");
        x.start();
        x.run();

        Thread t = Thread.currentThread();

        System.out.println(t.getName());
    }
}
