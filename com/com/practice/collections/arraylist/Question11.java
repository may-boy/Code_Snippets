package com.practice.collections.arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question11 {

    // 11. Write a code snippet to convert an ArrayList to an array and vice versa.

    public static void main(String[] args) {

        convertToArrayList();
        convertToArray();

    }

    private static void convertToArrayList() {
        String[] number = {"1","2","2","3","4"};

        List<String> numbers = new ArrayList<>(Arrays.asList(number));
        System.out.println("Converted array to Arraylist: " + numbers);

    }

    private static void convertToArray() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Mayank");
        names.add("Sushil");
        names.add("Ankit");

        String[] arrayNames = names.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(arrayNames));
    }
}
