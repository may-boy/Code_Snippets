package com.practice.collections.arraylist;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Question18 {

    // 18. What is the difference between a List and a Set in Java?
    public static void main(String[] args) {

        implementList();
        implementSet();
    }

    private static void implementList() {
        List<String> shoppingList = new LinkedList<>();
        shoppingList.add("Milk");
        shoppingList.add("Curd");
        shoppingList.add("Cake");
        shoppingList.add("Milk");

        System.out.println("\nShopping List: ");
        for (String s : shoppingList) {
            System.out.println(s);
        }
    }

    private static void implementSet() {

        Set<String> shoppingSet = new HashSet<>();
        shoppingSet.add("Milk");
        shoppingSet.add("Curd");
        shoppingSet.add("Cake");
        shoppingSet.add("Milk");

        System.out.println("\nShopping Set: ");
        for (String s : shoppingSet) {
            System.out.println(s);
        }
    }

}
