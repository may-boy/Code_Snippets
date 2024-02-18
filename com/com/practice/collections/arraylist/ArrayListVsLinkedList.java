package com.practice.collections.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {

        // 1.List Implementations: ArrayList vs LinkedList
        //listPerformanceComparison();

        anotherComparison();

    }

    private static void listPerformanceComparison() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        //Number of elements to add.
        int elementsToAdd = 1000;
        long startTime = System.nanoTime();
        System.out.println(startTime);

        //Add operation for ArrayList.
        for (int i = 0; i < elementsToAdd; i++) {
            arrayList.add(0, i);
        }
        long endTime = System.nanoTime();
        long arrayListTime = endTime - startTime;

        startTime = System.nanoTime();
        //Add operation for LinkedList.
        for (int i = 0; i < elementsToAdd; i++) {
            linkedList.add(0, i);
        }
        endTime = System.nanoTime();
        long linkedListTime = endTime - startTime;

        System.out.println("Time taken for ArrayList: " + arrayListTime);
        System.out.println("Time taken for LinkedList: " + linkedListTime);
    }

    private static void anotherComparison() {
        // Initialize ArrayList and LinkedList with some elements
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        int elementsToAdd = 10000; // Number of elements to add
        Random random = new Random();

        // Populate both lists with identical values
        for (int i = 0; i < elementsToAdd; i++) {
            int value = random.nextInt(Integer.MAX_VALUE);
            arrayList.add(value);
            linkedList.add(value);
        }

        // Measure time taken to randomly access 1000 elements in ArrayList
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int index = random.nextInt(elementsToAdd);
            arrayList.get(index); // Random access in ArrayList
        }
        long endTime = System.nanoTime();
        long arrayListTime = endTime - startTime;

        // Measure time taken to randomly access 1000 elements in LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int index = random.nextInt(elementsToAdd);
            linkedList.get(index); // Random access in LinkedList
        }
        endTime = System.nanoTime();
        long linkedListTime = endTime - startTime;

        // Print out the results
        System.out.println("Time taken for random access in ArrayList: " + arrayListTime + " ns");
        System.out.println("Time taken for random access in LinkedList: " + linkedListTime + " ns");
    }
}
