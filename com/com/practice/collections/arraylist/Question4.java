package com.practice.collections.arraylist;

import java.util.LinkedList;

public class Question4 {

    // 4.What are the primary differences between ArrayList and LinkedList in terms of their data structures?
    public static void main(String[] args) {

        additionalMethods();

    }

    private static void additionalMethods() {
        LinkedList<String> names = new LinkedList<>();
        names.add("Diljot");
        names.add("Billa");
        names.addLast("Mayank");
        names.addFirst("Sahil");
        for(String name: names) {
            System.out.print(name + " ");
        }
    }
}
