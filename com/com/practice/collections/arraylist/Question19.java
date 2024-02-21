package com.practice.collections.arraylist;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Question19 {

    // 19. How do you initialize a HashSet and a TreeSet?
    public static void main(String[] args) {

        implementHashSet();
        implementTreeSet();

    }

    private static void implementTreeSet() {

        Comparator<String> lengthComparator = Comparator.comparingInt(String::length);

        TreeSet<String> treeSet = new TreeSet<>(lengthComparator);

        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("grapes33");
        treeSet.add("Orange1");
        treeSet.add("Mango123");

        System.out.println("TreeSet: " + treeSet);

        System.out.println("\nPrinting using For loop: ");
        //Printing using for Loop.
        for (String s : treeSet) {
            System.out.println(s);
        }

        //Due to comparator used, if we add the same length of
        //String into the TreeSet then it will not append it and
        //Treat that value as a duplicate.

    }

    private static void implementHashSet() {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("grapes");

        System.out.println("HashSet: " + hashSet);

    }

}
