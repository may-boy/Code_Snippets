package com.practice.collections.arraylist;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Question29 {

    // 26. Discuss the thread-safety of HashSet and TreeSet. How can you make them thread-safe?
    public static void main(String[] args) {

        implementThreadSafe();
    }

    private static void implementThreadSafe() {

        //This would ensure the thread safe environment.
        Set<String> hashSet = ConcurrentHashMap.newKeySet();

    }

}
