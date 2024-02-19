package com.practice.collections.arraylist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Question13 {

    // 13. Explain the significance of the ListIterator and how it can be used with LinkedList.
    public static void main(String[] args) {

        performListIteratorOperation();

    }

    private static void performListIteratorOperation() {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Obtain a ListIterator
        ListIterator<String> iterator = linkedList.listIterator();

        // Iterate forward and print elements
        System.out.println("Iterating forward:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Iterate backward and print elements
        System.out.println("\nIterating backward:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

}
