package com.practice.interview.java.basic.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {

        //This class uses NameComparator in order to compare the values in the list.
        List<Person> people = new ArrayList<>();
        people.add(new Person("Baljit", 23));
        people.add(new Person("Chobbar", 34));
        people.add(new Person("Abhay", 22));

        Collections.sort(people, new NameComparator());
        for (Person person : people) {
            System.out.println("Person Name: " + person.getName() + "Person Age: " + person.getAge());
        }
    }

}
