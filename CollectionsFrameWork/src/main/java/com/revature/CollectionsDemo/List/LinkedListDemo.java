package com.revature.CollectionsDemo.List;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        System.out.println(ls);
        ls.addFirst(8);
        System.out.println(ls);
    }
}
