package com.practice.geeksforgeeks.dsa.arrays;

public class LargestElement {

    public static void main(String[] args) {

        int[] arr = {1,2,9,4,5,6};

        int a = largestElement(arr);
        System.out.println("a: " + a);
    }

    private static int largestElement(int[] arr) {

        int largestElemet = 0;

        for (int a: arr) {
            if(a > largestElemet)
                largestElemet = a;
        }

        return largestElemet;
    }

}
