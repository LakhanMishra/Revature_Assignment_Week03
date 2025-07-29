package com.revature.multiThreadingExample.synchronization;

class Account {
    private int balance = 50;

    synchronized void withdraw() {
        balance = balance - 30;
    }

    synchronized int getBalance() {
        return balance;
    }
}

class TransactionRunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i=0;i<5;i++) {
            System.out.println(i+" - "+x.getName()+ " balance before withdrawal " +A.ac.getBalance());
            if(A.ac.getBalance()>=10) {
                try { Thread.sleep(100); } catch(InterruptedException e) { e.printStackTrace(); }
                A.ac.withdraw();
            }
            System.out.println(i+" - "+x.getName()+ " balance after withdrawal " +A.ac.getBalance());
        }
    }
}

class A {
    static Account ac = new Account();
    public static void main(String[] args) {
        TransactionRunnable r =
                new TransactionRunnable();

        Thread a = new Thread(r, "Golu");
        Thread b = new Thread(r, "Bholu");

        a.start();
        b.start();
    }
}