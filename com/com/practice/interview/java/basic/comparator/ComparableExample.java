package com.practice.interview.java.basic.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ComparableExample {

    //This class uses Comparable to compare the values.

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Alice",30));
        people.add(new Person("Chobbar",24));
        people.add(new Person("Gurman", 35));

        Collections.sort(people);
        for(Person person: people) {
            System.out.println("Person name: " + person.getName() + "Person age: " + person.getAge());
        }
    }

}
