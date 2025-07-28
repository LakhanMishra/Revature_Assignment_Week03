package com.revature.CollectionsDemo.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("One");
        set.add("Two");
        System.out.println(set);
        String s = set.getFirst();
        System.out.println(s);
    }
}
