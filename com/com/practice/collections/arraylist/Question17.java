package com.practice.collections.arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Question17 {

    // 17. Set Implementations: HashSet vs TreeSet
    public static void main(String[] args) {

        hashSetOperations();
        treeSetOperations();
    }

    private static void treeSetOperations() {
        System.out.println("Inside treeSetOperations");
        TreeSet<String> treeSet = new TreeSet<String>((s1,s2) -> {
            int diff = s1.length() - s2.length();
            if(diff == 0)
                return s1.compareTo(s2);
            else
                return diff;
        });

        treeSet.add("one");
        treeSet.add("two");
        treeSet.add("three");
        treeSet.add("four");
        treeSet.add("five");

        for(String s: treeSet) {
            System.out.println(s);
        }

        TreeSet<Integer> integerTreeSet = new TreeSet<Integer>();
        integerTreeSet.add(12);
        integerTreeSet.add(1155);
        integerTreeSet.add(50);
        integerTreeSet.add(17);
        integerTreeSet.add(123);
        integerTreeSet.add(19);
        Integer ceiInteger = integerTreeSet.ceiling(90);
        Integer floor = integerTreeSet.floor(75);

        //While adding null values in TreeSet we get the NullPointer Exception.
        //integerTreeSet.add(null);

        System.out.println("Floor: " + floor);
        System.out.println("Ceiling: " + ceiInteger);
        System.out.println("Last: " + integerTreeSet.last() + " Poll Last: " + integerTreeSet.pollLast());


        for (Integer i : integerTreeSet) {
            System.out.println("i: " + i);
        }
    }

    private static void hashSetOperations() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("three");
        arrayList.add("fourty");
        //Duplicates: Only one value would be added.
        arrayList.add("fourty");
        arrayList.add("fifty");
        arrayList.add("twenty");
        arrayList.add(null);
        HashSet<String> hs = new HashSet<>(arrayList);

        hs.remove("fourty");
        for(String h : hs) {
            System.out.println(h);
        }

        //Removes all the items from the HashSet.
        hs.clear();

        //Check the .isEmpty()
        System.out.println("IsEmpty: " + hs.isEmpty());
    }

}
