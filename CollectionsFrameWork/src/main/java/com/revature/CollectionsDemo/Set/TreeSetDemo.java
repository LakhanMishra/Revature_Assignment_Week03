package com.revature.CollectionsDemo.Set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        t.add(4);
        System.out.println(t);
    }
}
