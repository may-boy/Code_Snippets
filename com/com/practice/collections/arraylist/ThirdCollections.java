package com.practice.collections.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class ThirdCollections {

    // 3.How do you initialize an ArrayList and a LinkedList in Java?
    public static void main(String[] args) {

        initializeArrayList();
        initializeLinkedList();

    }

    private static void initializeArrayList() {
        // Initializing an ArrayList of integers
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        // Printing the ArrayList
        System.out.println("ArrayList: " + arrayList);
    }

    private static void initializeLinkedList() {
        // Initializing a LinkedList of strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Printing the LinkedList
        System.out.println("LinkedList: " + linkedList);
    }
}
