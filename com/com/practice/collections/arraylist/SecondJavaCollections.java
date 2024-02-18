package com.practice.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class SecondJavaCollections {
    // 2.What is the Java Collections Framework and why is it important?
    public static void main(String[] args) {
        performOperation();
    }

    private static void performOperation() {
        // Initialize an ArrayList with some elements
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        arrayList.add("JavaScript");

        // Randomly access elements from the ArrayList
        System.out.println("First element: " + arrayList.get(0)); // Fast access
        System.out.println("Third element: " + arrayList.get(2)); // Fast access

        // Measure time taken for random access in the ArrayList
        long startTime = System.nanoTime();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i); // Random access
        }
        long endTime = System.nanoTime();
        long timeTaken = endTime - startTime;

        // Print out the time taken
        System.out.println("Time taken for random access in ArrayList: " + timeTaken + " ns");
    }
}
