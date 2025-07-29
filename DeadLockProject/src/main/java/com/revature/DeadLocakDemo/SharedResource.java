package com.revature.DeadLocakDemo;

public class SharedResource {
    void use() {
        System.out.println(Thread.currentThread().getName() + " is using the resource");
    }
}
