package com.practice.collections.arraylist;

import java.util.ArrayList;

public class Question8 {

    // 8.What happens when you try to add an element to a full ArrayList?
    public static void main(String[] args) {

        performNegativeScenario();

    }

    private static void performNegativeScenario() {
        ArrayList<Integer> numbers = new ArrayList<>(4);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);

        for(Integer n : numbers) {
            System.out.print(n + " ");
        }
    }
}
