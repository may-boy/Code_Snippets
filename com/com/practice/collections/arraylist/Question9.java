package com.practice.collections.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Question9 {

    // 9.How does the removal of elements from the middle of a list compare between ArrayList and LinkedList in terms of performance?

    public static void main(String[] args) {

        performOperation();

    }

    private static void performOperation() {
        // ArrayList removal
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            arrayList.add(i);
        }
        System.out.println("ArrayList before removal: " + arrayList);
        arrayList.remove(2); // Remove element at index 2
        System.out.println("ArrayList after removal: " + arrayList);

        // LinkedList removal
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            linkedList.add(i);
        }
        System.out.println("LinkedList before removal: " + linkedList);
        linkedList.remove(2); // Remove element at index 2
        System.out.println("LinkedList after removal: " + linkedList);
    }

}
