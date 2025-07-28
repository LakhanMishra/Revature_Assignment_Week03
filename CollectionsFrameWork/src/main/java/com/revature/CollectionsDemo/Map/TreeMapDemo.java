package com.revature.CollectionsDemo.Map;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(2, "Two");
        map.put(1, "One");
        System.out.println(map); // Sorted by key
    }
}
