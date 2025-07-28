package com.revature.CollectionsDemo.Map;

import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(1, "Hello");
        table.put(2, "World");
        System.out.println(table);

    }
}
